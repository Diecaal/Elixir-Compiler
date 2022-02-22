package es.uniovi.dlp.parser;

import org.junit.jupiter.api.Test;


import static es.uniovi.dlp.TestHelpers.parserForProgram;
import static es.uniovi.dlp.TestHelpers.silentParserForProgram;
import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    /**
     * The program should not be valid if there is no main function
     */
    @Test
    void testEmptyFile() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/empty").program());
    }

    /**
     * The program should be valid if there is just the main function
     */
    @Test
    void testOnlyMain() {
        parserForProgram("parser/only_main").program();
    }

    /**
     * The main function should not have return type
     */
    @Test
    void testInvalidMain() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/main_with_return_type").program());
    }

    /**
     * A program should be valid if there is just the main function and is not formatted properly
     */
    @Test
    void testOnlyMainNoFormat() {
        parserForProgram("parser/only_main_no_format").program();
    }

    /**
     * The main function can have var definitions
     */
    @Test
    void testMainWithVarDefinitions() {
        parserForProgram("parser/main_with_var_definitions").program();
    }

    /**
     * The main function can have statements
     */
    @Test
    void testMainWithStatements() {
        parserForProgram("parser/main_with_statements").program();
    }

    /**
     * The main function can have a mixed function body
     */
    @Test
    void testMainWithBody() {
        parserForProgram("parser/main_with_body").program();
    }

    /**
     * Variable identifiers cannot use reserved keywords as id
     */
    @Test
    void testInvalidVarDefinitions() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/keyword_var_definitions").program());
    }

    /**
     * Array variable definitions cannot use expressions as array size
     */
    @Test
    void testInvalidArrayVarDefinitions() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/var_definitions_array_index").program());
    }

    /**
     * A variable cannot be of type void
     */
    @Test
    void testInvalidVarType() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/var_definition_void").program());
    }

    /**
     * List of simple variable definitions
     */
    @Test
    void testSimpleVarDefinitions() {
        parserForProgram("parser/simple_var_definitions").program();
    }

    /**
     * All the variable definitions in this test should be valid
     */
    @Test
    void testComplexVarDefinitions() {
        parserForProgram("parser/complex_var_definitions").program();
    }

    /**
     * Some function definitions
     */
    @Test
    void testFunctionDefinitions() {
        parserForProgram("parser/function_definitions").program();
    }

    /**
     * Only primitive return types are allowed
     */
    @Test
    void testFunctionInvalidReturnType() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/function_non_primitive_return_type").program());
    }

    /**
     * Some expressions
     */
    @Test
    void testExpressions() {
        parserForProgram("parser/expressions").program();
    }

    /**
     * Some statements
     */
    @Test
    void testStatements() {
        parserForProgram("parser/statements").program();
    }


    /**
     * An if block cannot have var definitions
     */
    @Test
    void testVarDefinitionsInsideIf() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/var_definition_inside_if").program());
    }

    /**
     * A while block cannot have var definitions
     */
    @Test
    void testVarDefinitionsInsideWhile() {
        assertThrows(RuntimeException.class,
                () -> silentParserForProgram("parser/invalid/var_definition_inside_while").program());
    }

    /**
     * Function invocations
     */
    @Test
    void testFunctionInvocations() {
        parserForProgram("parser/function_invocations").program();
    }

    @Test
    void testBasicProgram() {
        parserForProgram("basic").program();
    }

    @Test
    void testFibonacci() {
        parserForProgram("real_examples/fibonacci").program();
    }

    @Test
    void testFizzbuzz() {
        parserForProgram("real_examples/fizzbuzz").program();
    }

    @Test
    void testInsertSort() {
        parserForProgram("real_examples/insert_sort").program();
    }
}
