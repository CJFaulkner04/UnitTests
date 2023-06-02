package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyNameIsTest {
    @DisplayName("Test nameIs() method")
    @Test
    void testNameIs() {
        assertEquals("My Name Is Carlos Faulkner", MyNameIs.nameIs());
    }
}
