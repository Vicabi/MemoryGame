import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

    JPanel basePanel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton startGameButton;
    JButton settingsButton;
    JButton leaderBoardButton;
    JLabel gameTitleLabel;
    ImageIcon leaderBoardIcon;
    ImageIcon settingsIcon;
    ImageIcon memoryGameIcon;
    ImageIcon startGameIcon;

    Color backgroundGreen = new Color(58,218,154);


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
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        gameTitleLabel = new JLabel();

        panel1.setBackground(Color.LIGHT_GRAY);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel3.setBackground(Color.LIGHT_GRAY);

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

        panel1.add(gameTitleLabel,SwingConstants.CENTER);
        panel2.add(startGameButton,SwingConstants.CENTER);
        panel3.add(settingsButton);
        panel3.add(leaderBoardButton);

        basePanel.add(panel1);
        basePanel.add(panel2);
        basePanel.add(panel3);



        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);

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
