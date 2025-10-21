package com.demo.moda.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.moda.Calc3;

public class ModACase0341Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModACase0341Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 341;
        int out = new Calc3().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModACase0341Test");
    }
}
