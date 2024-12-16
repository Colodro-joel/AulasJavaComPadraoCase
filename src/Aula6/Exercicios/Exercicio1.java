package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[5];
        int soma = 0;

        System.out.println("Digite 5 numeros inteiros:");

        for (int i = 0; i < num.leght; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            num [i] = scanner.nextInt();
            soma += num[i];
        }

        System.out.println("A soma dos numeros é: " +soma);

        scanner.close();
    }
}
