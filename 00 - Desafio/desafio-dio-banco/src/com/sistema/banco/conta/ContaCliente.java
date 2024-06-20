package com.sistema.banco.conta;

<<<<<<< HEAD

public abstract class ContaCliente {
    private String numero;
    private double saldo;
    private Cliente cliente;

    public ContaCliente(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumero() {
=======
public abstract class ContaCliente implements IContaCliente {
    private static final int AGENCIA_PADRÂO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public ContaCliente(Cliente cliente) {
        this.agencia = ContaCliente.AGENCIA_PADRÂO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IContaCliente contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

<<<<<<< HEAD
    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public void transferir(ContaCliente contaDestino, double valor) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino.getNumero() + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada.");
        }

    }

    public abstract void imprimirExtrato();

=======
    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
}



