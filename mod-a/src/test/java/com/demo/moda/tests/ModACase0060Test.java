package com.demo.moda.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.moda.Calc0;

public class ModACase0060Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModACase0060Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 60;
        int out = new Calc0().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModACase0060Test");
    }
}
