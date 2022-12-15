import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    JPanel basePanel = new JPanel(new BorderLayout());
    JPanel topPanel = new JPanel(new GridLayout(1,2));
    JPanel cardPanel = new JPanel(new GridLayout(4, 6));
    JButton newGameButton = new JButton("Start new game");
    JButton shuffleButton = new JButton("Shuffle");
    SetOfCards setOfCards = new SetOfCards();
    List<Card> listOfCards;
    private List<Integer> duplicates = new ArrayList<>();
    private int randomIndex;

    public Main() {
        showGUI();

    }


    public void showGUI() {
        add(basePanel);
        basePanel.add(cardPanel, BorderLayout.CENTER);
        basePanel.add(topPanel, BorderLayout.NORTH);
        topPanel.add(newGameButton);
        topPanel.add(shuffleButton);

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
            basePanel.repaint();
        }

        if (e.getSource() == shuffleButton) {
            int j = cardPanel.getComponentCount();
            List <Point> tempList = new ArrayList<>();

            for (int i = 0; i < j; i++) {
                tempList.add(cardPanel.getComponent(i).getLocation());
            }

            Collections.shuffle(tempList);

            for (int i = 0; i < j; i++) {
                cardPanel.getComponent(i).setLocation(tempList.get(i));
            }

        }
    }

    MouseAdapter mouseListener = new MouseAdapter() {

        Card cardToCompareA;
        Card cardToCompareB;
        int numberCardsUp = 0;

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() instanceof JLabel && numberCardsUp == 0) {
                ((Card) e.getSource()).flipACard();
                cardToCompareA = (Card) e.getSource();
                numberCardsUp = 1;
            } else if (e.getSource() instanceof JLabel && numberCardsUp == 1) {
                ((Card) e.getSource()).flipACard();
                cardToCompareB = (Card) e.getSource();
                numberCardsUp = 0;
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
            listOfCardsToShow.add(card);
            listOfCardsToShow.add(theOtherCard); // lägga till samma kort 2 gånger för att skapa ett par av detta kort
        }
        return listOfCardsToShow;
    }
}