package ProgramacaoOrientadaAObjetosI.Jogo;

public abstract class Inimigo {

    int dano, vida;

    protected abstract void atacar(Inimigo inimigo);

    protected abstract void apanhar(TiposAtaques tiposAtaques, int dano);

    protected abstract void interagir();
}
