package TESTING;

import java.util.*;

/**
 * Created by ACfan on 29/09/2016.
 */
public class TESTING {
    MenuOption option;

    public TESTING(MenuOption option){
        this.option = option;
    }

    public enum MenuOption {
        NEW_GAME, END_GAME
    }

    public void menuSelectedOption(){
        switch (option) {
            case NEW_GAME:
                System.out.println("New Game started");
                break;
            case END_GAME:
                System.out.println("Game is ending");
                break;
        }
    }

    public static void userInputs(){
        System.out.printf("alalalalalalal");
    }


    public static void main(String[]args){

        userInputs();

        String str;

//        int i = new Random().nextInt(2 + 1);
//        System.out.println(i);

        char play = 'p';
        char quit = 'q';

        Scanner in = new Scanner(System.in);
        System.out.println("Menu Choice\n\t>>>");
        str = in.nextLine();

        if(str.charAt(0) == 'p'){
            TESTING newGame = new TESTING(MenuOption.NEW_GAME);
            newGame.menuSelectedOption();
        }

        else if(str.charAt(0) == 'q'){
            TESTING endGame = new TESTING(MenuOption.END_GAME);
            endGame.menuSelectedOption();
        }

        else {
            System.out.printf("Incorrect input");
        }


//        System.out.println(str);





    }

}















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
    private int[] botPlayerIds = {1,2,3,4};


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

        for(int i = 1; i < numPlayers - 1; ++i){
            botPlayerIds[i] = i;
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
            //todo how to loop again until limit is reached (how to reiterate loop)
            //todo how it implement dealer and first player left of dealer functionality
            for(int indexPlayer = 0; indexPlayer < players.length; indexPlayer ++) {
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
        int n = players[humanPlayerId].playerDeck().size();

        System.out.println(this.getHumanPlayer());

        Scanner userSelection = new Scanner(System.in);
//        selectedOption = userSelection.nextInt();

        try {
            while(selectedOption<0 || selectedOption >n){
                System.out.println("Choose a card to play [1 - " + n + "] or pass [0] :");
                selectedOption = userSelection.nextInt();
            }

            if(selectedOption == 0){
                System.out.println("Turn Passed");

                ArrayList<STCard>  drawnCard = deck.dealCards(1);
                players[humanPlayerId].playerDeck().addAll(drawnCard);

                System.out.println(players[humanPlayerId].playerDeck());

            }
            else {
                System.out.println("Card is played");
//                players[humanPlayerId].playerDeck().get(3);
            }

//            System.out.println("Invalid menu choice");
//            showPlayerTurn();

        } catch(InputMismatchException e) {
            System.out.println("Incorrect input type. Please make sure valid integer is inputted");
            showPlayerTurn();
        }

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