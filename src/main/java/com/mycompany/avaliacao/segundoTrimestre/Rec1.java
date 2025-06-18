package com.mycompany.avaliacao.segundoTrimestre;

import java.util.Scanner;

public class Rec1 {
    public static void main(String[] args) {
         int numeros[] = new int[10];
        int maior = 0;
        int menor = 0;
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Dijite os 10 valores inteiros"+ (i + 1) + ": ");
            int numero = scan.nextInt();

            numeros[i] = numero;
            soma += numero;

            if (numero > maior ){
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }

        }
        double media = (double) soma / 10;

        System.out.println("A soma dos valores é " + soma);
        System.out.println("A média dos valores é " + media);
        System.out.println("O maor valor é " + maior );
        System.out.println("O menor valor é  " + menor );
    }
}
