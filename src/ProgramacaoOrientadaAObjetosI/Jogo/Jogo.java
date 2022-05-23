package ProgramacaoOrientadaAObjetosI.Jogo;

public class Jogo {
    public static void main(String[] args) {
        Vampiro alucard = new Vampiro();
        Cobra ekans = new Cobra();
        Generico paracetamol = new Generico();
        Gigante golem = new Gigante();

        alucard.atacar(ekans);
        golem.apanhar(TiposAtaques.FOGO, 30);
        paracetamol.interagir();
    }
}
