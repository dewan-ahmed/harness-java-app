package com.demo.moda.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.moda.Calc0;

public class ModACase0027Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModACase0027Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 27;
        int out = new Calc0().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModACase0027Test");
    }
}
