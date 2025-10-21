package com.demo.moda.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.moda.Calc1;

public class ModACase0130Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModACase0130Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 130;
        int out = new Calc1().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModACase0130Test");
    }
}
