package ProgramacaoOrientadaAObjetosI.Jogo;

public class Generico extends Inimigo {

    public Generico(){
        this.dano = 10;
        this.vida = 150;
    }

    @Override
    protected void atacar(Inimigo inimigo) {
        System.out.println("causou " + this.dano + " de dano");
    }

    @Override
    protected void apanhar(TiposAtaques tiposAtaques, int dano) {
        System.out.println("recebeu " + dano + " de dano");
    }

    @Override
    protected void interagir() {
        System.out.println("Por que eu responderia meu inimigo???");
    }
}
