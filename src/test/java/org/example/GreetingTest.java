package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class GreetingTest {
    @DisplayName("Test greeting() method")
    @Test
    void testGreeting() {
        assertEquals("Hi Carlos", HiFriend.hiFriend("Carlos"));
    }
}
