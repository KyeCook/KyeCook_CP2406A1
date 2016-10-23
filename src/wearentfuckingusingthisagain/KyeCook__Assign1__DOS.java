package wearentfuckingusingthisagain;

import java.util.*;

/**
 * Created by Kye Cook on 29/09/2016.
 *
 * Github URL : https://github.com/KyeCook/KyeCook_CP2406A1
 */

/*
Main class that all other classes are called from
 */
public class KyeCook__Assign1__DOS {
    private MenuOption option;

    /*
    Main Program
     */
    public static void main(String[]args)
    {
        showWelcome();
        showMenu();
        getUserMenuChoice();
    }

    private KyeCook__Assign1__DOS(MenuOption option){
        this.option = option;
    }

    /*
    Creates enumerated list variable of Constants
     */
    private enum MenuOption {
        NEW_GAME, END_GAME
    }

    /*
    Handles menu selection from user in switch statements based upon user input
     */
    private void selectedMenuOption(){
        switch(option) {

            case NEW_GAME:
                STGame game;
                game = startNewGame();
                game.playGame();
                break;

            case END_GAME:
                System.out.println("Thank you for playing Mineral SuperTrumps!!");
                break;
        }
    }

    /*
    Instantiates Game
     */
    private static STGame startNewGame(){
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealCards();
        game.selectHumanPlayer();

        STPlayer humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);


        if(numPlayers == 2){
            game.selectBotPlayer1();

            STPlayer botPlayer1 = game.getBotPlayer1();

//            showPlayer(botPlayer1);
        }
        else if(numPlayers == 3){
            game.selectBotPlayer1();
            game.selectBotPlayer2();

            STPlayer botPlayer1 = game.getBotPlayer1();
            STPlayer botPlayer2 = game.getBotPlayer2();

//            showPlayer(botPlayer1);
//            showPlayer(botPlayer2);
        }
        else if(numPlayers == 4){
            game.selectBotPlayer1();
            game.selectBotPlayer2();
            game.selectBotPlayer3();

            STPlayer botPlayer1 = game.getBotPlayer1();
            STPlayer botPlayer2 = game.getBotPlayer2();
            STPlayer botPlayer3 = game.getBotPlayer3();

//            showPlayer(botPlayer1);
//            showPlayer(botPlayer2);
//            showPlayer(botPlayer3);
        }
        else if(numPlayers == 5){
            game.selectBotPlayer1();
            game.selectBotPlayer2();
            game.selectBotPlayer3();
            game.selectBotPlayer4();

            STPlayer botPlayer1 = game.getBotPlayer1();
            STPlayer botPlayer2 = game.getBotPlayer2();
            STPlayer botPlayer3 = game.getBotPlayer3();
            STPlayer botPlayer4 = game.getBotPlayer4();

//            showPlayer(botPlayer1);
//            showPlayer(botPlayer2);
//            showPlayer(botPlayer3);
//            showPlayer(botPlayer4);
        }

        return game;

    }

    /*
    Handles amount of players within game based upon user input
     */
    private static int getNumPlayers() {
        int numberOfPlayers = 0;
        Scanner noPlayers = new Scanner(System.in);

        while(numberOfPlayers<2 || numberOfPlayers >5){

            try {
                System.out.println("Please enter in desired number of players (2-5)");
                numberOfPlayers = noPlayers.nextInt();

            } catch(InputMismatchException e) {
                System.out.println("Incorrect input type. Please make sure valid integer is inputted");
                noPlayers.nextLine();
            }

        }

        return numberOfPlayers;
    }

    /*
    Handles user menu choice and passes back to switch statement
     */
    private static void getUserMenuChoice() {
        int userInput = 0;

        Scanner userIn = new Scanner(System.in);


            while(userInput < 1 || userInput > 2){
                try {
                    System.out.println("\nPlease Enter Valid Menu Choice:");
                    userInput = userIn.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input type. Please make sure valid integer is inputted");
                    userIn.nextLine();
                }
            }

            if(userInput == 1){
                KyeCook__Assign1__DOS newGame = new KyeCook__Assign1__DOS(MenuOption.NEW_GAME);
                newGame.selectedMenuOption();
            }

            else if(userInput == 2){
                KyeCook__Assign1__DOS endGame = new KyeCook__Assign1__DOS(MenuOption.END_GAME);
                endGame.selectedMenuOption();
            }

    }

    /*
    Shows menu to user
     */
    private static void showMenu() {
        System.out.println("\t[1] Start Game");
        System.out.println("\t[2] Exit");
    }

    /*
    Shows welcome message to user
     */
    private static void showWelcome() {
        System.out.println("Welcome to Mineral SuperTrumps!");
    }

    /*
    Shows details of human player to user
     */
    private static void showPlayer(STPlayer humanPlayer){
        System.out.println("\nHello you are player number: " + humanPlayer.getPlayerId() + "\n");
    }
}
