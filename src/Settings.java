import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Settings extends JFrame implements ActionListener {
    JPanel basePanel;
    JPanel buttonPanel;
    JPanel topPanel;
    JButton difficultyEasyButton;
    JButton difficultyMediumButton;
    JButton difficultyHardButton;
    JLabel settingsLabel;
    JButton returnToHomeScreenButton;
    Properties properties = new Properties();
    String difficulty;


    public String getDifficulty() {
        return difficulty;
    }

    public Settings(){
        setUpSettingScreen();
        try{
            properties.load(new FileInputStream("src/Setting.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        difficulty = properties.getProperty("difficulty", "1");
    }


    public void setUpSettingScreen(){
        basePanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel(new BorderLayout());
        topPanel = new JPanel();
        settingsLabel = new JLabel("Settings", SwingConstants.CENTER);
        returnToHomeScreenButton = new JButton("Return to home");

        difficultyEasyButton = new JButton("Easy");
        difficultyMediumButton = new JButton("Medium");
        difficultyHardButton = new JButton("Hard");

        returnToHomeScreenButton.addActionListener(this);
        difficultyEasyButton.addActionListener(this);
        difficultyMediumButton.addActionListener(this);
        difficultyHardButton.addActionListener(this);

        topPanel.add(settingsLabel);
        topPanel.add(returnToHomeScreenButton);
        add(basePanel);
        basePanel.add(topPanel, BorderLayout.NORTH);
        basePanel.add(buttonPanel,BorderLayout.CENTER);
        buttonPanel.add(difficultyEasyButton,BorderLayout.NORTH);
        buttonPanel.add(difficultyMediumButton, BorderLayout.CENTER);
        buttonPanel.add(difficultyHardButton, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == returnToHomeScreenButton){
            this.setVisible(false);
            //homeScreen.setVisible(true);
        } else if (e.getSource() == difficultyEasyButton) {
            difficulty = "easy";
            JOptionPane.showMessageDialog(null,"Difficulty set to easy");
        }else if (e.getSource() == difficultyMediumButton) {
            difficulty = "medium";
            System.out.println("difficulty: " + difficulty);
            JOptionPane.showMessageDialog(null,"Difficulty set to medium");
        }else if (e.getSource() == difficultyHardButton) {
            difficulty = "hard";
            JOptionPane.showMessageDialog(null,"Difficulty set to hard");
        }
    }

    public static void main(String[] args) {
        Settings settings = new Settings();
    }
}
