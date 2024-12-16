package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        System.out.println("Digite o código do produto: ");
        int codigodoproduto = scanner.nextInt();

        switch (codigodoproduto) {
            case 1:
                System.out.println("Eletronicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuário");

            default:{
                System.out.println("Não existe categoria com esse código");
            }
        } scanner.close();
    }
}

