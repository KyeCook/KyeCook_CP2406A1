import java.util.ArrayList;

/**
 * Created by ACfan on 29/09/2016.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void selectDealer() {
        //todo make random int

        dealerId = 1;
    }

    public void dealCards() {
        players = new STPlayer[numPlayers];

        for(STPlayer player : players){
            ArrayList<STCard>  card = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards();
        }
    }
}
