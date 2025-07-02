package com.mycompany.poo.aula12;

public class Pessoa {
    /**
     * Construtores
     * 
     * Utilizamos o método construtor para inicializar nossas classes,
     * funcionando com uma configuração prévia da mesma.
     * 
     * Toda classe quando é criada, possui um método construtor vazio
     * que é chamado no momento que criamos uma instância da mesma.
     * 
     * Uma mesma classe pode conter mais de um método construtor,
     * e cada um deve ter um "nome" diferente, ou seja, com parâmetros diferentes.
     */
    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Construtor padrão
    // Todo construtor possui o mesmo nome da classe
    public Pessoa() {
        System.out.println("Construido com construtor 1");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Construido com construtor 2");
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Construido com construtor 3");
    }

    public Pessoa(double salario) {
        this.salario = salario;
        System.out.println("Construido com construtor 4");
    }

    // Não pode ter a mesma quantidade de parâmetros e tipos
    /* public Pessoa(double altura) {
      this.altura = altura;
      } */

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
        System.out.println("Construido com construtor 5");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
