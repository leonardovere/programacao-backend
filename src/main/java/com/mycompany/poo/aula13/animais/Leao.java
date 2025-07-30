package com.mycompany.poo.aula13.animais;

public class Leao extends Animal {

    public Leao(String nome, double altura, double peso) {
        super(nome, altura, peso);
    }

    @Override
    public void som() {
        System.out.println("Rugindo ...");
    }
    
}
