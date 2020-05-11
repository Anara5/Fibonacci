package Recursion;

import org.junit.jupiter.api.Test;

import static Recursion.Fibonacci.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void firstNumber(){
        assertEquals(1, fibonacci(1));
    }

    @Test
    void secondNumberIs1(){
        assertEquals(1, fibonacci(2));
    }

    @Test
    void thirdNumberIs2() {
        assertEquals(2, fibonacci(3));
    }

}
