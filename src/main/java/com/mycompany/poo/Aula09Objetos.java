package com.mycompany.poo;

public class Aula09Objetos {
    public static void main(String[] args) {

        /**
         * O que é um objeto?
         * R: um objeto nada mais é do que algo, que possui caracteristicas e ações
         * 
         * Em Java, toda classe ou tipo abstrato é um objeto, e herdam funções da classe
         * java.lang.Object
         * É correto afirmar que java.lang.Object é superclass (Super classe) de
         * qualquer outra classe ou tipo abstrato
         */
        Integer numero = 10;

        // Retorna se a variável/classe é uma instância de outra classe
        System.out.println(numero instanceof Object);

        // Método compareTo pertence ao tipo abstrato Integer
        numero.compareTo(20);

        /**
         * Criando uma intância
         * 
         * Instanciar uma classe, significa criar mais um espaço na memória do computador para comportar ela
         * 
         * É como se estivessemos em uma montadora de automóveis, cada nova instância da classe é um
         * novo veículo pronto.
         */
        Carro carro1 = new Carro("Camaro", "Chevrolet");
        Carro carro2 = new Carro("Camaro", "Chevrolet");

        System.out.println(carro1 == carro2);

        System.out.println(carro1 instanceof Carro);
        System.out.println(carro1 instanceof Object);

        // Com as classes instanciadas, podemos mudar o valor dos atributos e utilizar as funções
        carro1.ano = 1969;
        carro1.quilometragem = 200000;

        carro1.andar(100);
        carro1.parar();
    }

    /**
     * Criado uma classe dentro de outra classe
     * 
     * é necessário utilizar a instrução static entre public e class
     */
    public static class Carro {
        // Atributos da classe
        String modelo;
        String marca;
        int ano;
        int quilometragem = 0;

        /**
         * Método construtor
         * 
         * ele é chamado quando criamos uma nova instância da classe
         * 
         * toda classe possui um construtor vazio, e podemos ter mais de um em uma classe
         */
        Carro(String modelo, String marca) {
            this.modelo = modelo;
            this.marca = marca;
        }

        // Ações da classe
        void andar(int km) {
            // this faz referência própria classe
            this.quilometragem += km;
            System.out.println("O carro está percorrendo " + km + " km");
        }

        void parar() {
            System.out.println("O veículo parrou !! e percorreu um total de " + this.quilometragem + " km");
        }
    }
}
