package Aula8.Exemplos;

import java.io.File;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\aulasJava\\AulasJavaComPadraoCase\\src\\Aula8\\Exemplos\\Exemplo1.java");

        if(arquivo.exists()){
            System.out.println("O arquivo já existe");
        }else {
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso: "+arquivo.getName());
            }else {
                System.out.println("Arquivo não pode ser criado porque voce está fazendo coisa errada");
            }
        }
    }
}
