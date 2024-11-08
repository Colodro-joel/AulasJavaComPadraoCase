package Aula4.Exemplos;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int x;

         System.out.println("digite um numero inteiro");
         x = scanner.NextInt();
         if (x >= 30) {
             System.out.println("esse numero é maior ou igual que 30");
         } else {
             System.out.println("esse numero é menor que 30");
         }
         scanner.close();
    }
}
