package com.sistema.banco;

import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;

import java.util.ArrayList;
import java.util.List;

public class ContaBanco {
    private String nome;
    private List<ContaCliente> contas;
    private List<Cliente> clientes;

    public ContaBanco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente \" + cliente.getNome() + \" adicionado com sucesso.");
    }

    public void adicionarConta(ContaCliente conta){
        contas.add(conta);
        System.out.println("Conta " + conta.getNumero() + " adicionada com sucesso.");
    }

    public ContaCliente buscarConta(String numero){
        for(ContaCliente conta : contas){
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
        System.out.println("Conta não encontrada");
        return null;
    }

    public void imprimirRelatorio() {
        System.out.println("=== Relatório do Banco " + nome + " ===");
        System.out.println("Clientes: ");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }
        System.out.println("Contas: ");
        for (ContaCliente conta : contas) {
            conta.imprimirExtrato();
        }
    }



}
