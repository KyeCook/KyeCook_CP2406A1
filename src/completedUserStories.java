import java.awt.*;
import java.util.*;

/**
 * Created by Kye Cook on 29/09/2016.
 *
 * Github URL : https://github.com/KyeCook/KyeCook_CP2406A1
 */

public class completedUserStories {
    private MenuOption option;

    public static void main(String[]args)
    {
        showWelcome();
        showMenu();
        getUserMenuChoice();
    }

    private completedUserStories(MenuOption option){
        this.option = option;
    }

    private enum MenuOption {
        NEW_GAME, END_GAME
    }

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

    private static STGame startNewGame(){
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealCards();
        game.selectHumanPlayer();
        game.selectBotPlayers();

        STPlayer humanPlayer = game.getHumanPlayer();
        STPlayer botPlayer = game.getBotPlayer();


        showPlayer(humanPlayer);

        // below is show for testing
        showPlayer(botPlayer);
//        dealCards();

        return game;

    }
    private static int getNumPlayers() {

        int numberOfPlayers = 0;

        Scanner noPlayers = new Scanner(System.in);

        try {
            while(numberOfPlayers<2 || numberOfPlayers >5){
                System.out.println("Please enter in desired number of players (2-5)");
                numberOfPlayers = noPlayers.nextInt();
            }

        } catch(InputMismatchException e) {
            System.out.println("Incorrect input type. Please make sure valid integer is inputted");
            getNumPlayers();
        }

        return numberOfPlayers;
    }
    private static void getUserMenuChoice() {
        int userInput = 0;

        Scanner userIn = new Scanner(System.in);

        try {

            while(userInput < 1 || userInput > 2){
                System.out.println("\nPlease Enter Valid Menu Choice:\n");
                userInput = userIn.nextInt();
            }

            if(userInput == 1){
                completedUserStories newGame = new completedUserStories(MenuOption.NEW_GAME);
                newGame.selectedMenuOption();
            }

            else if(userInput == 2){
                completedUserStories endGame = new completedUserStories(MenuOption.END_GAME);
                endGame.selectedMenuOption();
            }

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input type. Please make sure valid integer is inputted");
            getUserMenuChoice();
        }


    }

    private static void showMenu() {
        System.out.println("\t[1] Start Game");
        System.out.println("\t[2] Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome to Mineral SuperTrumps!");
    }

    private static void showPlayer(STPlayer humanPlayer){
        System.out.println("\nHello you are player number: " + humanPlayer + "\n");
    }
}
