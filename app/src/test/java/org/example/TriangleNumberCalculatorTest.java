
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleNumberCalculatorTest {
    @Test void valueReturnsCorrectTriangleNumber() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(1, calculator.value(1));
        assertEquals(3, calculator.value(2));
        assertEquals(10, calculator.value(4));
    }

    @Test void addReturnsCorrectSum() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(2, calculator.add(1, 1));
        assertEquals(9, calculator.add(2, 3));
        assertEquals(13, calculator.add(4, 2));
    }

    @Test void subtractReturnsCorrectDifference() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(0, calculator.subtract(1, 1));
        assertEquals(-3, calculator.subtract(2, 3));
        assertEquals(7, calculator.subtract(4, 2));
    }
}
