package ProgramacaoOrientadaAObjetosII.CardsGame;

public class AttackCard extends GenericCard implements IAttackCard {
    int power, resistance;

    public AttackCard(String name, String type, int cost, int power, int resistance) {
        super(name, type, cost);
        this.power = power;
        this.resistance = resistance;
    }

    public int getPower() {
        return power;
    }

    public int getResistance() {
        return resistance;
    }
}
