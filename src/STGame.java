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

    private int botPlayerId1;
    private int botPlayerId2;
    private int botPlayerId3;
    private int botPlayerId4;

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

        List bots = new ArrayList(4);

        bots.add(botPlayerId1);
        bots.add(botPlayerId2);
        bots.add(botPlayerId3);
        bots.add(botPlayerId4);

        System.out.println(bots.get(1));

//        int test = Integer.parseInt(bots.get(1).toString());
//        System.out.println(test);

        while (gameIsActive){
            //todo setup players in correct order

            for(int indexPlayer = 0; indexPlayer < players.length; indexPlayer ++) {
                //todo check human player (polymorphism)
                if(players[indexPlayer].playerDeck().size() == 0){
                    System.out.println("Player : " + indexPlayer + " has Won SuperTrumps!");
                    gameIsActive = false;
                    break;
                }

                else if(indexPlayer == humanPlayerId){
                    System.out.println("----- Your Turn -----");
                    showPlayerTurn();
                }

                else{
                    convertObjectToInteger = Integer.parseInt(bots.get(indexPlayer - 1).toString());

                    System.out.println("----- Bots Turn -----");
                    System.out.println("TEST" + indexPlayer);
                    System.out.println("TEST" + convertObjectToInteger);

                    showBotTurn(convertObjectToInteger);

//                    showBotTurn(bots[indexPlayer]);

//                    if(players.length == 2){
//                        showBotTurn(botPlayerId1);
//                    }
//                    else if(players.length == 3){
//                        showBotTurn(botPlayerId1);
//                        showBotTurn(botPlayerId2);
//                    }
//                    else if(players.length == 4){
//                        showBotTurn(botPlayerId1);
//                        showBotTurn(botPlayerId2);
//                        showBotTurn(botPlayerId3);
//
//                    }
//                    else if(players.length == 5){
//                        showBotTurn(botPlayerId1);
//                        showBotTurn(botPlayerId2);
//                        showBotTurn(botPlayerId3);
//                        showBotTurn(botPlayerId4);
//                    }


//                    System.out.println("This is a bot");
//                    showBotTurn(botPlayerId2);

                }
            }
        }
    }

    private void showPlayerTurn() {
        int selectedOption;
        int playerCardAmount = players[humanPlayerId].playerDeck().size();

        System.out.println(this.getHumanPlayer());

        Scanner userSelection = new Scanner(System.in);
//        selectedOption = userSelection.nextInt();

        try {
            System.out.println("Choose a card to play [1-" + playerCardAmount +"] or pass [0] :");
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

    private void showBotTurn(int botPlayerId) {
        System.out.println("This is bot no :" + botPlayerId);

//        System.out.println(botIds[botPlayerId]);

//        System.out.println(this.getBotPlayer1());
//        System.out.println(botPlayerId);



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
