package com.demo.app.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.app.Calc1;

public class AppCase0155Test {
    @Test
    void test() throws Exception {
        System.out.println("Running AppCase0155Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 155;
        int out = new Calc1().identity(i);
        assertEquals(i, out);
        System.out.println("PASS AppCase0155Test");
    }
}
