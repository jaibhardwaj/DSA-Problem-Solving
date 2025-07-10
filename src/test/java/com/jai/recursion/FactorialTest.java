package com.jai.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Factorial class.
 */
public class FactorialTest {

    /**
     * Tests the factorial method with a positive integer.
     */
    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5));
    }

    /**
     * Tests the factorial method with zero as input.
     */
    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    /**
     * Tests the factorial method with one as input.
     */
    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    /**
     * Tests the factorial method with a larger positive integer.
     */
    @Test
    void testFactorialOfLargeNumber() {
        assertEquals(3628800, Factorial.factorial(10));
    }
}

