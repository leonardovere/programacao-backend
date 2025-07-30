package com.mycompany.poo.aula13;

import com.mycompany.poo.aula13.animais.Gaviao;
import com.mycompany.poo.aula13.animais.Leao;
import com.mycompany.poo.aula13.geometria.Quadrado;
import com.mycompany.poo.aula13.geometria.Triangulo;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        System.out.println("O perímetro do quadrado é: " + quadrado.calcularPerimetro());
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());
        
        Triangulo triangulo = new Triangulo(5, 5, 5, 5);
        System.out.println("O perímetro do triangulo é: " + triangulo.calcularPerimetro());
        System.out.println("A área do triangulo é: " + triangulo.calcularArea());

        System.out.println("--------------------------------------");

        /**
         * Utilizando o construtor declarado na classe abstrata Animal
         */
        Leao leao = new Leao("Mufasa", 2.2, 135);
        leao.som();

        Gaviao gaviao = new Gaviao();
        gaviao.som();
    }
}
