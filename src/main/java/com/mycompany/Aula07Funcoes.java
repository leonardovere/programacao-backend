package com.mycompany;

public class Aula07Funcoes {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("--- Tabuada do " + num + " ---");
        System.out.println(num + " x 1 = " + multiplicacao(num, 1));
        System.out.println(num + " x 2 = " + multiplicacao(num, 2));
        System.out.println(num + " x 3 = " + multiplicacao(num, 3));
        System.out.println(num + " x 4 = " + multiplicacao(num, 4));
        System.out.println(num + " x 5 = " + multiplicacao(num, 5));
        System.out.println(num + " x 6 = " + multiplicacao(num, 6));
        System.out.println(num + " x 7 = " + multiplicacao(num, 7));
        System.out.println(num + " x 8 = " + multiplicacao(num, 8));
        System.out.println(num + " x 9 = " + multiplicacao(num, 9));
        System.out.println(num + " x 10 = " + multiplicacao(num, 10));

        System.out.println("-----------------");
        System.out.println(num + "! = " + fatorial(num));
    }

    /**
     * Funções só podem ser declaradas fora de classes
     * 
     * Toda função deve ter um retorno, quando não há retorno utilizamos o void
     * 
     * Uma função pode ter um ou mais parâmetros
     * 
     */
    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Função Recursiva
     * 
     * uma função recursiva faz uma chamada para ela própria
     * porém, toda recursividade deve ter um ponto de parada, caso 
     */
    public static int fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n -1);
        } else {
            return 1;
        }
    }

    /**
     * Fatorial com if ternário
     * ele é divididido em:
     * - Operação lógica
     * - Resultado caso a operação lógica seja Verdadeira
     * - Resultado caso a operação lógica seja Falsa
     */
    public static int fatorialTernario(int n) {
        return (n != 0) ? n * fatorialTernario(n - 1) : 0;
    }
}
