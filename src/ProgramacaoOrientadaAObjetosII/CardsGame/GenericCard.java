package ProgramacaoOrientadaAObjetosII.CardsGame;

public abstract class GenericCard implements IGenericCard {
    String name;
    CardType type;
    int cost;

    public GenericCard(String name, CardType type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public CardType getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}
