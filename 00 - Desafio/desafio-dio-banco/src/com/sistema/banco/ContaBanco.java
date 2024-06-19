package com.sistema.banco;

import com.sistema.banco.conta.ContaCliente;

import java.util.List;

public class ContaBanco {
    private String nome;
    private List<ContaCliente> contas;

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
}
