package com.mycompany.poo.aula13.animais;

/**
 * Classe Abstrata
 * 
 * Toda classe abstrata somente será utilizada para molde
 * ou seja, não pode ser instanciada
 */
public abstract class Animal {

    private String nome;
    private double altura;
    private double peso;

    public Animal() {

    }

    public Animal(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    /**
     * O método som será implementado somente pelas classes que herdarem de animal
     */
    public abstract void som();

    public void respirar() {
        System.out.println("Respirando ...");
    };

    /**
     * Overload (Sobrecarga) o método mover possui 3 definições
     */
    public void mover() {
        System.out.println("Está se movendo ...");
    };

    public void mover(String direcao) {
        System.out.println("Está se movendo para o(a) " + direcao + " ...");
    };

    public void mover(String direcao, int distancia) {
        System.out.println("Está se movendo " + distancia + "km  para o(a) " + direcao + " ...");
    };

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
