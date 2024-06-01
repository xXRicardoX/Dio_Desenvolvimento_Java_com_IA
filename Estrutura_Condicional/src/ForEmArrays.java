public class ForEmArrays {
    public static void main(String[] args) {
        // Em arrays o indice inicia em ZERO        
        String alunos[] = {"João", "Maria", "José", "Ana", "Pedro", "Paula"};

        // for(int i = 0; i < alunos.length; i++) {
        //     System.out.println("Aluno: " + alunos[i]);
        // }

        // Forma abreviada
        for(String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
