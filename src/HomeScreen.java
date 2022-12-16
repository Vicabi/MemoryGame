import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

    JButton startGameButton;
    JButton settingsButton;
    JButton leaderBoardButton;
    private JButton difficultyEasyButton;
    private JButton difficultyMediumButton;
    private JButton difficultyHardButton;
    private JButton returnToHomeScreenButton;
    Settings settings = new Settings();

    public HomeScreen() {
        setUpHomeScreen();
    }

    public ImageIcon getScaledImage(String pathname, int width, int height) {
        ImageIcon icon = new ImageIcon(pathname);
        Image image = icon.getImage();
        Image imageScaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(imageScaled);
    }

    public void setUpHomeScreen() {
        Color backGroundColor = new Color(77, 27, 102);

        JPanel basePanel = new JPanel(new GridLayout(3, 1));
        JPanel topPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JLabel gameTitleLabel = new JLabel();


        topPanel.setBackground(backGroundColor);
        middlePanel.setBackground(backGroundColor);
        bottomPanel.setBackground(backGroundColor);


        gameTitleLabel.setPreferredSize(new Dimension(500, 150));
        ImageIcon memoryGameIcon = getScaledImage("Pictures/MemoryGameIcon.png", 500, 150);
        gameTitleLabel.setIcon(memoryGameIcon);
        ImageIcon settingsIcon = getScaledImage("Pictures/SettingsIcon.png", 100, 75);
        ImageIcon leaderBoardIcon = getScaledImage("Pictures/leaderboardIcon.png", 100, 75);
        ImageIcon startGameIcon = getScaledImage("Pictures/startButton.png", 150, 75);
        startGameButton = new JButton(startGameIcon);

        settingsButton = new JButton(settingsIcon);
        leaderBoardButton = new JButton(leaderBoardIcon);

        add(basePanel);

        startGameButton.addActionListener(this);
        leaderBoardButton.addActionListener(this);
        settingsButton.addActionListener(this);

        topPanel.add(gameTitleLabel, SwingConstants.CENTER);
        middlePanel.add(startGameButton, SwingConstants.CENTER);
        bottomPanel.add(settingsButton);
        bottomPanel.add(leaderBoardButton);

        basePanel.add(topPanel);
        basePanel.add(middlePanel);
        basePanel.add(bottomPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 550);
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startGameButton) {
            this.setVisible(false);
            GameScreen main = new GameScreen();
        } else if (e.getSource() == leaderBoardButton) {
            this.setVisible(false);
            LeaderBoard leaderBoard = new LeaderBoard();
        } else if (e.getSource() == settingsButton) {
            this.setVisible(false);
            setUpSettingScreen();
        }
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

        returnToHomeScreenButton.addActionListener(e -> {this.setVisible(false);HomeScreen homeScreen = new HomeScreen();});
        difficultyEasyButton.addActionListener(e ->{settings.setDifficulty("easy");JOptionPane.showMessageDialog(null, "Difficulty set to easy");});
        difficultyMediumButton.addActionListener(e ->{settings.setDifficulty("medium");JOptionPane.showMessageDialog(null, "Difficulty set to medium");});
        difficultyHardButton.addActionListener(e ->{settings.setDifficulty("hard");JOptionPane.showMessageDialog(null, "Difficulty set to hard");});

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

    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
    }
}