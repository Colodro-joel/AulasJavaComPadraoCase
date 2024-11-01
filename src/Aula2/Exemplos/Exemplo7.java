package Aula2.Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {
        String texto = "Este texto na primeira linha\nEste texto esta na segunda linha" +
                "mesmalinha\nEste texto esta na terceira linha e espaçado com tabulação";
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade= scanner.nextInt();
        System.out.print("Digite seu nome:");
        scanner.nextLine();//concomeo /n que esta na memoria.
        String nome = scanner.nextLine();
        System.out.println("Seu nome é "+nome+" e tem "+idade+" anos");
    }
}
