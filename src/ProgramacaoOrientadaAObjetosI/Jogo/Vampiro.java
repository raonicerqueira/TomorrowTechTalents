package ProgramacaoOrientadaAObjetosI.Jogo;

public class Vampiro extends Inimigo {

    public Vampiro() {
        this.dano = 20;
        this.vida = 200;
    }

    @Override
    protected void atacar(Inimigo inimigo) {

        System.out.println("causou " + this.dano + " de dano");
        System.out.println("seu personagem está sangrando");
        inimigo.apanhar(TiposAtaques.PERFURANTE, dano);
    }

    @Override
    protected void apanhar(TiposAtaques tiposAtaques, int dano) {
        int danoRecebido = tiposAtaques == TiposAtaques.PERFURANTE ? dano * 2 : dano;
        System.out.println("recebeu " + danoRecebido + " de dano");
    }

    @Override
    protected void interagir() {
        System.out.println("O que é um homem?");
    }
}