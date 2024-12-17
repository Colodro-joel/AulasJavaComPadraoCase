package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean [8];
        int contadorverdade = 0;

        System.out.println("Digite 8 valores booleanos: ");

        for(int i = 0; i < valores.lenght; i++) {
            System.out.print("Valor " + (i +1) + ": ");
            valores[i] = scanner.nextBoolean();

            if(valores[i]) {
                contadorverdade++;
            }
        }
        System.out.println("Quantidade de valores verdadeiros: " + contadorverdade);

        scanner.close();

    }
}
