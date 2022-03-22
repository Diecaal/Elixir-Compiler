package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.sub.VariableDefinition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolTableTest {

    @Test
    void testInsert() {
        var st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(0, 0, null,"a");
        VariableDefinition definition2 = new VariableDefinition(0, 0, null,"a");

        assertTrue(st.insert(definition));
        assertEquals(0, definition.getScope());
        assertFalse(st.insert(definition));

        st.set();

        assertTrue(st.insert(definition2));
        assertEquals(1, definition2.getScope());
        assertFalse(st.insert(definition2));

        st.reset();

        assertFalse(st.insert(definition));
    }

    @Test
    void testFind() {
        SymbolTable st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(0, 0, null,"a");
        VariableDefinition definition2 = new VariableDefinition(0, 0, null,"b");

        assertTrue(st.insert(definition));
        assertNotNull(st.find("a"));
        assertNull(st.find("b"));

        st.set();

        assertTrue(st.insert(definition2));
        assertNotNull(st.find("a"));
        assertNotNull(st.find("b"));
        assertNull(st.find("c"));

        st.reset();

        assertNotNull(st.find("a"));
        assertNull(st.find("b"));
    }

    @Test
    void testFindInCurrentScope() {
        SymbolTable st = new SymbolTable();
        VariableDefinition definition = new VariableDefinition(0, 0, null,"a");
        VariableDefinition definition2 = new VariableDefinition(0, 0, null,"b");

        assertTrue(st.insert(definition));
        assertNotNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("b"));

        st.set();

        assertTrue(st.insert(definition2));
        assertNotNull(st.findInCurrentScope("b"));
        assertNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("c"));

        st.reset();

        assertNotNull(st.findInCurrentScope("a"));
        assertNull(st.findInCurrentScope("b"));
    }
}
