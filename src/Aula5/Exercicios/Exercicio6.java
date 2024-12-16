package Aula5.Exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int first = 0, second = 1;
        int cont = 0;
        int limit = 10;

        System.out.println("Os dez primeiros numeros de Fibonacci: ");

        while (cont < limit) {
            System.out.println(first + " ");

            int prox = first + second;
            first = second;
            second = prox;

            cont++;
        }


    }
}
