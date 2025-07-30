package com.mycompany.poo.aula13.animais;

public class Gaviao extends Animal {
    
    @Override
    public void som() {
        System.out.println("Croac ...");
    }

    /**
     * Sobreescrevendo e sobrecarregando os métodos de mover do animal
     * por ele se portar diferente. 
     */
    @Override
    public void mover() {
        System.out.println("Está voando ...");
    }

    @Override
    public void mover(String direcao) {
        System.out.println("Está voando para o(a) " + direcao + " ...");
    }

    @Override
    public void mover(String direcao, int distancia) {
        System.out.println("Está voando " + distancia + "km para o(a) " + direcao + " ...");
    }
}
