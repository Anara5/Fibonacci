package Recursion;

import static Recursion.Fibonacci.fibonacci;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.println("fib(" + i + ") = " + fibonacci(i));
        }

        int fib1 = 1;
        int fib2 = 0;
        for (int i = 1; i <= n; i++) {
            int fib = fib1 + fib2;
            fib2 = fib1;
            fib1 = fib;
            //System.out.println("fib(" + i + ") = " + fib2);
        }
    }
}
