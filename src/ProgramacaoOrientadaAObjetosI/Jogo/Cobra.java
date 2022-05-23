package ProgramacaoOrientadaAObjetosI.Jogo;

public class Cobra extends Inimigo {

    public Cobra(){
        this.dano = 10;
        this.vida = 50;
    }

    @Override
    protected void atacar(Inimigo inimigo) {

        System.out.println("causou " + this.dano + " de dano");
        System.out.println("seu personagem está envenenado");
        inimigo.apanhar(TiposAtaques.PERFURANTE, dano);
    }

    @Override
    protected void apanhar(TiposAtaques tiposAtaques, int dano) {
        int danoRecebido = tiposAtaques == TiposAtaques.PANCADA ? dano * 2 : dano;
        System.out.println("recebeu " + danoRecebido + " de dano");
    }

    @Override
    protected void interagir() {
        System.out.println("Se você acender a chama a maldição acaba.");
    }
}
