import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaderBoard extends JFrame implements ActionListener {
    JButton returnToHomeScreenButton;
    JButton startNewGameButton;
    JPanel basePanel;

    public LeaderBoard(){
        setUpLeaderboardScreen();
    }
    public void setUpLeaderboardScreen(){
        Color backGroundColor = new Color(77,27,102);

        basePanel = new JPanel(new GridLayout(11,1));
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        basePanel.setBackground(backGroundColor);
        buttonPanel.setBackground(backGroundColor);
        returnToHomeScreenButton = new JButton("Return to Homescreen");
        startNewGameButton = new JButton("Start Game");

        returnToHomeScreenButton.addActionListener(this);
        startNewGameButton.addActionListener(this);


        add(basePanel);
        basePanel.add(buttonPanel);
        buttonPanel.add(returnToHomeScreenButton);
        buttonPanel.add(startNewGameButton);
        createLabels();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        this.setSize(800,550);
    }
    public void createLabels(){
        for (int i = 1; i < 11; i++) {
            JLabel label = new JLabel("Place " + i + ":");
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Times New Roman", Font.BOLD,24));
            label.setBorder(new LineBorder(Color.BLACK,2));
            basePanel.add(label);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startNewGameButton){
            this.setVisible(false);
            Main main = new Main();
        } else if (e.getSource() == returnToHomeScreenButton) {
            this.setVisible(false);
            HomeScreen homeScreen = new HomeScreen();
        }
    }
}
