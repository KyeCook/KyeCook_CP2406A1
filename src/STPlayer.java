import java.util.ArrayList;

/**
 * Created by ACfan on 29/09/2016.
 */
public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerId;

    public STPlayer(String playerId){
        this.playerId = playerId;
    }

    public void setCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public String toString(){
        return playerId + "\n\tYour Deck is: " + cards;
    }

    public ArrayList<STCard> playerDeck(){
        return cards;
    }
}
