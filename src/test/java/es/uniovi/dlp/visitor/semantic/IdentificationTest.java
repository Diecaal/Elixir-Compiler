package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorReason;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class IdentificationTest {

    @Test
    void duplicatedRecordField() {
        runCompiler("examples/errors/identification/duplicated_record_field.xana");
        assertFoundErrors(Arrays.asList(
                new Error(4, 5, ErrorReason.FIELD_ALREADY_DECLARED)
        ));
    }

    @Test
    void duplicatedVarDefinition() {
        runCompiler("examples/errors/identification/duplicated_var_declaration.xana");
        assertFoundErrors(Arrays.asList(
                new Error(1, 4, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(2, 1, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(4, 4, ErrorReason.VARIABLE_ALREADY_DECLARED)
        ));
    }

    @Test
    void duplicatedFunctionDefinition() {
        runCompiler("examples/errors/identification/duplicated_function_declaration.xana");
        assertFoundErrors(Arrays.asList(
                new Error(4, 1, ErrorReason.FUNCTION_ALREADY_DECLARED)
        ));
    }

    @Test
    void missingVarDefinition() {
        runCompiler("examples/errors/identification/missing_var_declaration.xana");
        assertFoundErrors(Arrays.asList(
                new Error(4, 5, ErrorReason.VARIABLE_NOT_DECLARED)
        ));
    }

    @Test
    void missingFunctionDefinition() {
        runCompiler("examples/errors/identification/missing_function_declaration.xana");
        assertFoundErrors(Arrays.asList(
                new Error(5, 5, ErrorReason.FUNCTION_NOT_DECLARED)
        ));
    }

    @Test
    void identificationErrors() {
        runCompiler("examples/errors/identification/several_errors.xana");
        assertFoundErrors(Arrays.asList(
                new Error(3, 7, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(6, 3, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(11, 15, ErrorReason.VARIABLE_NOT_DECLARED),
                new Error(12, 3, ErrorReason.FUNCTION_NOT_DECLARED)
        ));
    }
}