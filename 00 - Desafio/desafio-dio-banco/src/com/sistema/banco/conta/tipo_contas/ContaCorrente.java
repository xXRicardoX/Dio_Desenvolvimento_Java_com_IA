package com.sistema.banco.conta.tipo_contas;

import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;

public class ContaCorrente extends ContaCliente {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
