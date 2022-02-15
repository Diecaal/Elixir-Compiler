package es.uniovi.dlp.parser;

public class LexerHelper {
    public static int lexemeToInt(String lexeme) {
        try {
            return Integer.parseInt(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static double lexemeToReal(String lexeme) {
        try {
            return Double.parseDouble(lexeme);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static char lexemeToChar(String lexeme) {
        char result = Character.MIN_VALUE;

        if(lexeme.charAt(0) == '\\') {
            try { // ASCII code case
                String aux = lexeme.substring( 1 );
                result = (char) Integer.parseInt( aux );
            } catch(NumberFormatException e) { // Special char case
                switch (lexeme.charAt(1)){
                    case 'n':
                        result = '\n';
                        break;
                    case 't':
                        result = '\t';
                        break;
                    default:
                        System.err.println( "Invalid Character Literal" );
                }
                return result;
            }
        } else {
            result = lexeme.charAt(0);
        }
        return result;
    }

}
