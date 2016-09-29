import java.util.ArrayList;

/**
 * Created by ACfan on 29/09/2016.
 */
public class STDeck {
    private static final int NUM_CARDS_INITIALLY = 60;
    private ArrayList<STCard> cards;

    //TODO List of all cards,

    public STDeck() {
       cards = new ArrayList<STCard>();

        for (int i = 0; i < NUM_CARDS_INITIALLY; i++) {
             cards.add(new STCard());
            // google how to create random array of integers
        }
    }

    public ArrayList<STCard> dealCards(int i) {
        return null;
    }
}
