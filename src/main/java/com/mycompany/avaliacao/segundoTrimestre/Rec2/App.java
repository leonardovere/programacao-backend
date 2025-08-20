package com.mycompany.avaliacao.segundoTrimestre.Rec2;

public class App {
    public static void main(String[] args) {
        // Criando duas contas
        ContaBancaria conta1 = new ContaBancaria(1, "João");
        ContaBancaria conta2 = new ContaBancaria(2, "Maria");

        // Operações
        conta1.depositar(500);
        conta1.mostrarSaldo();

        conta1.sacar(100);
        conta1.mostrarSaldo();

        conta1.transferir(conta2, 200);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();

        conta1.mostrarExtrato();
        conta2.mostrarExtrato();

        conta1.sacar(200);
        conta1.mostrarSaldo();

        conta1.fecharConta(); // Não fecha porque tem saldo
        conta1.sacar(200); // Sacar todo o saldo
        conta1.fecharConta(); // Agora fecha
    }
}