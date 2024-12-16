package Aula7.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        double celsius = Scanner.nextInt();
        double fahrenheit = convertcelsiustofahrenheit(celsius);
        System.out.println(celsius + " graus Celsius equivalem a " +fahrenheit + "graus fahrenheit".);

    }

    public static double convertcelsiustofahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
