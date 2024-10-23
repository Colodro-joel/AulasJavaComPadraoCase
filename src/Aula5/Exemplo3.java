package Aula5;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para calculara a tabuada:");

        int x = scanner.nextInt();

        for (int multiplicador = 0;multiplicador <= 10; multiplicador++) {
                System.out.println(x + " x " + multiplicador+ " = " + x*multiplicador);
        }
        scanner.close();

    }
}
