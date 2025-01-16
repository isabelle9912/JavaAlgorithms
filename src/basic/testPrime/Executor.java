package basic.testPrime;

import java.util.ArrayList;

public class Executor {

    public static void main(String[] args) {
        int n = 2_000_003; // Test with a large prime number for better comparison

        // Measure time for the first approach
        long startTime1 = System.nanoTime();
        ArrayList<Integer> divisors1 = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisors1.add(i);
            }
        }
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Measure time for the second approach
        long startTime2 = System.nanoTime();
        ArrayList<Integer> divisors2 = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors2.add(i);
                if (i != n / i) {
                    divisors2.add(n / i);
                }
            }
        }
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Print results
        System.out.println("Time for approach 1 (full loop): " + duration1 + " nanoseconds");
        System.out.println("Time for approach 2 (square root): " + duration2 + " nanoseconds");

        // Optional: Compare divisor lists for correctness (should be empty since n is prime)
        System.out.println("Divisors for approach 1: " + divisors1);
        System.out.println("Divisors for approach 2: " + divisors2);
    }
}
