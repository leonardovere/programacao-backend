package com.mycompany.poo.aula12;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Caio");
        Pessoa pessoa3 = new Pessoa(26);
        Pessoa pessoa4 = new Pessoa(1.87);
        Pessoa pessoa5 = new Pessoa("Leonardo", 1.75);

        // Chamando métodos sobrecarregados
        pessoa2.conversar();
        pessoa2.conversar("Inter é o melhor time do mundo");
        pessoa5.conversar("Só no teu sonho", pessoa2);
    }
}
