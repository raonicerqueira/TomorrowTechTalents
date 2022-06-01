package ProgramacaoOrientadaAObjetosII.CardsGame;

import java.util.ArrayList;

public class VersusBoardGame extends BoardGame {

    private ArrayList<boolean[]> attackCardsField = new ArrayList<>(), specialAttackCardsField = new ArrayList<>();

    private ArrayList<Player> players = new ArrayList(2);

    private final int NUMBERS_OF_PLAYERS = 2, NUMBERS_OF_DECKS = 2, NUMBERS_OF_CARDS = 50, ATTACK_CARDS_FIELDS = 5,
            SPECIAL_ATTACKS_CARDS_FIELDS = 2;

    public VersusBoardGame() {
        for (int i = 0; i < NUMBERS_OF_PLAYERS; i++) {
            this.players.add(new Player(i + 1));
            this.attackCardsField.add(new boolean[ATTACK_CARDS_FIELDS]);
            this.specialAttackCardsField.add(new boolean[SPECIAL_ATTACKS_CARDS_FIELDS]);
        }
    }

    @Override
    public void insertNewDeck() {
        if (deckCounter < NUMBERS_OF_DECKS) {
            this.decks.add(new GenericCard[NUMBERS_OF_CARDS]);
            deckCounter++;
            System.out.println("Deck successfully inserted!");
        } else {
            System.out.println("You cannot insert more decks in this game mode");
        }
    }

    @Override
    public void canPlayACard(GenericCard card, Player player) {
        if (card instanceof SpecialAttackCard) {
            boolean[] field = this.specialAttackCardsField.get(player.id);
            if (isThereABlankField(field)) {
                field[getPositionOfTheBlankField(field)] = true;
            }
        } else if (card instanceof AttackCard) {
            boolean[] field = this.attackCardsField.get(player.id);
            if (isThereABlankField(field)) {
                field[getPositionOfTheBlankField(field)] = true;
            }
        }
    }

    @Override
    public void checkIfHaveAWinner() {
            for (Player player : this.players) {
                if (player.lifePoints <= 0) {
                    this.players.remove(player);
                    break;
                }
            }
            if (this.players.size() == 1){
                System.out.println("The player "+ this.players.get(0).id +" won the game");
        }
    }
}
