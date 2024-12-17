package Aula8.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        File arquivo = new File("src\\aula08\\exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo texto a ser criado no arquivo\n 01");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while((linha = bufferedReader.readLine())!=null) {
                System.out.println(linha);
            }
            bufferedReader.close();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
