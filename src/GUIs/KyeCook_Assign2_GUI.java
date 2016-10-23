package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;


public class KyeCook_Assign2_GUI extends JFrame implements ActionListener{

    JButton newGameButton = new JButton("New Game");
    JButton exitGameButton = new JButton("Exit Game");

    JPanel buttonPanel = new JPanel();
    JPanel logoPanel = new JPanel();

    JLabel titleLabel = new JLabel("Mineral Supertrumps!");

    public KyeCook_Assign2_GUI()
    {
        setLayout(new GridLayout(2,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(logoPanel);
        add(buttonPanel);

        logoPanel.add(titleLabel);
        titleLabel.setFont(new Font("Calibri", Font.BOLD, 25));

        buttonPanel.add(newGameButton);
        buttonPanel.add(exitGameButton);

        newGameButton.addActionListener(this);
        exitGameButton.addActionListener(this);
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source == newGameButton){
            JOptionPane.showMessageDialog(null, "Game is starting");
            getNumPlayers();
        }
        else {
            System.exit(0);
        }

    }

    private static int getNumPlayers() {
        int numberOfPlayers = 0;



        while(numberOfPlayers<2 || numberOfPlayers >5){

            try {
                String input = JOptionPane.showInputDialog(null, "Enter in number of preferred players");
                numberOfPlayers = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Incorrect input type. Please make sure valid integer is inputted");
            }


        }

        JOptionPane.showMessageDialog(null, numberOfPlayers);
        return numberOfPlayers;
    }

    public static void main(String[] args)
    {
        KyeCook_Assign2_GUI frame = new KyeCook_Assign2_GUI();
    }

}
