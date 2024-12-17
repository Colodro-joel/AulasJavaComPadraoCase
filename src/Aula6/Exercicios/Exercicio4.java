package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite as 4 notas:");

        for (int i = 0; i < notas.lenght; i++) {
            System.out.print("Nota" + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.lenght;
        System.out.println("A média é: " + media);

        scanner.close();
    }
}
