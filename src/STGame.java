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

    private int[] botPlayerIds;

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
            botPlayerIds = new int[]{i};
            System.out.println(botPlayerIds);
        }

    }

    public STPlayer getBotPlayer() {

        // todo WHY DOESNT IT LOOP??


        for(int player : botPlayerIds){
            return players[player];
        }
        return null;
    }


    public void playGame() {
        boolean gameIsActive = true;
        //todo: index part of array or list? Should players be enumerated?
        // below maybe the solution?
        boolean humanTurn = false;

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
            gameIsActive = false;

        }
    }

    private void showPlayerTurn() {
        int selectedOption = 0;

        System.out.println(this.getHumanPlayer());

        Scanner userSelection = new Scanner(System.in);
//        selectedOption = userSelection.nextInt();

        try {
            while(selectedOption<1 || selectedOption >9){
                System.out.println("Choose a card to play [1-8] or pass [9] :");
                selectedOption = userSelection.nextInt();
            }

            if(selectedOption == 9){
                System.out.println("Turn Passed");
                //todo how to only add 1 to user deck rather than replacing
                ArrayList<STCard>  cards = deck.dealCards(1);
                players[humanPlayerId].setCards(cards);


            }
            else {
                System.out.println("Card is played");
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
