import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

    JPanel basePanel;
    JPanel topPanel;
    JPanel middlePanel;
    JPanel bottomPanel;
    JButton startGameButton;
    JButton settingsButton;
    JButton leaderBoardButton;
    JLabel gameTitleLabel;
    ImageIcon leaderBoardIcon;
    ImageIcon settingsIcon;
    ImageIcon memoryGameIcon;
    ImageIcon startGameIcon;
    Color backGroundColor = new Color(77,27,102);

    public HomeScreen(){
        setUpHomeScreen();
    }
    public ImageIcon getScaledImage(String pathname, int width, int height) {
        ImageIcon icon = new ImageIcon(pathname);
        Image image = icon.getImage();
        Image imageScaled = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(imageScaled);
    }
    public void setUpHomeScreen(){

        basePanel = new JPanel(new GridLayout(3,1));
        topPanel = new JPanel();
        middlePanel = new JPanel();
        bottomPanel = new JPanel();
        gameTitleLabel = new JLabel();



        topPanel.setBackground(backGroundColor);
        middlePanel.setBackground(backGroundColor);
        bottomPanel.setBackground(backGroundColor);


        gameTitleLabel.setPreferredSize(new Dimension(500,150));
        memoryGameIcon = getScaledImage("Pictures/MemoryGameIcon.png",500,150);
        gameTitleLabel.setIcon(memoryGameIcon);
        settingsIcon = getScaledImage("Pictures/SettingsIcon.png",100,75);
        leaderBoardIcon = getScaledImage("Pictures/leaderboardIcon.png",100,75);
        startGameIcon =getScaledImage("Pictures/startButton.png",150,75);
        startGameButton = new JButton(startGameIcon);

        settingsButton = new JButton(settingsIcon);
        leaderBoardButton = new JButton(leaderBoardIcon);

        add(basePanel);


        startGameButton.addActionListener(this);
        leaderBoardButton.addActionListener(this);
        settingsButton.addActionListener(this);

        topPanel.add(gameTitleLabel,SwingConstants.CENTER);
        middlePanel.add(startGameButton,SwingConstants.CENTER);
        bottomPanel.add(settingsButton);
        bottomPanel.add(leaderBoardButton);

        basePanel.add(topPanel);
        basePanel.add(middlePanel);
        basePanel.add(bottomPanel);



        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 550);

    }

    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startGameButton){
            this.setVisible(false);
            Main main = new Main();
        } else if (e.getSource() == leaderBoardButton) {
            this.setVisible(false);
            //LeaderBoard leaderBoard = new LeaderBoard();
        } else if (e.getSource() == settingsButton) {
            this.setVisible(false);
            Settings settings = new Settings();
        }

    }
}
