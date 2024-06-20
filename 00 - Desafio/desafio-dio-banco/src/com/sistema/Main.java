package com.sistema;

<<<<<<< HEAD
import com.sistema.banco.ContaBanco;
=======
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
import com.sistema.banco.conta.Cliente;
import com.sistema.banco.conta.ContaCliente;
import com.sistema.banco.conta.tipo_contas.ContaCorrente;
import com.sistema.banco.conta.tipo_contas.ContaPoupanca;

public class Main {
<<<<<<< HEAD
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

=======

    public static void main(String[] args) {
        Cliente teste = new Cliente();
        teste.setNome("José");

        ContaCliente cc = new ContaCorrente(teste);
        ContaCliente poupanca = new ContaPoupanca(teste);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
>>>>>>> 733a75ae49ef2684715a510cf629d8783524673a
    }
}
