import java.util.List;

public class SetOfCards {

    Card cardA = new Card("A", "Pictures/A.jpg");
    Card cardB = new Card("B", "Pictures/B.jpg");
    Card cardC = new Card("C", "Pictures/C.jpg");
    Card cardD = new Card("D", "Pictures/D.jpg");
    Card cardE = new Card("E", "Pictures/E.jpg");
    Card cardF = new Card("F", "Pictures/F.jpg");
    Card cardG = new Card("G", "Pictures/G.jpg");
    Card cardH = new Card("H", "Pictures/H.jpg");
    Card cardI = new Card("I", "Pictures/I.jpg");
    Card cardJ = new Card("J", "Pictures/J.jpg");
    Card cardK = new Card("K", "Pictures/K.jpg");
    Card cardL = new Card("L", "Pictures/L.jpg");
    Card cardM = new Card("M", "Pictures/M.jpg");
    Card cardN = new Card("N", "Pictures/N.jpg");
    Card cardO = new Card("O", "Pictures/O.jpg");
    Card cardP = new Card("P", "Pictures/P.jpg");
    Card cardQ = new Card("Q", "Pictures/Q.jpg");
    Card cardR = new Card("R", "Pictures/R.jpg");
    Card cardS = new Card("S", "Pictures/S.jpg");
    Card cardT = new Card("T", "Pictures/T.jpg");
    Card cardU = new Card("U", "Pictures/U.jpg");
    Card cardV = new Card("V", "Pictures/V.jpg");
    Card cardW = new Card("W", "Pictures/W.jpg");
    Card cardX = new Card("X", "Pictures/X.jpg");
    Card cardY = new Card("Y", "Pictures/Y.jpg");
    Card cardZ = new Card("Z", "Pictures/Z.jpg");

    private List<Card> listOfCards = List.of(cardA, cardB, cardC, cardD, cardE, cardF, cardG, cardH, cardI, cardJ, cardK,
            cardL, cardM, cardN, cardO, cardP, cardQ, cardR, cardS, cardT, cardU, cardV, cardW, cardX, cardY, cardZ);

    public SetOfCards(){}

    public List<Card> getListOfCards() {
        return listOfCards;
    }
}