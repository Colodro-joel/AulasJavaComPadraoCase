package Aula6.Exemplos;

public class Exemplo7 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        for (int linha = 0; linha < matrizNumeros.length; linha++); {
            for(int coluna = 0; coluna < matrizNumeros[0].length; coluna++) {
                System.out.println(matrizNumeros[linha][coluna]);
            }
        }
        String[][] matrizNomes = {{"Joel","Juliana"},{"Diego","Lucas"}};

        for (int linha = 0; linha < matrizNumeros.length; linha++); {
            for(int coluna = 0; coluna < matrizNumeros[0].length; coluna++) {
                System.out.println(matrizNumeros[linha][coluna]);
            }
        }

    }
}
