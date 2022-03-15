package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.ArrayList;
import java.util.List;

public class Program extends AbstractASTNode {
    private List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions){
        super(line,column);
        this.definitions = new ArrayList<>(definitions);
    }

    public List<Definition> getDefinitions(){
        return new ArrayList<>(this.definitions);
    }

    @Override
    public String toString() {
        String definitionsStr = "";
        for(Definition def : definitions)
            definitionsStr += def.toString() + "\n";;
        return definitionsStr;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
