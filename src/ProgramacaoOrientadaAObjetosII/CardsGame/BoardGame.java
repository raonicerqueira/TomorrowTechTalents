package ProgramacaoOrientadaAObjetosII.CardsGame;

import java.util.ArrayList;

public abstract class BoardGame {
    protected int playerCounter, deckCounter;
    protected ArrayList<GenericCard[]> decks = new ArrayList<>();
    protected ArrayList<Player> players = new ArrayList<>();

    protected boolean isThereABlankField(boolean[] fields) {
        for (boolean field : fields) {
            if (!field) {
                return true;
            }
        }
        System.out.println("There is no more blank fields to play");
        return false;
    }

    protected int getPositionOfTheBlankField(boolean[] fields) {
        int position = 0;
        for (boolean field : fields) {
            if (!field) {
                break;
            } else {
                position++;
            }
        }
        return position;
    }

    public abstract void insertNewDeck();

    public abstract void canPlayACard(GenericCard card, Player player);

    public abstract void checkIfHaveAWinner();
}
