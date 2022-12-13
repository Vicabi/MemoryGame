import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class Main extends JFrame implements ActionListener {

    JPanel basePanel = new JPanel(new BorderLayout());
    JPanel cardPanel = new JPanel(new GridLayout(5, 5));
    JButton newGameButton = new JButton("Start new game");

    LinkedList<JPanel> listOfCardPanels = new LinkedList<>();
    LinkedList<JPanel> listOfCardPanelsToShuffle;

    public Main() {
        showGUI();

    }


    public void showGUI() {
        add(basePanel);
        basePanel.add(cardPanel, BorderLayout.CENTER);
        basePanel.add(newGameButton, BorderLayout.NORTH);

        for (int i = 0; i < 25; i++){
            JPanel panelWithCard = new JPanel();
            panelWithCard.addMouseListener(mouseListener);
            panelWithCard.setBackground(Color.RED);
            listOfCardPanels.add(panelWithCard);
        }

        newGameButton.addActionListener(this);


        this.setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        Main m = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    MouseAdapter mouseListener = new MouseAdapter() {

        int indexCardA;
        int indexCardB;
        int numberCardsUp = 0;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (((JPanel) e.getSource()).getParent() == cardPanel && numberCardsUp == 0) {
                ((JPanel) e.getSource()).setBackground(Color.WHITE);
                indexCardA = listOfCardPanels.indexOf(e.getSource());
                numberCardsUp = 1;
            }
            else if (((JPanel) e.getSource()).getParent() == cardPanel && numberCardsUp == 1) {
                ((JPanel) e.getSource()).setBackground(Color.WHITE);
                indexCardB = listOfCardPanels.indexOf(e.getSource());
                numberCardsUp = 2;
            }
            else {
                numberCardsUp = 0;
            }
        }
    };
}