package com.mycompany.avaliacao.primeiroTrimestre;

public class SolucaoAv1 {
    public static void main(String[] args) {
        //01
        int media = (46 + 45 + 20 + 9) / 4;
        System.out.println("A média de idade da família é: " + media);

        //02
        double raio = 25.0;
        double area = Math.PI * (raio * raio);
        System.out.println("A área do círculo é: " + area + "cm²");

        //03
        double percent1 = 15;
        double produto1 = 1200.00;
        double reajustado = produto1 + ((percent1 / 100) * produto1);
        System.out.println("O valor do produto após o reajuste, será de R$ " + reajustado);

        //04
        double percent2 = 30;
        double produto2 = 850.00;
        double descontado = produto2 - ((percent2 / 100) * produto2);
        System.out.println("O valor do produto com desconto, ficará por R$ " + descontado);
    }
}
