package Aula5;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.println("Escolha uma opção:");
        System.out.println("\t1 - para a opção 1");
        System.out.println("\t2 - para a opção 2");
        System.out.println("\t3 - para a opção 3");
        System.out.println("\t4 - sair");

        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("voce escolheu a opcao 1");
                break;
            case 2:
                System.out.println("voce escolheu a opcao 2");
                break;
            case 3:
                System.out.println("voce escolheu a opcao 3");
                break;
            case 4:
                System.out.println("tchau");
            default:
                System.out.println("opção invalida");

        } while(opcao !=4);
    }

}
