package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class RunIntrospector {

    public static void main(String... args) throws IOException {
        if (args.length < 1) {
            System.err.println("Please, pass me the input file.");
            return;
        }

        CharStream input = CharStreams.fromFileName(args[0]);
        XanaLexer lexer = new XanaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XanaParser parser = new XanaParser(tokens);

        Program ast = parser.program().ast;

        IntrospectorModel model = new IntrospectorModel("Program", ast);
        new IntrospectorTree("Introspector", model);
    }
}
