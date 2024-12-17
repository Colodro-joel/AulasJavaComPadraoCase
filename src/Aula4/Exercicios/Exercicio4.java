package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Vendeu quanto? R$ ");
        double valordasvendas = scanner.nextDouble();

        double comss;

        if (comss < 1000) {
            comss = valordasvendas * 0,05;
        } else if (valordasvendas >= 1000 && valordasvendas <= 5000) {
            comss = valordasvendas * 0,10;
        } else (valordasvendas > 5000) {
            comss = valordasvendas * 0,15;
        }
        System.out.println("O valor das vendas calculado é: " + comss);

        scanner.close();
    }
}
