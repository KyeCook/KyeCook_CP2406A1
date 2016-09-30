import java.util.*;

/**
 * Created by Kye Cook on 29/09/2016.
 *
 * Github URL : https://github.com/KyeCook/KyeCook_CP2406A1
 */

public class completedUserStories {
    MenuOption option;
    private static final int NEW_GAME = 1;

    public static void main(String[]args)
    {
        showWelcome();
        showMenu();


//        int userOption = getUserMenuChoice();
//        STGame game;
//        if(userOption == NEW_GAME) {
//           game = startNewGame();
//            game.playGame();
//        }

        getUserMenuChoice();
    }

    public completedUserStories(MenuOption option){
        this.option = option;
    }

    private enum MenuOption {
        //todo: research how to use enumerated code
        NEW_GAME, END_GAME
    }

    public void selectedMenuOption(){
        switch(option) {

            case NEW_GAME:
                STGame game;
                game = startNewGame();
                game.playGame();
                break;

            case END_GAME:
                System.out.println("END_GAME");
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
        // TODO: 29/09/2016 : see prac
        return 2;
    }
    private static void getUserMenuChoice() {
        int userInput;

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Menu Choice:\n\n");
        userInput = in.nextInt();

        if(userInput == 1){
            completedUserStories newGame = new completedUserStories(MenuOption.NEW_GAME);
            newGame.selectedMenuOption();
        }

        else if(userInput == 2){
            completedUserStories endGame = new completedUserStories(MenuOption.END_GAME);
            endGame.selectedMenuOption();
        }

        else {
            System.out.println("Incorrect input");
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
