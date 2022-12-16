import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class GameScreen extends JFrame implements ActionListener {

    JPanel basePanel;
    JPanel topPanel;
    JPanel cardPanel;
    JButton newGameButton;
    JButton shuffleButton;
    Pronunciation pronunciation = new Pronunciation();
    CardBuilder cardBuilder = new CardBuilder();
    List<Card> listOfCards;
    Settings settings = new Settings();

    private int numberOfCorrectPairs;

    public GameScreen() {
        showGUI();
    }

    public void showGUI() {

        basePanel = new JPanel(new BorderLayout());

        add(basePanel);

        topPanel = new JPanel(new GridLayout(1, 2));
        cardPanel = new JPanel(new GridLayout(4, 6));
        shuffleButton = new JButton("Shuffle");
        newGameButton = new JButton("Start new game");

        basePanel.add(cardPanel, BorderLayout.CENTER);
        basePanel.add(topPanel, BorderLayout.NORTH);
        topPanel.add(newGameButton);
        topPanel.add(shuffleButton);

        listOfCards = cardBuilder.getCardsForGame();

        for (Card card : listOfCards) {//Kopierat rad 47-50 från 77-80 för att slippa måla korten i CardBuilder
            card.setOpaque(true);
            card.setBackground(card.getColorOfReverseSide());
            card.setBorder(new LineBorder(Color.WHITE, 3));
            card.setPreferredSize(new Dimension(175, 225));
            card.addMouseListener(mouseListener);
            cardPanel.add(card);
        }

        newGameButton.addActionListener(this);
        shuffleButton.addActionListener(this);

        this.pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GameScreen m = new GameScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newGameButton) {

            cardPanel.removeAll();
            listOfCards = cardBuilder.createCards();

            for (Card card : listOfCards) {
                card.setOpaque(true);
                card.setBackground(card.getColorOfReverseSide());
                card.setBorder(new LineBorder(Color.WHITE, 3));
                card.setPreferredSize(new Dimension(175, 225));
                card.addMouseListener(mouseListener);
                cardPanel.add(card);
            }
            cardPanel.validate();
            cardPanel.repaint();
        }

        if (e.getSource() == shuffleButton) {
            cardPanel.removeAll();
            Collections.shuffle(listOfCards);
            for (Card card : listOfCards) {
                cardPanel.add(card);
            }
            cardPanel.validate();
            cardPanel.repaint();
        }
    }

    MouseAdapter mouseListener = new MouseAdapter() {

        Card cardToCompareA;
        Card cardToCompareB;
        int numberCardsUp = 0;

        @Override
        public void mouseClicked(MouseEvent e) { // vi måste triggra när vi vänder ner kortet på nåt annat sätt
            if (e.getSource() instanceof JLabel && numberCardsUp == 0) {
                ((Card) e.getSource()).flipACardUp();
                cardToCompareA = (Card) e.getSource();
                numberCardsUp = 1;
                System.out.println("I clicked once");
            } else if (e.getSource() instanceof JLabel && numberCardsUp == 1) {
                ((Card) e.getSource()).flipACardUp();
                cardToCompareB = (Card) e.getSource();
                numberCardsUp = 2;
                System.out.println("I clicked twice");
            }
            if (cardToCompareA != null && cardToCompareB != null && numberCardsUp == 2) {
                checkIfSameCards(cardToCompareA, cardToCompareB);
                numberCardsUp = 0;
            }

            // kontrollera om spelaren vann
            if (numberOfCorrectPairs == settings.getDifficulty()) { // antal brickor delat med 2
                JOptionPane.showMessageDialog(null, "Congratulations! You won!");
            }
        }

    };

    public boolean areSameCards(Card cardA, Card cardB) {
        if (cardA.getLetter().equals(cardB.getLetter()) && cardA != cardB) {
            System.out.println("Same cards");
            return true;
        } else {
            System.out.println("Different cards");
            return false;
        }
    }

    public void checkIfSameCards(Card cardA, Card cardB) {
        if (areSameCards(cardA, cardB)) {
            pronunciation.setFile(cardA.getPronunciationPath()); // tanken är att ordet uttalas när användaren hittar båda 2 korten
            pronunciation.play();
            cardA.removeMouseListener(mouseListener);
            cardB.removeMouseListener(mouseListener);
            cardA.setFlipNoMore(true);
            cardB.setFlipNoMore(true);
            numberOfCorrectPairs++;
        } else if (!areSameCards(cardA, cardB)) {
            cardA.flipACardDown();
            cardB.flipACardDown();
        }
    }
}