package fibonacci;

/**
 * Fibonacci Main Joonas Hakkarainen 19.01.2020
 */

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        SequenceRange range = fibonacci.inputRange();
        fibonacci.fibonacciToFile(range.getStart(), range.getLength());
    }
}
