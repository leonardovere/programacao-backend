package com.mycompany.avaliacao.segundoTrimestre;

public class Av1 {
    public static void main(String[] args) {

        // Soma dos pares valores da diagonal esquerda
        int matriz[][] = {
            { 4, 5, 9 },
            { 3, 2, 7 },
            { 4, 0, 5 }
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == 2) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal deu: " + soma);
    }
}
