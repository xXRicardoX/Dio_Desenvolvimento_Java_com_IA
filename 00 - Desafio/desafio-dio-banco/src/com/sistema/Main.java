package com.sistema;

import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;
import com.sistema.banco.conta.tipo_contas.ContaCorrente;
import com.sistema.banco.conta.tipo_contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente teste = new Cliente();
        teste.setNome("José");

        ContaCliente cc = new ContaCorrente(teste);
        ContaCliente poupanca = new ContaPoupanca(teste);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
