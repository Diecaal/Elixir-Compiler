package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.types.Type;

public interface Definition {
    Type getType();
    String getName();
}
