package com.sistema.banco;

<<<<<<< HEAD
import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;

import java.util.ArrayList;
=======
import com.sistema.banco.conta.ContaCliente;

>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
import java.util.List;

public class ContaBanco {
    private String nome;
    private List<ContaCliente> contas;
<<<<<<< HEAD
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



=======

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaCliente> getContas() {
        return contas;
    }

    public void setContas(List<ContaCliente> contas) {
        this.contas = contas;
    }
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
}
