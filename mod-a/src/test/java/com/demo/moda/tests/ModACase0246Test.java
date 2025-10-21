package com.demo.moda.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.moda.Calc2;

public class ModACase0246Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModACase0246Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 246;
        int out = new Calc2().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModACase0246Test");
    }
}
