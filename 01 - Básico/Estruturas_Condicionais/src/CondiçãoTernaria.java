public class CondiçãoTernaria {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        String resultadoDois = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        System.out.println(resultadoDois);
    }
}
