package Aula8.Exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomearquivo = "alunos.txt";

        try (FileWriter writer = new FileWriter(nomearquivo)) {
            for (int i = 0; i < 5; i++ ) {
                System.out.print("Digite o nome do aluno " + (i +1) + ": ");
                writer.write(nomealuno + "\n");
            }
            System.out.println("Nomes inseridos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar ou escrever no arquivo: " + e.getMessage());
        }
    }
}
