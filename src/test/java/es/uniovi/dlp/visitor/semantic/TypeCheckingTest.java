package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorReason;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class TypeCheckingTest {

    @Test
    void invalidIndexing() {
        runCompiler("examples/errors/types/invalid_indexing.xana");
        assertFoundErrors(Arrays.asList(
                new Error(6, 20, ErrorReason.INVALID_INDEX_EXPRESSION),
                new Error(7, 19, ErrorReason.INVALID_INDEX_EXPRESSION),
                new Error(9, 10, ErrorReason.INVALID_INDEXING)
        ));
    }

    @Test
    void invalidCast() {
        runCompiler("examples/errors/types/invalid_cast.xana");
        assertFoundErrors(Arrays.asList(
                new Error(12, 10, ErrorReason.INVALID_CAST),
                new Error(13, 10, ErrorReason.INVALID_CAST)
        ));
    }

    @Test
    void invalidArithmetic() {
        runCompiler("examples/errors/types/invalid_arithmetic.xana");
        assertFoundErrors(Arrays.asList(
                new Error(9, 10, ErrorReason.INVALID_ARITHMETIC),
                new Error(11, 12, ErrorReason.INVALID_ARITHMETIC)
        ));
    }

    @Test
    void invalidLogical() {
        runCompiler("examples/errors/types/invalid_logical.xana");
        assertFoundErrors(Arrays.asList(
                new Error(10, 8, ErrorReason.NOT_LOGICAL),
                new Error(13, 11, ErrorReason.NOT_LOGICAL),
                new Error(17, 18, ErrorReason.NOT_LOGICAL),
                new Error(18, 19, ErrorReason.INVALID_LOGICAL),
                new Error(19, 19, ErrorReason.INVALID_LOGICAL)
        ));
    }

    @Test
    void invalidComparison() {
        runCompiler("examples/errors/types/invalid_comparison.xana");
        assertFoundErrors(Arrays.asList(
                new Error(12, 15, ErrorReason.INVALID_COMPARISON)
        ));
    }

    @Test
    void invalidStruct() {
        runCompiler("examples/errors/types/invalid_struct.xana");
        assertFoundErrors(Arrays.asList(
                new Error(5, 10, ErrorReason.NO_SUCH_FIELD),
                new Error(14, 10, ErrorReason.NO_SUCH_FIELD),
                new Error(17, 10, ErrorReason.NO_SUCH_FIELD),
                new Error(21, 10, ErrorReason.INVALID_DOT)
        ));
    }

    @Test
    void invalidAssignment() {
        runCompiler("examples/errors/types/invalid_assignment.xana");
        assertFoundErrors(Arrays.asList(
                new Error(9, 5, ErrorReason.INCOMPATIBLE_TYPES),
                new Error(10, 5, ErrorReason.INCOMPATIBLE_TYPES),
                new Error(11, 5, ErrorReason.INCOMPATIBLE_TYPES)
        ));
    }

    @Test
    void invalidReturnType() {
        runCompiler("examples/errors/types/invalid_return_type.xana");
        assertFoundErrors(Arrays.asList(
            new Error(2, 10, ErrorReason.INVALID_RETURN_TYPE),
            new Error(6, 12, ErrorReason.INVALID_RETURN_TYPE)
        ));
    }

    @Test
    void invalidInvocation() {
        runCompiler("examples/errors/types/invalid_invocation.xana");
        assertFoundErrors(Arrays.asList(
                new Error(10, 5, ErrorReason.INVALID_ARGS),
                new Error(13, 5, ErrorReason.INVALID_ARGS),
                new Error(14, 5, ErrorReason.INVALID_ARGS),
                new Error(17, 5, ErrorReason.INVALID_INVOCATION)
        ));
    }

    @Test
    void severalErrors() {
        runCompiler("examples/errors/types/several_errors.xana");
        assertFoundErrors(Arrays.asList(
                new Error(9, 5, ErrorReason.FIELD_ALREADY_DECLARED),
                new Error(13, 5, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(14, 12, ErrorReason.INVALID_RETURN_TYPE),
                new Error(17, 17, ErrorReason.VARIABLE_ALREADY_DECLARED),
                new Error(18, 12, ErrorReason.INVALID_RETURN_TYPE),
                new Error(21, 1, ErrorReason.FUNCTION_ALREADY_DECLARED),
                new Error(26, 5, ErrorReason.INCOMPATIBLE_TYPES),
                new Error(27, 5, ErrorReason.LVALUE_REQUIRED),
                new Error(28, 8, ErrorReason.LVALUE_REQUIRED),
                new Error(30, 8, ErrorReason.NO_SUCH_FIELD),
                new Error(33, 15, ErrorReason.INVALID_LOGICAL),
                new Error(35, 15, ErrorReason.INVALID_COMPARISON),
                new Error(37, 11, ErrorReason.NOT_LOGICAL),
                new Error(38, 12, ErrorReason.NOT_LOGICAL),
                new Error(39, 19, ErrorReason.NOT_LOGICAL),
                new Error(43, 5, ErrorReason.INVALID_ARGS),
                new Error(44, 5, ErrorReason.INVALID_ARGS),
                new Error(45, 5, ErrorReason.INCOMPATIBLE_TYPES),
                new Error(47, 5, ErrorReason.INVALID_INDEXING),
                new Error(48, 5, ErrorReason.INCOMPATIBLE_TYPES),
                new Error(49, 5, ErrorReason.INVALID_INDEXING)
        ));
    }
}
