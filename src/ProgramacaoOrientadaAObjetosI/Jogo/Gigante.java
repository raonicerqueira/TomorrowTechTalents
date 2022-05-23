package ProgramacaoOrientadaAObjetosI.Jogo;

public class Gigante extends Inimigo {

    public Gigante(){
        this.dano = 25;
        this.vida = 300;
    }

    @Override
    protected void atacar(Inimigo inimigo) {

        System.out.println("causou " + this.dano + " de dano");
        System.out.println("seu personagem está atordoado");
        inimigo.apanhar(TiposAtaques.PANCADA, dano);
    }

    @Override
    protected void apanhar(TiposAtaques tiposAtaques, int dano) {
        int danoRecebido = tiposAtaques == TiposAtaques.FOGO ? dano * 2 : dano;
        System.out.println("recebeu " + danoRecebido + " de dano");
    }

    @Override
    protected void interagir() {
        System.out.println("Me desculpe");
    }
}
