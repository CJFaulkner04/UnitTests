package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MethodReturnTypesTest {
    @DisplayName("Test methods")
    @Test
    void testReturnMethods() {
        assertEquals("String of text", MethodReturnTypes.text());
        assertEquals(5, MethodReturnTypes.num());
        assertEquals(false, MethodReturnTypes.bool());
    }
}
