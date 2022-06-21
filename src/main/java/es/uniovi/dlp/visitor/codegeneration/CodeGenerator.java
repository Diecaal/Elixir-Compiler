package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import es.uniovi.dlp.ast.expressions.sub.CharLiteral;
import es.uniovi.dlp.ast.expressions.sub.DoubleLiteral;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.CharType;
import es.uniovi.dlp.ast.types.sub.DoubleType;
import es.uniovi.dlp.visitor.codegeneration.util.ReturnStatementDTO;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class CodeGenerator {
    private final OutputStreamWriter out;
    private boolean showDebug;

    private int currentLabel = 0;
    // Prevents line repetitions inside output .mp file
    private Stack<Integer> linesPrinted = new Stack<>();

    public CodeGenerator(OutputStreamWriter out, boolean showDebug) {
        this.out = out;
        this.showDebug = showDebug;
    }

    private void writeInstruction(String message, int ident) {
        if (ident == 0) {
            try {
                out.write(String.format("%s\n", message));
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            writeInstruction(message);
        }
    }

    public void writeInstruction(String message) {
        try {
            out.write(String.format("\t%s\n", message));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeComment(String comment, int ident) {
        if (ident == 0) {
            try {
                out.write(String.format("' %s\n", comment));
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            writeComment(comment);
        }
    }

    public void writeComment(String comment) {
        try {
            out.write(String.format("\t' %s\n", comment));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeLine(int line) {
        if(linesPrinted.isEmpty() || linesPrinted.peek() != line) {
            try {
                out.write(String.format("\n#line\t%d\n", line));
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            linesPrinted.push(line);
        }
    }

    private void write(String toWrite) {
        try {
            out.write(toWrite);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String requestLabel() {
        String label = String.format("label%s", currentLabel);
        currentLabel++;
        return label;
    }

    public void writeLabel(String label) {
        try {
            out.write(String.format("%s:\n", label));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSuffix(Type type) {
        if (type instanceof CharType)
            return "b";
        else if (type instanceof DoubleType)
            return "f";
        else
            return "i";
    }

    public String getArithmeticOperand(String operator) {
        return switch (operator) {
            case "+" -> "add";
            case "-" -> "sub";
            case "*" -> "mul";
            case "/" -> "div";
            case "%" -> "mod";

            default -> "Invalid operator";
        };
    }

    public String getRelationalOperand(String operator) {
        return switch (operator) {
            case ">" -> "gt";
            case "<" -> "lt";
            case ">=" -> "ge";
            case "<=" -> "le";
            case "==" -> "eq";
            case "!=" -> "ne";

            default -> "Invalid operator";
        };
    }

    public String getLogicalOperand(String operator) {
        return switch (operator) {
            case "&&" -> "and";
            case "||" -> "or";
            case "!" -> "not";

            default -> "Invalid operator";
        };
    }

    /**
     * Code generation used for implicit casting (var as type)
     * char <-> int <-> double
     * @param fromType
     * @param toType
     */
    public void convertTo(Type fromType, Type toType) {
        castIntermediate(fromType, toType);
    }

    /**
     * Code generation used for explicit casting
     * char -> int -> double
     * @param from
     * @param to
     */
    public void promote(Type from, Type to) {
        if (from.isPromotableTo(to))
            castIntermediate(from, to);
    }

    private void castIntermediate(Type from, Type to) {
        if (from.getClass().equals(to.getClass())) return;
        Type intermediate = from.getIntermediateType(to);
        writeInstruction(String.format("%s2%s", getSuffix(from), getSuffix(intermediate)));
        castIntermediate(intermediate, to);
    }

    public void source(String sourceFile) {
        this.write(String.format("\n#source \"%s\"\n\n", sourceFile));
    }

    public void callMain() {
        this.writeInstruction("\n");
        this.writeComment("Invocation to the main function", 0);
        this.writeInstruction("call main", 0);
        this.writeInstruction("halt", 0);
    }

    public void enter(int localBytes) {
        this.writeInstruction(String.format("enter\t%s", localBytes));
    }

    public void call(String name) {
        this.writeInstruction(String.format("call\t%s", name));
    }

    public void returnCG(ReturnStatementDTO param) {
        writeInstruction(String.format("ret\t%s, %s, %s", param.bytesReturn, param.bytesLocals, param.bytesParams));
    }

    public void variableDefinitionComment(VariableDefinition variableDefinition) {
        writeComment(String.format("%s :: %s (offset %s)",
                variableDefinition.getName(), variableDefinition.getType(), variableDefinition.getOffset())
        );
    }
}
