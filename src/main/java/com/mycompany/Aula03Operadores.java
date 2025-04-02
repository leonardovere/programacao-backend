package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        /**
         * Tipos de Comentários
         */

        // Comentário de uma linha

        /**
         * Comentários de
         * múltiplas
         * linhas
         */

        /**
         * Declaração de variáveis
         */

        String var1; // Toda variável declarada sem valor, automaticamente é null,
        String var2 = null; // Variável declarada com valor null
        String var3 = ""; // Variável declarada com valor vazio (diferente de null)
        
        /**
         * Operadores Matemáticos
         */

        int num1 = 10;
        int num2 = 2;

        // Soma
        int soma = num1 + num2; 
        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

        // Subtração
        int subtracao = num1 - num2;
        System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtracao);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);

        System.out.println("------------------------------------------------------");

        /**
         * Operações lógicas
         */
        boolean val1 = true;
        boolean val2 = false;

        // Operador de Conjunção (&&)
        // Será verdadeiro se abas as condições forem verdadeiras
        boolean conjuncao = val1 && val2;
        System.out.println("A conjunção entre " + val1 + " e " + val2 + " é: " + conjuncao);

        // Operador de Disjunção (||)
        // Será verdadeiro se uma das condições for verdadeira
        boolean disjuncao = val1 || val2;
        System.out.println("A disjunção entre " + val1 + " e " + val2 + " é: " + disjuncao);
        
        // Operador de negação (!)
        // Ele inverte o valor da condição: Se era true, passa a ser false e vice-versa
        boolean negacao = val1 && !val2;
        System.out.println("A conjunção entre " + val1 + " e negação de " + val2 + " é: " + negacao);
    }
}