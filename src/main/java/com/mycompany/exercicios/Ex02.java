package com.mycompany.exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");

        int numero = scan.nextInt();

        System.out.println("------ Tabuada do " + numero + " ------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        }

        System.out.println("--------------------------");
    }
}
