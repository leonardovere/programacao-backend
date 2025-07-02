package com.mycompany.poo.aula12;

public class App {
    public static void main(String[] args) {
        // Criando várias instâncias da classe com construtores diferentes
        // essa é uma forma de sobrecarga (Overloading)
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("João");
        Pessoa pessoa3 = new Pessoa(15);
        Pessoa pessoa4 = new Pessoa(10000.0);
        Pessoa pessoa5 = new Pessoa("Carlos", 1.81);
    }
}
