package com.demo;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicMatrixTest {
    private static final long SLEEP_MS = Long.parseLong(System.getProperty("TEST_SLEEP_MS", "1000"));

    @TestFactory
    Stream<DynamicTest> generateManyPassingTests() {
        List<DynamicTest> tests = new ArrayList<>();
        // Generate 1200 passing tests; each sleeps to simulate work
        IntStream.range(0, 1200).forEach(i -> {
            tests.add(DynamicTest.dynamicTest("case-" + i, () -> {
                assertEquals(i, i);
                assertTrue(i >= 0);
                assertNotNull("ok");
                try { Thread.sleep(SLEEP_MS); } catch (InterruptedException ignored) {}
            }));
        });
        return tests.stream();
    }
}


