package Aula8.Exemplos;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    static Scanner scanner = new Scanner (System.in);
    static String[] cabecalho = {"id", "nome", "telefone", "email"};
    static String[][] matrizCadastro = {{"", ""}};
    public static void main(String[] args) {
        matrizCadastro = cabecalho;

        String menu = """
                ________________________________________________
                |  ESCOLHA UMA OPÇÃO:                           |
                |       1 - EXIBIR CADASTRO COMPLETO            |
                |       2 - INSERIR NOVO USUÁRIO              |
                |       3 - ATUALIZAR CADASTRO POR ID           |
                |       4 - DELETAR CADASTRO POR ID             |
                |       5 - SAIR                                |
                |_______________________________________________|
                
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    exibirUsuario();
                    break;


                case 2:
                    cadastrarUsuario();

                    break;

                case 3:
                    atualizarUsuario();
                    break;

                case 4:
                    deletarUsuario();
                    break;

                case 5:
                    System.out.println("_________FIM DO PROGRAMA__________");
                    break;

                default:
                    System.out.println("Opcão invalida!!!");
            }
        } while (opcao != 5);

    }

    public static void exibirUsuario() {
        StringBuilder tabela = new StringBuilder();
        for (String[] linhas : matrizCadastro) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                int tamanhoColuna = colunas == 0 ? 5 : (colunas == 2 ? 10 : 25);
                tabela.append(String.format("%-" + tamanhoColuna + "s|", linhas[colunas]));

            }
            tabela.append("\n"); //PARA PULAR PRA PROXIMA LINHAA
        }
        System.out.println(tabela);

    }

    public static void cadastrarUsuario() {
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdUsuarios][cabecalho.length];

        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
        }

        System.out.println("Preencha os dados a seguir:");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {

            System.out.println("Cadastro da pessoa " + linha);

            System.out.println(cabecalho[0] + ": " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //Converte valor inteiro para String

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.next();
            }
        }
        matrizCadastro = novaMatriz;
    }

    public static void atualizarUsuario() {
        exibirUsuario();

        System.out.println("\n Digite o id do usuario para atualizar");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Atualize as informações a seguir: ");

        System.out.println(cabecalho[0] + " - " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.println(cabecalho[coluna] + ":  ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }
        exibirUsuario();
    }

    public static void deletarUsuario() {
        exibirUsuarios();
        System.out.println("\nDigite o Id do usuário que deseja deletar o registro: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.lenght - 1][cabeçalho.lenght];
        novaMatriz[0] = cabecalho;
        for (int linha = 1, idNovaMatriz = 1; linha < matrizCadastro.length; linha++) {
            if (linha == idEscolhido) {
                continue;

            }
            novaMatriz[idNovaMatriz] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);
            novaMatriz[idNovaMatriz][0] = String.valueOf(idNovaMatriz);
            idNovaMatriz++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso! :D");
        exibirUsuario();
        salvarDadosNoArquivo();
    }

    public static void SalvarDadosDoArquivo(){


    }

    public static void CarregarDadosNoArquivo(){
        if (!arquivoBancodeDados.exists()) {
            try {
                if (arquivoBancoDeDados.create);

            }
        }

    }




}
