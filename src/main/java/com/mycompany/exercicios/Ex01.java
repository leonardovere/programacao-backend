package com.mycompany.exercicios;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * Exercícios sobre operadores
         * 
         * 1) Crie um programa que calcule e retorne a média de um aluno na disciplina de Física, 
         * Ele tirou as notas: 8, 6.7, 8.1, 9.4
         * 
         * 2) Faça o cálculo de IMC de um aluno, você deve guardar informações como Peso e Altura
         * e retornar o resultado.
         * 
         * 3) Faça um programa que retorne o valor do produto e o valor com desconto, 
         * para o exercício considere um desconto de 35%.
         */

        // 1)
        float soma = 8f + 6.7f + 8.1f + 9.4f;
        float media = soma / 4f;
        System.out.println("1) A média do aluno foi: " + media);

        // 2)
        double peso = 96.7;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        System.out.println("2) O IMC do aluno é: " + imc);

        // 3) 
        double produto = 120;
        double desconto = 35;
        double valorDescontado = produto - ((desconto / 100) * produto);
        System.out.println("3) O valor do produto é: R$ " + produto + ", e o valor com desconto é: R$" + valorDescontado); 
    }
}
