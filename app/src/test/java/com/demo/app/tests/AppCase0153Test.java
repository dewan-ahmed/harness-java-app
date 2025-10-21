package com.demo.app.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.app.Calc1;

public class AppCase0153Test {
    @Test
    void test() throws Exception {
        System.out.println("Running AppCase0153Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 153;
        int out = new Calc1().identity(i);
        assertEquals(i, out);
        System.out.println("PASS AppCase0153Test");
    }
}
