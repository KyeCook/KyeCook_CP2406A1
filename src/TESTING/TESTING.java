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
