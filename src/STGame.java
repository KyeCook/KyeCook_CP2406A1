import java.util.*;

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
    private int[] botPlayerIds = {1,2,3,4,5};


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


    public void selectBotPlayers(){
//        botPlayerIds = new int[]{1,2,3,4};

        for(int i = 1; i < numPlayers; ++i){
            botPlayerIds[i] = i - 1;
            System.out.println(botPlayerIds[i]);
        }

    }

    public STPlayer getBotPlayer() {


        for(int player : botPlayerIds){
            return players[player];
        }
        return null;
    }


    public void playGame() {
        boolean gameIsActive = true;

        while (gameIsActive){
            //todo setup players in correct order

            for(int indexPlayer = 0; indexPlayer < players.length; indexPlayer ++) {
                //todo check human player (polymorphism)
                if(indexPlayer == humanPlayerId){
                    System.out.println("THIS IS A HUMAN");
                    showPlayerTurn();
                }
                else{
                    System.out.println("This is a bot");
                    showBotTurn();
                }

            }

//            players[humanPlayerId].playerDeck().size(); <-- use while loop to keep game active while player deck size
//            is greater than 0

            gameIsActive = false;

        }
    }

    private void showPlayerTurn() {
        int selectedOption;
        int playerCardAmount = players[humanPlayerId].playerDeck().size();

        System.out.println(this.getHumanPlayer());

        Scanner userSelection = new Scanner(System.in);
//        selectedOption = userSelection.nextInt();
        System.out.println("Choose a card to play [1-" + playerCardAmount +"] or pass [0] :");
        selectedOption = userSelection.nextInt();
        try {
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
                System.out.println(players[humanPlayerId].playerDeck().get(selectedOption - 1) + " Card is played");
                players[humanPlayerId].playerDeck().remove(selectedOption - 1);

                System.out.println(players[humanPlayerId].playerDeck());

            }

        } catch(InputMismatchException e) {
            System.out.println("Incorrect input type. Please make sure valid integer is inputted");
            showPlayerTurn();
        }

        // for testing
        System.out.println(this.getHumanPlayer());

    }

    private void showBotTurn() {
        System.out.println(this.getBotPlayer());
        //todo make an extension class to STPlayer for bot, each bot can then reference to it via getters and setters

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
