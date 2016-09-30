package TESTING;

import java.util.*;

/**
 * Created by ACfan on 29/09/2016.
 */
public class TESTING {
    public static void main(String[]args){
        String str;

//        int i = new Random().nextInt(2 + 1);
//        System.out.println(i);

        char play = 'p';
        char quit = 'q';

        Scanner in = new Scanner(System.in);
        System.out.println("Menu Choice\n\t>>>");
        str = in.nextLine();

        if(str.charAt(0) == 'p'){
            System.out.println("Game has been started");
        }

        else if(str.charAt(0) == 'q'){
            System.out.println("Game has been quit");
        }

        else {
            System.out.printf("Incorrect input");
        }


//        System.out.println(str);
    }


}
