package basic.tabuada;

import java.util.Scanner;

public class Execucao {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("--------TABUADA--------");
        int num;
        System.out.print("Digite o número que deseja gerar a tabuada: ");
        try {
            num = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }
        gerarTabuada(num);
    }

    public static void gerarTabuada(int n){
        for (int i = 1; i <= n; i++){
            System.out.println(i + " x " + n + " = " + i * n);
        }
        return;
    }
}
