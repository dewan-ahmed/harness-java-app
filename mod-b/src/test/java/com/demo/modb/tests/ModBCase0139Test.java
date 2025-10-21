package com.demo.modb.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.demo.modb.Calc1;

public class ModBCase0139Test {
    @Test
    void test() throws Exception {
        System.out.println("Running ModBCase0139Test...");
        long sleepMs = Long.parseLong(System.getProperty("TEST_SLEEP_MS","0"));
        if (sleepMs > 0) Thread.sleep(sleepMs);
        int i = 139;
        int out = new Calc1().identity(i);
        assertEquals(i, out);
        System.out.println("PASS ModBCase0139Test");
    }
}
