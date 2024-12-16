package Aula5.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int pares = 0, impares = 0;

        for (int i = 1; i < 10; i++) {
            System.out.println("Digite o " + i + " numero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);

        scanner.close();
    }
}
