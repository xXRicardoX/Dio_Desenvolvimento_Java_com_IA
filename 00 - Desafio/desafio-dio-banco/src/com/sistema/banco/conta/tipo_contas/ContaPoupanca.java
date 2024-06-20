package com.sistema.banco.conta.tipo_contas;


import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;

public class ContaPoupanca extends ContaCliente {
<<<<<<< HEAD
    private double taxaDeJuros;


    public ContaPoupanca(String numero, Cliente cliente, double taxaDeJuros) {
        super(numero, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros(){
        double saldoAtual = getSaldo();
        double rendimento = saldoAtual * taxaDeJuros;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Número: " + getNumero());
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Taxa de Juros: " + (taxaDeJuros * 100) + "%");
    }

=======

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
}

