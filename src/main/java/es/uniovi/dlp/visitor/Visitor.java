package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;

public interface Visitor<ReturnType, ParamType> {
    ReturnType visit(Program program, ParamType param);
}
