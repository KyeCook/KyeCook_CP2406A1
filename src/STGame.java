import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Kye Cook on 29/09/2016.
 *
 *
 *
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerId;
    private STPlayer[] players;
    private STDeck deck;
    private int humanPlayerId;
    private int cardInPlay = 0;

    private int botPlayerId1;
    private int botPlayerId2;
    private int botPlayerId3;
    private int botPlayerId4;

    private List bots = new ArrayList(4);

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


    public void selectBotPlayer1(){
        this.botPlayerId1 = 1;
    }
    public void selectBotPlayer2(){
        this.botPlayerId2 = 2;
    }
    public void selectBotPlayer3(){
        this.botPlayerId3 = 3;
    }
    public void selectBotPlayer4(){
        this.botPlayerId4 = 4;
    }

    public STPlayer getBotPlayer1(){
        return players[botPlayerId1];
    }
    public STPlayer getBotPlayer2(){
        return players[botPlayerId2];
    }
    public STPlayer getBotPlayer3(){
        return players[botPlayerId3];
    }
    public STPlayer getBotPlayer4(){
        return players[botPlayerId4];
    }


    public void playGame() {
        boolean gameIsActive = true;
        int convertObjectToInteger;



        bots.add(botPlayerId1);
        bots.add(botPlayerId2);
        bots.add(botPlayerId3);
        bots.add(botPlayerId4);


        while (gameIsActive){

            for(int indexPlayer = 0; indexPlayer < players.length; indexPlayer ++) {
                /*
                This sets the winning condition of the game
                 */
                if(players[indexPlayer].playerDeck().size() == 0){
                    System.out.println("Player : " + indexPlayer + " has Won SuperTrumps!");
                    gameIsActive = false;
                    break;
                }
                /*
                This starts the players turn
                 */
                else if(indexPlayer == humanPlayerId){
                    System.out.println("----- Your Turn -----\n");
                    showPlayerTurn();
                }
                /*
                This ensures that each bot has their own turn and is dependant on the amount of bots present within game
                 */

                else{
                    convertObjectToInteger = Integer.parseInt(bots.get(indexPlayer - 1).toString());

                    System.out.println("----- Bots Turn -----\n");
                    showBotTurn(convertObjectToInteger);

                }
            }
        }
    }

    private void showPlayerTurn() {
        int selectedOption;
        int playerCardAmount = players[humanPlayerId].playerDeck().size();

        System.out.println(this.getHumanPlayer());

        Scanner userSelection = new Scanner(System.in);

        try {
            System.out.println("\nChoose a card to play [1-" + playerCardAmount +"] or pass [0] :");
            selectedOption = userSelection.nextInt();

            while(selectedOption < 0 || selectedOption > playerCardAmount){
                System.out.println("Choose a card to play [1-" + playerCardAmount +"] or pass [0] :");
                selectedOption = userSelection.nextInt();
            }

            if(selectedOption == 0){
                System.out.println("Turn Passed");
                ArrayList<STCard>  drawnCard = deck.dealCards(1);
                players[humanPlayerId].playerDeck().addAll(drawnCard);

                System.out.println(players[humanPlayerId].playerDeck());

            }
            else {
                System.out.println(players[humanPlayerId].playerDeck().get(selectedOption - 1) + "  is played");

                cardInPlay = players[humanPlayerId].playerDeck().get(selectedOption - 1).getId();

                players[humanPlayerId].playerDeck().remove(selectedOption - 1);


                System.out.println(players[humanPlayerId].playerDeck());

            }

        } catch(InputMismatchException e) {
            System.out.println("Incorrect input type. Please make sure valid integer is inputted");
            showPlayerTurn();
        }

        System.out.println("\nCard to Beat :" + cardInPlay + '\n');


    }

    private void showBotTurn(int botPlayerId) {
        System.out.println("This is bot no :" + botPlayerId + '\n');
        System.out.println(players[botPlayerId].playerDeck());
        System.out.println('\n');


        for(STCard card : players[botPlayerId].playerDeck()){
//            System.out.println(card + "\n");
//            System.out.println(card.getId());
        }

        System.out.println("\nCard to Beat :" + cardInPlay + '\n');

    }

    public void dealCards() {
        players = new STPlayer[numPlayers];
        for (int i = 0; i <numPlayers; ++i){
            players[i] = new STPlayer("Player " + i);

        }

        for(STPlayer player : players){
            ArrayList<STCard>  cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);

        }
    }
}
