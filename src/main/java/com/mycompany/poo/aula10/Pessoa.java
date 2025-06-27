package com.mycompany.poo.aula10;

public class Pessoa {
    /**
     * Modificadores de Acesso
     * 
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso
     * para dar segurança a nossas classes.
     * 
     * Utilizamos elas como prefixo para:
     * - Classes
     * - Interfaces
     * - Atributos
     * - Métodos
     */
    public String nome; // Público, é visível em qualquer classe.
    protected int idade; // Protegido, é visivel para classes filhas (Herança).
    private double salario; // Privado, é visivel somente dentro da classe que o declara. 
    double altura; // Friendly ou Público, apesar de não estar vísivel, ele também é público.
    
    /**
     * Nomenclatura de métodos
     * 
     * Métodos/Funções indicam ações, e por padrão utilizamos verbos.
     * 
     * ex.: Correr, Andar, Caminhar.  
     */
    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);
    }
}
