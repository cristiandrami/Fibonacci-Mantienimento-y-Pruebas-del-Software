package org.cristiandrami.mps.fibonacciCalculatorTest;

import org.cristiandrami.mps.fibonacciCalculator.FibonacciCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @testcase
 * @precondition none
 * @postcondition the obtainedValues are equals to  expectedValues
 *
 * Test cases:
 * fibonacci 0 -> 0 *
 * fibonacci 1 -> 1 *
 * fibonacci 2 -> 1 *
 * fibonacci 10 -> 55 *
 * fibonacci 40 -> 102334155 *
 * fibonacci negative number  -> Throw new RuntimeException
 */

public class FibonacciCalculatorTest {

    private FibonacciCalculator fibonacciCalculator;


    @BeforeEach
    public void setup(){
        fibonacciCalculator= new FibonacciCalculator();
    }

    @Test
    public void shouldComputeReturnARuntimeExceptionIfNumberIsNegative(){
        assertThrows(RuntimeException.class, ()-> fibonacciCalculator.compute(-1));
    }

    @Test
    public void shouldComputeReturnZeroIfNumberIsZero(){
        long expectedValue=0;
        long obtainedValue= fibonacciCalculator.compute(0);
        assertEquals(expectedValue, obtainedValue);


    }
    @Test
    public void shouldComputeReturnOneIfNumberIsTwo(){
        long expectedValue=1;
        long obtainedValue= fibonacciCalculator.compute(2);
        assertEquals(expectedValue, obtainedValue);

    }
    @Test
    public void shouldComputeReturnFiftyFiveIfNumberIsTen(){
        long expectedValue=55;
        long obtainedValue= fibonacciCalculator.compute(10);
        assertEquals(expectedValue, obtainedValue);
    }


    @Test
    public void shouldComputeReturn102334155IfNumberIsForty(){

        long expectedValue=102334155;
        long obtainedValue= fibonacciCalculator.compute(40);
        assertEquals(expectedValue, obtainedValue);
    }

}