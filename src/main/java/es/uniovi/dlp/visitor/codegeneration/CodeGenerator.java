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
            out.write(message);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeComment(String comment) {
        try {
            out.write(String.format("'%s", comment));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeLine(int line) {
        try {
            out.write(String.format("#Line\t%d\n", line));
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
}
