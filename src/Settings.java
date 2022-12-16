import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Settings extends JFrame implements ActionListener {

    private JButton difficultyEasyButton;
    private JButton difficultyMediumButton;
    private JButton difficultyHardButton;
    private JButton returnToHomeScreenButton;
    Properties properties = new Properties();
    private String difficulty;
    private int numberOfCards;


    public int getDifficulty() {
        switch (difficulty) {
            case "easy" -> numberOfCards = 12; // how many cards that will be displayed
            case "medium" -> numberOfCards = 24; // how many cards that will be displayed
            case "hard" -> numberOfCards = 36; // how many cards that will be displayed
        }
        return numberOfCards;
    }

    public Settings() {
        setUpSettingScreen();
        try {
            properties.load(new FileInputStream("src/Setting.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        difficulty = properties.getProperty("difficulty", "1");
    }


    public void setUpSettingScreen() {
        Color backGroundColor = new Color(77,27,102);

        JPanel basePanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
        JPanel topPanel = new JPanel(new GridLayout(1, 2));

        JLabel settingsLabel = new JLabel("Choose Difficulty", SwingConstants.CENTER);
        settingsLabel.setFont(new Font("Times New Roman", Font.BOLD,24));
        settingsLabel.setForeground(Color.WHITE);
        settingsLabel.setBorder(new LineBorder(Color.BLACK,5));

        returnToHomeScreenButton = new JButton("Return");
        returnToHomeScreenButton.setFont(new Font("Times New Roman", Font.BOLD,24));
        returnToHomeScreenButton.setForeground(Color.WHITE);
        returnToHomeScreenButton.setBackground(backGroundColor);
        returnToHomeScreenButton.setBorder(new LineBorder(Color.BLACK,5));

        difficultyEasyButton = new JButton("Easy");
        difficultyEasyButton.setFont(new Font("Times New Roman", Font.BOLD,24));
        difficultyEasyButton.setForeground(Color.WHITE);
        difficultyEasyButton.setBackground(backGroundColor);
        difficultyEasyButton.setBorder(new LineBorder(Color.BLACK,5));

        difficultyMediumButton = new JButton("Medium");
        difficultyMediumButton.setFont(new Font("Times New Roman", Font.BOLD,24));
        difficultyMediumButton.setForeground(Color.WHITE);
        difficultyMediumButton.setBackground(backGroundColor);
        difficultyMediumButton.setBorder(new LineBorder(Color.BLACK,5));

        difficultyHardButton = new JButton("Hard");
        difficultyHardButton.setFont(new Font("Times New Roman", Font.BOLD,24));
        difficultyHardButton.setForeground(Color.WHITE);
        difficultyHardButton.setBackground(backGroundColor);
        difficultyHardButton.setBorder(new LineBorder(Color.BLACK,5));

        returnToHomeScreenButton.addActionListener(this);
        difficultyEasyButton.addActionListener(this);
        difficultyMediumButton.addActionListener(this);
        difficultyHardButton.addActionListener(this);

        topPanel.add(settingsLabel);
        topPanel.add(returnToHomeScreenButton);
        topPanel.setBackground(backGroundColor);

        buttonPanel.add(difficultyEasyButton, BorderLayout.NORTH);
        buttonPanel.add(difficultyMediumButton, BorderLayout.CENTER);
        buttonPanel.add(difficultyHardButton, BorderLayout.SOUTH);

        add(basePanel);
        basePanel.add(topPanel, BorderLayout.NORTH);
        basePanel.add(buttonPanel, BorderLayout.CENTER);



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == returnToHomeScreenButton) {
            this.setVisible(false);
            HomeScreen homeScreen = new HomeScreen();
        } else if (e.getSource() == difficultyEasyButton) {
            difficulty = "easy";
            System.out.println("difficulty: " + difficulty);
            JOptionPane.showMessageDialog(null, "Difficulty set to easy");
        } else if (e.getSource() == difficultyMediumButton) {
            difficulty = "medium";
            System.out.println("difficulty: " + difficulty);
            JOptionPane.showMessageDialog(null, "Difficulty set to medium");
        } else if (e.getSource() == difficultyHardButton) {
            difficulty = "hard";
            System.out.println("difficulty: " + difficulty);
            JOptionPane.showMessageDialog(null, "Difficulty set to hard");
        }
    }
}
