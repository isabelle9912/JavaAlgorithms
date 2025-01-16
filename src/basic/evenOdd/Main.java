package basic.evenOdd;

import java.util.Scanner;
public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program that identify if a number is even or odd");
        System.out.print("Type the number that you which: ");
        int num = Integer.parseInt(sc.nextLine());
        isEvenOrOdd(num);
    }
    private static void isEvenOrOdd(int n) {
        if((n % 2) == 0){
            System.out.println("The number " + n + " is even");
        } else {
            System.out.println("The number " + n + " is odd");
        }
    }
}