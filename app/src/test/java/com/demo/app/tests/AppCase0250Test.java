package com.demo.app.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.app.Calc2;

public class AppCase0250Test {
    @Test
    void test() throws Exception {
        System.out.println("Running AppCase0250Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 250;
        int out = new Calc2().identity(i);
        assertEquals(i, out);
        System.out.println("PASS AppCase0250Test");
    }
}
