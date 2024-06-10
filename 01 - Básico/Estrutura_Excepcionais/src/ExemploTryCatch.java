import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        
        try{
            // Criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();

        }        
        catch(Exception e){
            System.out.println("O campo idade e altura precisam ser numéricos: " + e.getMessage());
        }
        finally{
            System.out.println("Fim do programa");

        }
  
        
    }

}
