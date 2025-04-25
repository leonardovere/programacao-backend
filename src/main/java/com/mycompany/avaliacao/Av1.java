package com.mycompany.avaliacao;

public class Av1 {
    public static void main(String[] args) {
        // Ex01
        // Idades dos membros da família
        int pai = 46;
        int mae = 45;
        int filho = 20;
        int filha = 9;

        // Calculando a média de idade
        int mediaIdade = (pai + mae + filho + filha) / 4;

        // Exibindo o resultado
        System.out.println("A média de idade da família é: " + mediaIdade + " anos");

        // Ex02
        double raio = 25.0; // raio em cm
        double pi = 3.14; // valor de PI
        double area = pi * Math.pow(raio, 2); // cálculo da área

        System.out.println("A área do círculo é: " + area + " cm²");

        // Ex03
        // Preço original do produto
        double precoOriginal = 1200.00;

        // Percentual de reajuste
        double percentualReajuste = 15.0;

        // Cálculo do valor do reajuste
        double valorReajuste = (percentualReajuste / 100) * precoOriginal;

        // Novo preço do produto
        double novoPreco = precoOriginal + valorReajuste;

        // Exibindo o resultado
        System.out.println("Novo preço do produto: R$ " + novoPreco);

        // Ex04
        int precoOriginal2 = 850; // Preço original do produto
        int percentualDesconto = 30; // Percentual de desconto

        // Cálculo do novo preço após o desconto
        double novoPreco2 = precoOriginal2 - (precoOriginal2 * percentualDesconto / 100);

        // Exibindo o novo preço
        System.out.println("Novo preço do produto após o desconto: R$ " + novoPreco2);
    }
}