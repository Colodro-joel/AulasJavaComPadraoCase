package Aula8.Exemplos;

import java.io.*;

public class Exemplo2 {
    public static void main(String[] args) {
        File arquivo = new File();
        try {
            FileWriter fileWriter = new FileWriter(arquivo);
            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();

            FileReader fileReader = new FileReader(arquivo);
            int caracter;
            while ((caracter = fileReader.read())!= -1) {
                System.out.println((char) caracter);
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
