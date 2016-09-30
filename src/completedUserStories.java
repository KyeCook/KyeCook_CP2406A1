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

        STPlayer humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);
//        dealCards();

        return game;

    }
    private static int getNumPlayers() {
        //todo Do try statement or another error checking method to stop user entering in string value

        int numberOfPlayers = 0;

        Scanner noPlayers = new Scanner(System.in);
        while(numberOfPlayers<2 || numberOfPlayers >5){
            System.out.println("Please enter in desired number of players (2-5)");
            numberOfPlayers = noPlayers.nextInt();
        }

        return numberOfPlayers;
    }
    private static void getUserMenuChoice() {
        //todo Do try statement or another error checking method to stop user entering in string value
        int userInput = 0;

        Scanner userIn = new Scanner(System.in);


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

    }

    private static void showMenu() {
        System.out.println("\t[1] Start Game");
        System.out.println("\t[2] Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome to Mineral Supertrumps!");
    }

    private static void showPlayer(STPlayer humanPlayer){
        System.out.println("Human Players" + humanPlayer);
    }
}
