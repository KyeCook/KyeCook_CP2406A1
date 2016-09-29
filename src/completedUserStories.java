/**
 * Created by Kye Cook on 29/09/2016.
 *
 * Github URL : https://github.com/KyeCook/KyeCook_CP2406A1
 */
public class completedUserStories {

    private static final int NEW_GAME = 1;

    public static void main(String[]args)
    {
        showWelcome();
        showMenu();

        int opt = getUserMenuChoice();
        if(opt == NEW_GAME) {
           startNewGame();
        }
    }

    public enum Option {
        //todo: research how to use enumerated code
        NEW_GAME
    }

    private static void startNewGame(){
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);
        game.selectDealer();
        game.dealCards();
//        dealCards();

    }
    private static int getNumPlayers() {
        // TODO: 29/09/2016 : see prac
        return 2;
    }
    private static int getUserMenuChoice() {
        //todo: see prac

        return 1;
    }

    private static void showMenu() {
        System.out.println("\t1. Start Game");
        System.out.println("\t2. Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome to Mineral Supertrumps!");
    }
}
