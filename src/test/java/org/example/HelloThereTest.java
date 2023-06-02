package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class HelloThereTest {
    @DisplayName("Test helloThere() method")
    @Test
    void testHelloThere() {
        assertEquals("Nice chatting with you! Goodbye!", HelloThere.helloThere());
    }
}
