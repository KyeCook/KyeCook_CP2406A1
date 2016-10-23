import javax.swing.*;
import java.awt.*;


public class PlayerTurnGUI extends JFrame{

    STGame gameReference;

    JButton passButton = new JButton("Pass");

    JPanel labelPanel = new JPanel();
    JPanel cardsPanel = new JPanel();

    JLabel titleLabel = new JLabel("TITLE PLACEHOLDER");
    JLabel instructionsLabel = new JLabel("INSTUCTIONS");

    JList cards = new JList();


    public PlayerTurnGUI(STGame g){
        gameReference = g;

        setLayout(new GridLayout(2,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(labelPanel);
        add(cardsPanel);
        add(passButton);

        labelPanel.add(titleLabel);
        labelPanel.add(instructionsLabel);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        instructionsLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
        instructionsLabel.setText("\nChoose a card to play [1-" + g.playerCardAmount +"] or pass [0] :");

        cardsPanel.add(cards);



        setSize(400, 200);
        setVisible(true);

    }

}

