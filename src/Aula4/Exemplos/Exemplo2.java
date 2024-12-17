package Aula4.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cordoSemaforo;

//      System.out.println("Qual farol está ligado?");
        cordoSemaforo = scanner.next();
        if (cordoSemaforo.equals("verde") || cordoSemaforo.equals("verde")) {
            System.out.println("Siga");
        } else if(cordoSemaforo.equals("vermelho") || cordoSemaforo.equals("vermelho")) {
            System.out.println("Pare!");
        } else if (cordoSemaforo.equals("amarelo") || cordoSemaforo.equals("amarelo")) {
            System.out.println("Atenção");
        } else {
            System.out.println(+cordoSemaforo + " não é cor do semaforo");
        }
        Scanner.close();
    }

}


