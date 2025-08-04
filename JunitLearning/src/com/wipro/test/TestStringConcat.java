package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test; // ✅ Required for JUnit 4

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test // ✅ Tells JUnit to run this method as a test
    public void testDoStringConcat() {
        DailyTasks dt = new DailyTasks();
        String result = dt.doStringConcat("Hello", "World");
        assertEquals("Hello World", result);
    }
}
