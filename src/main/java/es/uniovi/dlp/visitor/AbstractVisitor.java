package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;

public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }
}
