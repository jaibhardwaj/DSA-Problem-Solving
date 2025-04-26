package com.jai.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleProblemTest {

    @Test
    void testAddNumbers() {
        SampleProblem sp = new SampleProblem();
        assertEquals(5, sp.addNumbers(2, 3));
    }
}
