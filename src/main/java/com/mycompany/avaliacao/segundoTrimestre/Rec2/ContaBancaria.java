package com.mycompany.avaliacao.segundoTrimestre.Rec2;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private List<String> extrato;
    private boolean ativa;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
        this.ativa = true;
        extrato.add("Conta criada para " + titular + " (Número: " + numero + ")");
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    // Depósito
    public void depositar(double valor) {
        if (!ativa) {
            System.out.println("Conta está fechada. Não é possível depositar.");
            return;
        }
        if (valor > 0) {
            saldo += valor;
            extrato.add("Depósito de R$" + valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Saque
    public void sacar(double valor) {
        if (!ativa) {
            System.out.println("Conta está fechada. Não é possível sacar.");
            return;
        }
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add("Saque de R$" + valor);
        } else {
            System.out.println("Saque inválido! Verifique o valor e o saldo.");
        }
    }

    // Transferência
    public void transferir(ContaBancaria destino, double valor) {
        if (!ativa) {
            System.out.println("Conta está fechada. Não é possível transferir.");
            return;
        }
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            extrato.add("Transferência de R$" + valor + " para " + destino.getTitular());
        } else {
            System.out.println("Transferência inválida! Verifique o valor e o saldo.");
        }
    }

    // Mostrar Saldo
    public void mostrarSaldo() {
        System.out.println("Conta " + numero + " (" + titular + ") - Saldo: R$" + saldo);
    }

    // Extrato
    public void mostrarExtrato() {
        System.out.println("Extrato da conta " + numero + " (" + titular + "):");
        for (String operacao : extrato) {
            System.out.println(" - " + operacao);
        }
    }

    // Fechar Conta
    public void fecharConta() {
        if (saldo == 0) {
            ativa = false;
            extrato.add("Conta encerrada.");
            System.out.println("Conta " + numero + " foi encerrada com sucesso.");
        } else {
            System.out.println("Não é possível fechar a conta. Saldo deve estar zerado.");
        }
    }
}