import java.util.*;

/**
 * Created by ACfan on 29/09/2016.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;
    private int humanPlayerId;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
        dealerId = new Random().nextInt(numPlayers + 1);
    }

    public void selectHumanPlayer(){
        humanPlayerId = 0;
    }

    public STPlayer getHumanPlayer(){
        return players[humanPlayerId];
    }

    public void playGame() {
        boolean gameIsActive = true;
        while (gameIsActive){

            //todo setup players in correct order

            for(int indexPlayer = 0; indexPlayer < players.length; indexPlayer ++) {

                //todo check human player (polymorphism)


            }

//            showPlayerTurn();
        }
    }

    public void dealCards() {
        players = new STPlayer[numPlayers];
        for (int i = 0; i <numPlayers; ++i){
            players[i] = new STPlayer("Player" + i);

        }

        for(STPlayer player : players){
            ArrayList<STCard>  cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }
}
