package com.mycompany.poo.aula13.veiculos;

public class CarroAutomatico implements Veiculo {

    @Override
    public void seguirEmFrente() {
        System.out.println("Colocar em D e acelerar");
    }

    @Override
    public void estacionar() {
        System.out.println("Manobrar o veículo na vaga, colocar em P e puxar o freio de mão");
    }

    @Override
    public void re() {
        System.out.println("Colocar em R");
    }

}
