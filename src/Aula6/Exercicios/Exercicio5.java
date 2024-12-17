package Aula6.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] nomes = {"Joel","Cristo","UFABC","Ju e Diego"};
        String nomeprocurado = falso;

        System.out.println("Digite o nome que deseja procurar: ");
        nomeprocurado = scanner.nextLine();

        for (int i = 0; i < nomes.lenght; i++) {
            if (nomes [i].equalsIgnoreCase(nomeprocurado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome" + nomeprocurado + "foi encontrador.");
        } else {
            System.out.println ("O nome " + nomeprocurado + "não foi encontrado");

            scanner.close();
        }


    }
}
