package Aula7.Exercicios;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int num = Scanner.nextInt();
        int result = dobrar(num);
        System.out.println("O dobro de " + numero + " é " + result);
    }

    public static int dobrar(int num) {
        return num * 2;
    }
}
