package com.sistema.banco.conta.tipo_contas;

import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;

public class ContaCorrente extends ContaCliente {
<<<<<<< HEAD
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, Cliente cliente, double limiteChequeEspecial) {
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            double saldoAtual = getSaldo();
            super.depositar(limiteChequeEspecial); // Temporariamente adiciona o limite ao saldo
            boolean resultado = super.sacar(valor);
            super.depositar(-limiteChequeEspecial); // Remove o limite do saldo
            return resultado;
        } else {
            System.out.println("Saldo e limite de cheque especial insuficientes.");
            return false;
        }
=======

    public ContaCorrente(Cliente cliente) {
        super(cliente);
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
<<<<<<< HEAD
        System.out.println("Número: " + getNumero());
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Limite de Cheque Especial: R$ " + limiteChequeEspecial);
    }


=======
        super.imprimirExtrato();
    }
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
}
