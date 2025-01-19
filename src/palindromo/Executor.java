package palindromo;

import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa para verificar se uma palavra é um palíndromo.");
        System.out.print("Digite uma palavra ou frase: ");

        String word = sc.nextLine().trim(); // trim() serve para remover os espaços em branco no início e no final de uma String

        if (word.isEmpty()) {
            System.out.println("Erro: Entrada vazia. Por favor, digite uma palavra ou frase.");
            return;
        }

        // Remover espaços e caracteres não alfanuméricos, ignorar maiúsculas/minúsculas
        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (verifierWord(word)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static boolean verifierWord(String word) {
        int tamanho = word.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (word.charAt(i) != word.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
