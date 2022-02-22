package es.uniovi.dlp;

import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class TestHelpers {
    public static XanaParser silentParserForProgram(String programName) {
        var lexer = lexerForProgram(programName);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        throwExceptions(lexer);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        var parser = new XanaParser(tokens);

        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        throwExceptions(parser);

        return parser;
    }

    public static XanaParser parserForProgram(String programName) {
        var lexer = lexerForProgram(programName);
        throwExceptions(lexer);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        var parser = new XanaParser(tokens);

        throwExceptions(parser);

        return parser;
    }

    public static XanaLexer lexerForProgram(String programName) {
        try {
            CharStream input = CharStreams.fromFileName(pathFor(programName));
            return new XanaLexer(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String pathFor(String programName) {
        return "examples/" + programName + ".xana";
    }

    public static void throwExceptions(XanaLexer lexer) {
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void throwExceptions(XanaParser parser) {
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int line, int column, String s, RecognitionException e) {
                if (e == null) {
                    throw new RuntimeException("The lexer found an error at line " + line + ", column " + column + ": " + s);
                }
                throw new RuntimeException(e);
            }
        });
    }
}
