package com.mycompany.poo.aula13;

import com.mycompany.poo.aula13.animais.Animal;
import com.mycompany.poo.aula13.animais.Leao;

public class App {
    public static void main(String[] args) {
        Animal leao = new Leao("Mufasa", 2, 120);
        System.out.printf("%s é um animal da espécie Leão de %.1fm de altura, e pesa %.1fKg\n",
                leao.getNome(), leao.getAltura(), leao.getPeso());
    }
}
