package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.sub.CharLiteral;
import es.uniovi.dlp.ast.expressions.sub.DoubleLiteral;
import es.uniovi.dlp.ast.types.Type;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
    private final OutputStreamWriter out;
    private boolean showDebug;

    public CodeGenerator(OutputStreamWriter out, boolean showDebug) {
        this.out = out;
        this.showDebug = showDebug;
    }

    public void writeInstruction(String message) {
        try {
            out.write(String.format("\t%s\n", message));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
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
        try {
            out.write(String.format("\n#Line\t%d\n", line));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSuffix(Type type) {
        if(type instanceof CharLiteral)
            return "b";
        else if(type instanceof DoubleLiteral)
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


    public void convertTo(Type fromType, Type toType) {

    }
}
