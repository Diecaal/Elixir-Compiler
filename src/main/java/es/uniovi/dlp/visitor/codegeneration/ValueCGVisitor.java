package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Void, Void> {
    private final CodeGenerator cg;
    private final AddressCGVisitor addressVisitor;

    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressVisitor) {
        this.cg = cg;
        this.addressVisitor = addressVisitor;
    }
}
