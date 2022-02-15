package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class LexerTest {

    @Test
    void testMinimalLexer() {
        XanaLexer lexer = lexerForProgram("lexer/minimal_lexer_example");

        assertHasTokens(lexer, Arrays.asList(
                new LexicalInfo(1, 1, "123", XanaLexer.INT_CONSTANT, 123)
        ));
    }

    @Test
    void testSimpleLexer() {
        XanaLexer lexer = lexerForProgram("lexer/simple_lexer_example");

        assertHasTokens(lexer, Arrays.asList(
                new LexicalInfo(5, 5, "0", XanaLexer.INT_CONSTANT, 0),
                new LexicalInfo(5, 7, "123", XanaLexer.INT_CONSTANT, 123),
                new LexicalInfo(6, 5, "0", XanaLexer.INT_CONSTANT, 0),
                new LexicalInfo(6, 7, "12", XanaLexer.INT_CONSTANT, 12)
//                ,
//                new LexicalInfo(12, 5, "12.3", XanaLexer.REAL_CONSTANT, 12.3),
//                new LexicalInfo(12, 11, "2.", XanaLexer.REAL_CONSTANT, 2.0),
//                new LexicalInfo(12, 15, ".34", XanaLexer.REAL_CONSTANT, 0.34),
//                new LexicalInfo(13, 5, "34.12E-3", XanaLexer.REAL_CONSTANT, 0.03412),
//                new LexicalInfo(13, 15, "3e3", XanaLexer.REAL_CONSTANT, 3000.0),
//
//                new LexicalInfo(17, 5, "var1", XanaLexer.ID, "var1"),
//                new LexicalInfo(17, 11, "_var_1", XanaLexer.ID, "_var_1"),
//                new LexicalInfo(17, 19, "VAR_1_AB_2", XanaLexer.ID, "VAR_1_AB_2"),
//
//                new LexicalInfo(21, 5, "'a'", XanaLexer.CHAR_CONSTANT, 'a'),
//                new LexicalInfo(21, 10, "'b'", XanaLexer.CHAR_CONSTANT, 'b'),
//                new LexicalInfo(21, 15, "'.'", XanaLexer.CHAR_CONSTANT, '.'),
//                new LexicalInfo(21, 20, "'-'", XanaLexer.CHAR_CONSTANT, '-'),
//                new LexicalInfo(21, 25, "'~'", XanaLexer.CHAR_CONSTANT, '~'),
//                new LexicalInfo(22, 5, "'\\n'", XanaLexer.CHAR_CONSTANT, '\n'),
//                new LexicalInfo(22, 11, "'\\t'", XanaLexer.CHAR_CONSTANT, '\t'),
//                new LexicalInfo(23, 5, "'\\126'", XanaLexer.CHAR_CONSTANT, '~')
        ));
    }

    private static void assertHasTokens(XanaLexer lexer, List<LexicalInfo> expectedTokens) {
        failIfLexerHasErrors(lexer);

        if (expectedTokens.isEmpty()) {
            fail("There aren't expected tokens");
        }

        for (LexicalInfo expectedToken : expectedTokens) {
            Token token = lexer.nextToken();
            if (token.getType() == XanaLexer.EOF) {
                fail("Reached End Of File when expecting a new token");
            }

            expectedToken.assertIsEqual(token);
        }

        if (lexer.nextToken().getType() != XanaLexer.EOF) {
            fail("There are tokens at the end of the file that weren't expected");
        }
    }

    private static XanaLexer lexerForProgram(String programName) {
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

    private static void failIfLexerHasErrors(XanaLexer lexer) {
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                fail("The lexer found a syntax error: " + s);
            }
        });
    }
}
