package edu.desu.datastructs.partA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScientificCalculatorTest {
    private ScientificCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new ScientificCalculator();
    }

    @Test
    public void testAdd() {
        double result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(4, 3);
        assertEquals(12, result, "4 * 3 should equal 12");
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(8, 2);
        assertEquals(4, result, "8 / 2 should equal 4");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    public void testSin() {
        double result = calculator.sin(Math.PI / 2);
        assertEquals(1, result, "sin(PI/2) should equal 1");
    }

    @Test
    public void testCos() {
        double result = calculator.cos(Math.PI);
        assertEquals(-1, result, "cos(PI) should equal -1");
    }

    @Test
    public void testTan() {
        double result = calculator.tan(0);
        assertEquals(0, result, "tan(0) should equal 0");
    }

    @Test
    public void testExponent() {
        double result = calculator.exponent(2, 3);
        assertEquals(8, result, "2 raised to the power 3 should equal 8");
    }

    @Test
    public void testLogarithm() {
        double result = calculator.logarithm(1);
        assertEquals(0, result, "log(1) should equal 0");
    }

    @Test
    public void testLogarithmOfZero() {
        assertThrows(ArithmeticException.class, () -> calculator.logarithm(0), "log(0) should throw ArithmeticException");
    }
}
