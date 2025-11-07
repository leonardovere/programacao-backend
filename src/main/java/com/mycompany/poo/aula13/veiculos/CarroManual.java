package com.mycompany.poo.aula13.veiculos;

public class CarroManual implements Veiculo {

    @Override
    public void seguirEmFrente() {
        System.out.println("Pisar na embreagem, colocar na 1ª marcha e acelerar");
    }

    @Override
    public void estacionar() {
        System.out.println("Manobrar o veículo na vaga, pisar na embreagem, colocar na 1ª marcha e puxar o freio de mão");
    }

    @Override
    public void re() {
        System.out.println("Pisar na embreagem e colocar em marcha ré");
    }

}
