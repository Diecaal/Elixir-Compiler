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

        // Remove first quote from the character
        String lexemeClean = lexeme.substring(1, lexeme.length()-1);

        if(lexemeClean.charAt(0) == '\\') {
            try { // ASCII code case
                String aux = lexemeClean.substring( 1 );
                result = (char) Integer.parseInt( aux );
            } catch(NumberFormatException e) { // Special char case
                switch (lexemeClean.charAt(1)){
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
            result = lexemeClean.charAt(0);
        }

        return result;
    }

    public static int lexemeToBool(String lexeme) {
        int result = -1;

        switch (lexeme) {
            case "true":
                result = 1;
                break;
            case "false":
                result = 0;
                break;
            default:
                System.err.println("Invalid Lexecem for boolean");
        }

        return result;
    }

}
