package com.demo.modb.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.modb.Calc2;

public class ModBCase0219Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModBCase0219Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 219;
        int out = new Calc2().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModBCase0219Test");
    }
}
