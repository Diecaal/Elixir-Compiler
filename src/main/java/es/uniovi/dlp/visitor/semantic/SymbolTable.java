package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.sub.FunctionDefinition;
import es.uniovi.dlp.error.ErrorManager;

import java.util.*;

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
        table = new ArrayList<Map<String, Definition>>();
        table.add(new HashMap<String, Definition>());
    }

    public void set() {
        table.add(new HashMap<String, Definition>());
        scope++;
    }

    public void reset() {
        table.remove(scope);
        scope--;
    }

    public boolean insert(Definition definition) {
        if(findInCurrentScope(definition.getName()) == null) {
            definition.setScope(scope);
            table.get(scope).put(definition.getName(), definition);
            return true;
        }
        return false;
    }

    public Definition find(String id) {
        for(int currentScope=scope; currentScope>=0; currentScope--) {
            if(table.get(currentScope).get(id) != null) {
                return table.get(currentScope).get(id);
            }
        }
        return null;
    }

    public Definition findInCurrentScope(String id) {
        return table.get(scope).get(id);
    }
}
