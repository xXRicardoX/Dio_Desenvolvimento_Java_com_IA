package one.digitalinnovation.gof.strategy;

public class TesteStrategy {

    public static void main(String[] args) {
        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamentoStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setComportamentoStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamentoStrategy(defensivo);
        robo.mover();
        robo.mover();

    }
}
