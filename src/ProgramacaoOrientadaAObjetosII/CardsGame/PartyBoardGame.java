package ProgramacaoOrientadaAObjetosII.CardsGame;

import java.util.ArrayList;

public class PartyBoardGame extends BoardGame {

    private final int NUMBERS_OF_PLAYERS = 5, NUMBERS_OF_DECKS = 5, NUMBERS_OF_CARDS = 80, CARDS_FIELDS = 34;
    private ArrayList<Boolean> attackCardsField;
    private ArrayList<Player> players;

    public PartyBoardGame() {
        this.players = new ArrayList<>(NUMBERS_OF_PLAYERS);
        this.attackCardsField = new ArrayList<>(CARDS_FIELDS);
        for (int i = 0; i < NUMBERS_OF_PLAYERS; i++) {
            this.players.add(new Player(i + 1));
        }
    }


    @Override
    public void insertNewDeck() {

    }

    @Override
    public void canPlayACard(GenericCard card, Player player) {

    }

    @Override
    public void checkIfHaveAWinner() {

    }
}
