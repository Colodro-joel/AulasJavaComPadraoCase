package Aula4.Exemplos;

import java.util.Scanner();

public class Exemplo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de compra: ");
        float valorCompra = scanner.nextFloat();
        float valorTotal, desconto = 0.2f;

        ValorTotal = valorCompra > 100.0f ? valorCompra - valorCompra * desconto : valorCompra;

        System.out.println("O valor total da compra é: " + valorTotal);
        scanner.close();
    }
}
