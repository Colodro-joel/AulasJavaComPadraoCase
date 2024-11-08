package Aula2.Exercicios;

import java.util.Scanner;
import java.util.scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner();
        int idade = 0;
        float altura = 0;
        double peso = 0;
        int idade = scanner.nextLine();
        float altura = scanner.nextLine();
        double peso = scanner.nextLine();

        System.out.println("A idade é" + idade + "anos");
        System.out.println("A altura é" + altura );
        System.out.println("O peso é" + peso + "kg");

        scanner.close();

    }
}
