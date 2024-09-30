package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
        assertEquals(15, calc.add(10,5));
    }

    @Test
    void add2() {
        Calculator calc = new Calculator();
        assertEquals(5.6, calc.add2(2.0,3.0), 0.5);
        assertEquals(10, calc.add2(8.1,1.9));
    }

    @Test
    void isEven() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(10));
    }
}