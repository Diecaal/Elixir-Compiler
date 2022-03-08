package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Compiler {
    private final String filename;
    private Program program;
    private boolean reportErrors = true;

    public Compiler(String filename) {
        this.filename = filename;
    }

    public void run() throws IOException {
        ErrorManager.getInstance().clearErrors();
        program = parse(filename);
        checkErrors();
    }

    private void checkErrors() {
        if (!reportErrors) return;

        ErrorManager errorManager = ErrorManager.getInstance();
        if (errorManager.hasErrors()) {
            errorManager.getErrors().forEach(System.err::println);
            System.exit(-1);
        }
    }

    public Program getProgram() {
        return program;
    }

    private Program parse(String file) throws IOException {
        CharStream input = CharStreams.fromFileName(file);
        XanaLexer lexer = new XanaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XanaParser parser = new XanaParser(tokens);

        return parser.program().ast;
    }

    public void setReportErrors(boolean reportErrors) {
        this.reportErrors = reportErrors;
    }
}

