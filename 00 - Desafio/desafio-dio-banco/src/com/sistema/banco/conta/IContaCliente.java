package com.sistema.banco.conta;

public interface IContaCliente {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IContaCliente contaDestino);

    void imprimirExtrato();
}
