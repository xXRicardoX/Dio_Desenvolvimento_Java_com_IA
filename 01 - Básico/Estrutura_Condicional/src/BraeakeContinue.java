public class BraeakeContinue {
    public static void main(String[] args) {
        // Exemplo de break
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("Break = " + i);
        }

        // Exemplo de continue
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println("continue = " + i);
        }
    }
}
