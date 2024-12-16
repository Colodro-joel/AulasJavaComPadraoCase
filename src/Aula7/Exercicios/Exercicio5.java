package Aula7.Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 5.1;
        double nota3 = 7.7;

        double media = calcmedia(nota, nota2, nota3);
        System.out.println("A média é: " + media);

        public static double calcmedia(double nota1, double nota2, double nota3) {
            return (nota1 + nota2 + nota3) / 3;
        }
    }
}
