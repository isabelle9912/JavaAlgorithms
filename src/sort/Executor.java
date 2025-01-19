package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program to sort a list of numbers");
        System.out.print("Enter the of the list: ");
        String input = sc.nextLine();

        // Remover espaços extras e dividir a string em um array
        String[] list = input.split(",");

        // Remover espaços ao redor da String
        for (int i = 0; i < list.length; i++){
            list[i] = list[i].trim();
        }

        // Ordenar em ordem crescente
        Arrays.sort(list);

        // Imprimir na tela a lista de números ordenados
        System.out.println(Arrays.toString(list));
    }
}
