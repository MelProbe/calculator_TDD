package com.melprobe.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.add(0,1));
        assertEquals(5632, calculator.add(4521,1111));
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(0,1));
        assertEquals(3410, calculator.subtract(4521,1111));
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0,1));
        assertEquals(5022831, calculator.multiply(4521,1111));
    }
    
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(0,1));
    }
}
