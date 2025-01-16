package basic.isPrimo;

import java.util.ArrayList;
import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program to verifier if a number is prime");

        System.out.print("Type a number integer: ");

        int num;

        try {
            num = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Please type an integer.");
            return;
        }

        if (num <= 1) {
            System.out.println("The number " + num + " is not prime!");
            return;
        }

        ArrayList<Integer> divisors = new ArrayList<>();
        if (isPrimo(num, divisors)) {
            System.out.println("The number " + num + " is prime!");
        } else {
            System.out.println("The number " + num + " is not prime!");
            System.out.println("Divisors: " + divisors);
        }
    }
    /**
     * Verifies if a number is prime.
     * @param n Number to be verified.
     * @param divisors List to store divisors of the number if it's not prime.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrimo(int n, ArrayList<Integer> divisors) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                divisors.add(i);
//                if (i != n / i) {
//                    divisors.add(n / i);
//                }
//            }
//        }
        for (int i = 2; i < n; i++){
            if(n % i == 0){
                divisors.add(i);
            }
        }
        return divisors.isEmpty();
    }
}
