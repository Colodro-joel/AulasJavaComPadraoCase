package Aula4.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora que trabalhou: ");
        double valorhora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horastrabalhadas = scanner.nextDouble();

        double horaextra = valorhora * 1.5;

        if (horastrabalhadas > 44) {
            double horasExtras = horastrabalhadas - 44;
            double valorTotalDasHorasExtras = horasExtras * horaextra;

            System.out.print("O valor das horas extras a serem pagas é: R$ " + valorTotalDasHorasExtras);
        }
        scanner.close();
    }
}
    }

}
