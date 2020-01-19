package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * FibonacciTests Joonas Hakkarainen 19.01.2020
 */
public class FibonacciTests {

    /* Test that getstart returns the same value that was input */
    @Test
    public void getStartTest() {
        SequenceRange range = new SequenceRange(2, 10);
        assertEquals(2, range.getStart(),
                "The getStart method should return start number of the created sequence range");
    }

    /* Test that getLength returns the same value that was input */
    @Test
    public void getLengthTest() {
        SequenceRange range = new SequenceRange(2, 10);
        assertEquals(10, range.getLength(), "The getLength method should return length of the created sequence range");
    }

    /* Test that verifyInput verifies valid input */
    @Test
    public void verifyInputTestTrue() {
        Fibonacci fibonacci = new Fibonacci();
        boolean expected = true;
        assertEquals(expected, fibonacci.verifyInput(2, 10),
                "The verifyInput method should check that input is positive integer and length > start and return true");
    }

    /* Test that verifyInput method identifies invalid input */
    @Test
    public void verifyInputTestFalse() {
        Fibonacci fibonacci = new Fibonacci();
        boolean expected = false;
        assertEquals(expected, fibonacci.verifyInput(2, -10),
                "The verifyInput method should check that input is positive integer and length > start and return false if not");
    }

    /* Test that produced fibonacci sequence matches expected output */
    @Test
    public void countFibonacciTestValid() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertEquals(expected, fibonacci.countFibonacci(1, 10),
                "The countFibonacci method should produce fibonacci sequence of input length and starting from input index");
    }

    /*
     * Test that produced fibonacci sequence starting from third number doesn't
     * match the default sequence
     */
    @Test
    public void countFibonacciTestInvalid() {
        Fibonacci fibonacci = new Fibonacci();
        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertNotEquals(expected, fibonacci.countFibonacci(3, 10),
                "The countFibonacci method should produce fibonacci sequence of input length and starting from input index");
    }

}
