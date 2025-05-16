package com.mycompany.exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------ Cálculo de IMC ------");
        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("\nDigite sua altura: ");
        double altura = scan.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("\nSeu IMC é %.1f, ", imc);

        if (imc < 16) {
            System.out.println("Você está com Magreza Grau III");
        } else if (imc < 17) {
            System.out.println("Você está com Magreza Grau II");
        } else if (imc < 18.5) {
            System.out.println("Você está com Magreza Grau I");
        } else if (imc < 25) {
            System.out.println("Você está com Peso Ideal");
        } else if (imc < 30) {
            System.out.println("Você está com Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Você está com Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Você está com Obesidade Grau II");
        } else {
            System.out.println("Você está com Obesidade Grau III");
        }

        System.out.println("\n----- Programa encerrado !! -----");

        scan.close();
    }
}
