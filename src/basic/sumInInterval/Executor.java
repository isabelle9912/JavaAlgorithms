package basic.sumInInterval;

import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program to sum a interval of an number");
        System.out.print("Enter the number you want to know the sum of 1 to it: ");
        int num;

        try {
            num = Integer.parseInt(sc.nextLine());

            if(num < 0){
                System.out.println("The number must be a integer positive!!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please, try again!.");
            return;
        }

        int count = 1;

        for (int i = 2; i <= num; i++) count += i;

        System.out.println("The sum of interval between 1 and " + num + " is: " + count);
    }
}
