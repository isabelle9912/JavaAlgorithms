package intermediary.sort;

import java.util.Arrays;
import java.util.Scanner;

/*
Implemente um algoritmo que ordena uma lista de números fornecidos pelo usuário (ex.: Bubble Sort ou Insertion Sort).
 */

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Program to intermediary.sort a list of numbers");
        System.out.print("Enter the list: ");
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
