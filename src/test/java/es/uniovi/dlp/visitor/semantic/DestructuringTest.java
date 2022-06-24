package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;

public class DestructuringTest {

    @Test
    void showFileWithErrors() {
        runCompiler("examples/errors/destructuring.xana");

//        assertFoundErrors(Arrays.asList(
//                new Error(6, 20, ErrorReason.INVALID_INDEX_EXPRESSION),
//                new Error(7, 19, ErrorReason.INVALID_INDEX_EXPRESSION),
//                new Error(9, 10, ErrorReason.INVALID_INDEXING)
//        ));
    }

    @Test
    void showFileCorrect() {
        runCompiler("examples/destructuring.xana");

//        assertFoundErrors(Arrays.asList(
//                new Error(6, 20, ErrorReason.INVALID_INDEX_EXPRESSION),
//                new Error(7, 19, ErrorReason.INVALID_INDEX_EXPRESSION),
//                new Error(9, 10, ErrorReason.INVALID_INDEXING)
//        ));
    }

}
