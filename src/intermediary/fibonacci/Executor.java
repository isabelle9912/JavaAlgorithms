package intermediary.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Program to make fibonacci sequence");
        System.out.print("Enter the number of elements you wish to make fibonacci sequence: ");
        int n = sc.nextInt();
        fibonacciSequence(n);
    }

    public static void fibonacciSequence(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + ", " + b);
        for(int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
