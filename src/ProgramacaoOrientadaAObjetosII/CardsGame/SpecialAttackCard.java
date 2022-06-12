package ProgramacaoOrientadaAObjetosII.CardsGame;

public class SpecialAttackCard extends AttackCard implements ISpecialAttackCard{
    SpecialEffects effect;

    public SpecialAttackCard(String name, CardType type, int cost, int power, int resistance, SpecialEffects effect) {
        super(name, type, cost, power, resistance);
        this.effect = effect;
    }

    public void getEffect(){

    };
}
