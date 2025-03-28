package com.mycompany;

public class Aula01Variaveis {
    public static void main(String[] args) {
        // Varíavel lógica

        // Tipo primitivo
        boolean valorLogicoPrimitivo = true;
        // Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato
        Boolean valorLogicoAbstrato = false;
        // Exibe com texto
        System.out.println("O valor da varíavel valorLogicoAbstrato é: " + valorLogicoAbstrato);

        // Variáveis inteiras

        // Tipo primitivo
        int valorInteiro = 10; // 32bits
        long valorInteiroLongo = 10L; // 64bits

        // Tipo abstrato
        Integer valorInteiroAbs = 20;
        Long valorLongoAbs = 20L;

        System.out.println("O valor de valorInteiro é: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLongo);

        // Variáveis Decimais

        // Tipo primitivo
        float numeroFloat = 10.5f; // 32bits
        double numeroDouble = 10.5; // 64 bits

        //Tipo abstrato
        Float numeroFloatAbs = 10.5f;
        Double numeroDoubleAbs = 10.5;

        System.out.println("O valor de numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: " + numeroDouble);
    }    
}
