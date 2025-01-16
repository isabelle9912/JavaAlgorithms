package basic.factorial;

import java.util.Scanner;

public class Execucao {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa para calcular fatorial de um inteiro");

        System.out.print("Digite um número inteiro não negativo: ");
        int num;

        try {
            num = Integer.parseInt(sc.nextLine());
            if (num < 0) {
                System.out.println("O fatorial não está definido para números negativos.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        System.out.println("O fatorial de " + num + " é: " + calcFatorial(num));
    }

    public static int calcFatorial(int n) {
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
