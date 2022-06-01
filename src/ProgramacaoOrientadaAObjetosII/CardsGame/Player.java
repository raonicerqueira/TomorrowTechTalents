package ProgramacaoOrientadaAObjetosII.CardsGame;

public class Player {
    int lifePoints;
    int id;

    public Player(int id) {
        this.lifePoints = 100;
        this.id = id;
    }

    public int getLifePoints() {
        return lifePoints;
    }
}
