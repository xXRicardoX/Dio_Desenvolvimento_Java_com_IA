package com.sistema;


import com.sistema.banco.ContaBanco;

import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;
import com.sistema.banco.conta.tipo_contas.ContaCorrente;
import com.sistema.banco.conta.tipo_contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        ContaBanco banco = new ContaBanco("Banco Digital");

        Cliente cliente1 = new Cliente("Alice", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bob", "987.654.321-00");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        ContaCliente contaCorrente = new ContaCorrente("001", cliente1, 1000.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("002", cliente2, 0.01);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        contaCorrente.imprimirExtrato();

        contaPoupanca.depositar(1000.0);
        contaPoupanca.renderJuros();
        contaPoupanca.imprimirExtrato();

        banco.imprimirRelatorio();
    }
}

