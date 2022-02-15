package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.Token;

import static org.junit.jupiter.api.Assertions.assertEquals;

public record LexicalInfo(int line, int column, String lexeme, int tokenKey, Object semanticValue) {

    public void assertIsEqual(Token token) {
        assertEquals(this, toLexicalInfo(token));
    }

    private static LexicalInfo toLexicalInfo(Token token) {
        return new LexicalInfo(token.getLine(), token.getCharPositionInLine() + 1,
                token.getText(), token.getType(), getSemanticValue(token));
    }

    private static Object getSemanticValue(Token token) {
        return switch (token.getType()) {
            case XanaLexer.INT_CONSTANT -> LexerHelper.lexemeToInt(token.getText());
            default -> token.getText();
        };
    }
}
