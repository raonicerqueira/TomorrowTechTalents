package ProgramacaoOrientadaAObjetosII.CardsGame;

public class Player {
    private int lifePoints;
    int id;

    public Player(int id) {
        this.lifePoints = 100;
        this.id = id;
    }

    public int getLifePoints() {
        return lifePoints;
    }
}
