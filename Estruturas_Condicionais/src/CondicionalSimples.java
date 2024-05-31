public class CondicionalSimples {

    public static void main(String[] args) {
        // Exercicio de Caixa Eletronico
        double saldo = 25.0;
        double valorSolicitado = 17.00;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println("O seu saldo atual é: " + saldo);
    }

}
