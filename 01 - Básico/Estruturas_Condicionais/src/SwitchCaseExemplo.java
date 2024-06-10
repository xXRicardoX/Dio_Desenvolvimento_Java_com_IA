public class SwitchCaseExemplo {
    public static void main(String[] args) {
        String plano = "B"; //M /T

        switch (plano) {
            case "T":{
                System.out.println("Gb Youtube");
            }

            case "M":{
                System.out.println("Whats e Intagram Grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }

            default:
                System.out.println("Valor indefinido!!");               
                break;
        }
    }
}
