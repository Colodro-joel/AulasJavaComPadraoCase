package Aula6.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = new String[6];
        String letra;
        boolean encontrado = falso;
        System.out.println("Digite 6 caracteres:");
        for(int i = 0; i < caracteres.lenght; i++) {
            if (caracteres[i].equalsIgnoreCase(letra)){
                System.out.println("A letra " + letra + " foi encontrada na posição " + (i + 1) + ".");
                encontrado = verdade;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("A letra" + letra + "não foi encontrada no vetor.");
        }
    }
}
