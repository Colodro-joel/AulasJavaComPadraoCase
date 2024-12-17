package Aula4.Exemplos;

import java.util.Scanner;
import java.util.scanner;

public class Exemplo3 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int idade;

          System.out.println("");
          idade = Scanner.nextInt();

          if (idade <= 12 && idade >0) {
              System.out.println("Voce é criança");
          } else if (idade >= 13 && idade <= 17) {
              System.out.println("Tu é adolescente");

          } else if ( idade >= 18 && idade <= 64) {
              System.out.println("Voce é adulto");

          } else {
              System.out.println("O senhor ou a senhora é idoso");
          }
          scanner.close();


    }
}
