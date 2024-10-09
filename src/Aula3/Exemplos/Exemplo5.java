package Aula3.Exemplos;
import java.util.Scanner;
public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        long varLong = numero;
        float varFloat = numero;
        double varDouble= numero;

        System.out.println("O numero que voce digitou é: "+numero);
        System.out.println("VarLong = "+varLong);
        System.out.println("VarFloat = "+varFloat);
        System.out.println("VarDouble = "+varDouble);

        System.out.println("Digite um numero decimal: ");
        varFloat = scanner.nextFloat();
        System.out.println("O numero que voce digitou é: "+varFloat);

        varFloat = (float) varDouble;
        System.out.println("O numero que voce digitou é: "+varDouble);

        System.out.println("O numero que voce digitou é: "+numero);
    }
}
