package intermediary.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Escreva funções para buscar um elemento em uma lista usando os métodos de busca linear e binária.
 */

public class Executor {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program to search a number in a list");
        System.out.print("Enter the list: ");
        String input = sc.nextLine();

    }

    public static void linearSearch(String[] arr) {}

    public static void binarySearch(String[] arr) {}

    public static String[] sortList(String string) {
        // Remover espaços extras e dividir a string em um array
        String[] list = string.split(",");

        // Remover espaços ao redor da String
        for (int i = 0; i < list.length; i++){
            list[i] = list[i].trim();
        }

        // Ordenar em ordem crescente
        Arrays.sort(list);
        return list;
    }
}
