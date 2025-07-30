package com.mycompany.poo.aula13.geometria;

/**
 * Para implementarmos os métodos presentes em uma interface,
 * utilizamos a definição implements.
 * 
 * Ex.: classe Joystick implementa Controle
 * 
 * Toda classe pode conter uma ou mais interfaces
 */
public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Override (Sobrescrita) é quando um método implementado/declarado
     * será sobrescrito pela classe que o implementa.
     */
    @Override
    public double calcularPerimetro() {
        return lado + lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
