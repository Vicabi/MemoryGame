import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    JPanel basePanel;
    JPanel topPanel;
    JPanel cardPanel;
    JButton newGameButton;
    JButton shuffleButton;
    SetOfCards setOfCards = new SetOfCards();
    Pronunciation pronunciation = new Pronunciation();
    java.util.List<Card> listOfCards;
    private List<Integer> duplicates = new ArrayList<>();
    private int randomIndex;
    private int numberOfCorrectPairs;

    public Main() {
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

        listOfCards = createListOfCardsToShow(setOfCards.getListOfCards());

        for (Card card : listOfCards) {
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
        Main m = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == newGameButton) {
            cardPanel.removeAll();
            newGameButton.setBackground(Color.green);
            showGUI();
            repaint();
            revalidate();
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
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() instanceof JLabel && numberCardsUp == 0) {
                ((Card) e.getSource()).flipACardUp();
                cardToCompareA = (Card) e.getSource();
                numberCardsUp = 1;
                System.out.println("I klick once");
            } else if (e.getSource() instanceof JLabel && numberCardsUp == 1) {
                ((Card) e.getSource()).flipACardUp();
                cardToCompareB = (Card) e.getSource();
                numberCardsUp = 2;
                System.out.println("I klick twice");
            }

            if (cardToCompareA != null && cardToCompareB != null && numberCardsUp == 2) {
                checkIfSameCards(cardToCompareA, cardToCompareB);
                numberCardsUp = 0;
            }

            // kontrollera om spelaren vann
            if (numberOfCorrectPairs == 12) { // antal brickor delat med 2
                JOptionPane.showMessageDialog(null, "Congratulations! You won!");
            }
        }

    };

    public List<Card> createListOfCardsToShow(List<Card> originalList) { // original listan består av 26 kort
        List<Card> listOfCardsToShow = new LinkedList<>();
        duplicates.clear();

        for (int i = 0; i < 12; i++) { // 12 får vi när vi delar antal brickor vi ska visa (i detta fall 24) med 2
            while (true) {
                randomIndex = (int) (Math.random() * 26); // 26 för att vi har 26 olika bokstäver i vår kortlek
                if (!duplicates.contains(randomIndex)) {
                    break;
                }
            }
            duplicates.add(randomIndex);
            Card card = originalList.get(randomIndex);
            Card theOtherCard = new Card();
            theOtherCard.setLetter(card.getLetter()); // vi kopierar innehållet av kort 1 till kort 2
            theOtherCard.setPicturePath(card.getPicturePath()); // vi kopierar innehållet av kort 1 till kort 2
            theOtherCard.setPronunciationPath(card.getPronunciationPath()); // vi kopierar innehållet av kort 1 till kort 2
            theOtherCard.setPicture(card.getPicture()); // vi kopierar innehållet av kort 1 till kort 2
            listOfCardsToShow.add(card);
            listOfCardsToShow.add(theOtherCard); // lägga till samma kort 2 gånger för att skapa ett par av detta kort
        }
        Collections.shuffle(listOfCardsToShow);
        return listOfCardsToShow;
    }

    public boolean areSameCards(Card cardA, Card cardB) {
        if (cardA.getLetter().equals(cardB.getLetter())) {
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
        //    cardA.flipACardDown();
        //    cardB.flipACardDown();

        }
    }
}