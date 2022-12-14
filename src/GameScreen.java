import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.*;

public class GameScreen extends JFrame implements ActionListener {

    JPanel basePanel = new JPanel(new BorderLayout());
    JPanel cardPanel = new JPanel(new GridLayout(4, 6));
    JButton newGameButton = new JButton("Start new game");
    SetOfCards setOfCards = new SetOfCards();
    Pronunciation pronunciation = new Pronunciation();
    java.util.List<Card> listOfCards;
    private List<Integer> duplicates = new ArrayList<>();
    private int randomIndex;
    String soundTrack = "Sounds/Apa.wav";

    public GameScreen(){
        add(basePanel);
        basePanel.add(cardPanel, BorderLayout.CENTER);
        basePanel.add(newGameButton, BorderLayout.NORTH);

        listOfCards = createListOfCardsToShow(setOfCards.getListOfCards());

        for (Card card : listOfCards) {
            card.setOpaque(true);
            card.setBackground(card.getColorOfReverseSide());
            card.setBorder(new LineBorder(Color.WHITE, 3));
            card.setPreferredSize(new Dimension(175, 225));
            card.addMouseListener(mouseListener);
            cardPanel.add(card);
        }

        newGameButton.addActionListener(this);

        this.pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton) {

        }
    }

    MouseAdapter mouseListener = new MouseAdapter() {

        Card cardToCompareA;
        Card cardToCompareB;
        int numberCardsUp = 0;
        private int numberOfCorrectPairs;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() instanceof JLabel && numberCardsUp == 0) {
                ((Card) e.getSource()).flipACard();
                cardToCompareA = (Card) e.getSource();
                numberCardsUp = 1;
            } else if (e.getSource() instanceof JLabel && numberCardsUp == 1) {
                ((Card) e.getSource()).flipACard();
                pronunciation.setFile(((Card) e.getSource()).getPronunciationPath()); // tanken är att ordet uttalas när användaren hittar båda 2 korten
                pronunciation.play();
                cardToCompareB = (Card) e.getSource();
                numberCardsUp = 0;
            }

            // kontrollera om spelaren vann
            if (numberOfCorrectPairs == 12) { // antal brickor delat med 2
                JOptionPane.showMessageDialog(null, "Grattis, du vann!");
            }
        }
    };



    public List<Card> createListOfCardsToShow(List<Card> originalList) { // original listan består av 26 kort
        List<Card> listOfCardsToShow = new LinkedList<>();

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
            listOfCardsToShow.add(card);
            listOfCardsToShow.add(theOtherCard); // lägga till samma kort 2 gånger för att skapa ett par av detta kort
        }
        return listOfCardsToShow;
    }

    public static void main(String[] args) {
        GameScreen gameScreen = new GameScreen();
    }
}
