package es.uniovi.dlp.commandline;

import es.uniovi.dlp.compiler.Compiler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

public class CLI {

    public static void main(String[] args) {
        switch (args.length) {
            case 1:
                runProgram(args[0]);
                break;
            case 2:
                switch (args[1]) {
                    case "--introspector":
                        introspectProgram(args[0]);
                        break;
                    default:
                        help();
                }
                break;
            default:
                help();
        }
    }

    private static void runProgram(String file) {
        try {
            new Compiler(file).run();
        } catch (Exception e) {
            System.err.println("Failed to run the program:");
            System.err.println(e.getMessage());
        }
    }

    private static void introspectProgram(String file) {
        try {
            Compiler compiler = new Compiler(file);
            compiler.run();
            IntrospectorModel model =
                    new IntrospectorModel("Program", compiler.getProgram());
            new IntrospectorTree("Introspector", model);
        } catch (Exception e) {
            System.err.println("Failed to run the program:");
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }

    private static void help() {
        System.out.println("usage: xana file.xana [options]");
        System.out.println("Options");
        System.out.println(" --introspector\tLaunch the introspector");
    }
}
