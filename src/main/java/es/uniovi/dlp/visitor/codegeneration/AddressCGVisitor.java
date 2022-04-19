package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.sub.CharLiteral;
import es.uniovi.dlp.ast.expressions.sub.DoubleLiteral;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.ast.types.sub.IntType;

public class AddressCGVisitor {
    private final CodeGenerator cg;

    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }


}
