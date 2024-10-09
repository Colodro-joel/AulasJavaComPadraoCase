package Aula3.Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int varInt = scanner.nextInt();
        System.out.println("digite um numero inteiro"+varInt);
        short varShort = (short) varInt;
        System.out.println("varShort = "+varShort);
        byte varByte = (byte) varShort;
        System.out.println("varByte = "+varByte);

        System.out.print("Digite um numero decimal: ");
        double varDouble = scanner.nextDouble();
        System.out.println("Voce digitou o numero: "+varDouble);
        float varFloat = (float) varDouble;
        System.out.println("varFloat = "+varFloat);

        varInt = (int) varFloat;
        System.out.println("varInt ="+varInt);
    }
}
