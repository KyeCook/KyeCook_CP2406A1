import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        }
        else {
            System.exit(0);
        }

    }

    public static void main(String[] args)
    {
        KyeCook_Assign2_GUI frame = new KyeCook_Assign2_GUI();
    }

}
