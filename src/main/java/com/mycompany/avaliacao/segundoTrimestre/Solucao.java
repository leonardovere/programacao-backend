package com.mycompany.avaliacao.segundoTrimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Solucao {
    public static void main(String[] args) {
        /**
         * Faça um programa que faça a leitura de 10 valores inteiros e adicione a uma
         * lista,
         * no final da execução, deve exibir:
         * - A soma dos valores
         * - A média dos valores
         * - Qual o maior e menor valor
         * - Qual o valor que mais se repete
         */
        Scanner scan = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();

            numeros[i] = numero;
        }

        scan.close();

        System.out.println("Você digitou os seguintes números: " + Arrays.toString(numeros));
        System.out.println("A soma dos valores deu: " + soma(numeros));
        System.out.println("A média dos valores deu: " + media(numeros));
        System.out.println("O maior valor é: " + maior(numeros));
        System.out.println("O menor valor é: " + menor(numeros));
        System.out.println("O valor mais frequente é: " + moda(numeros));
    }

    public static int maior(int[] numeros) {
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static int menor(int[] numeros) {
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];

            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int media(int[] numeros) {
        int media = soma(numeros) / numeros.length;

        return media;
    }

    public static int soma(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static int moda(int[] numeros) {
        int frequente = numeros[0];
        int ocorrencias = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int numeroOcorrencias = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numero == numeros[j]) {
                    numeroOcorrencias++;
                }
            }

            if (numeroOcorrencias > ocorrencias) {
                ocorrencias = numeroOcorrencias;
                frequente = numero;
            }
        }

        return frequente;
    }
}
