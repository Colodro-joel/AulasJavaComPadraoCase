package Aula4.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String corSemafaro;
        System.out.println("qual é a cor que está?: ");
        corSemafaro = scanner.nextLine();

        switch (corSemafaro) {
            case "verde", "Verde":
                System.out.println("Siga");
                break;

            case "vermelho:", "Vermelho":
                System.out.println("Pare!");
                break;

            case "amarelo:", "Amarelo":
                System.out.println("Atenção");
                break;
            default:
                System.out.println(corSemafaro + "não existe no semáforo");
        }

        scanner.close();
    }
}

