import java.util.List;

public class SetOfCards {

    Card cardA = new Card("A", "Pictures/A.jpg", "Sounds/Apa.wav");
    Card cardB = new Card("B", "Pictures/B.jpg", "Sounds/Boll.wav");
    Card cardC = new Card("C", "Pictures/C.jpg", "Sounds/Citron.wav");
    Card cardD = new Card("D", "Pictures/D.jpg", "Sounds/Druva.wav");
    Card cardE = new Card("E", "Pictures/E.jpg", "Sounds/Ekorre.wav");
    Card cardF = new Card("F", "Pictures/F.jpg", "Sounds/Får.wav");
    Card cardG = new Card("G", "Pictures/G.jpg", "Sounds/Glass.wav");
    Card cardH = new Card("H", "Pictures/H.jpg", "Sounds/Hus.wav");
    Card cardI = new Card("I", "Pictures/I.jpg", "Sounds/Is.wav");
    Card cardJ = new Card("J", "Pictures/J.jpg", "Sounds/Jojo.wav");
    Card cardK = new Card("K", "Pictures/K.jpg", "Sounds/Katt.wav");
    Card cardL = new Card("L", "Pictures/L.jpg", "Sounds/Lök.wav");
    Card cardM = new Card("M", "Pictures/M.jpg", "Sounds/Måne.wav");
    Card cardN = new Card("N", "Pictures/N.jpg", "Sounds/Napp.wav");
    Card cardO = new Card("O", "Pictures/O.jpg", "Sounds/Orm.wav");
    Card cardP = new Card("P", "Pictures/P.jpg", "Sounds/Pil.wav");
    Card cardQ = new Card("Q", "Pictures/Q.jpg", "Sounds/Qigong.wav");
    Card cardR = new Card("R", "Pictures/R.jpg", "Sounds/Ring.wav");
    Card cardS = new Card("S", "Pictures/S.jpg", "Sounds/Sol.wav");
    Card cardT = new Card("T", "Pictures/T.jpg", "Sounds/Träd.wav");
    Card cardU = new Card("U", "Pictures/U.jpg", "Sounds/Uggla.wav");
    Card cardV = new Card("V", "Pictures/V.jpg", "Sounds/Val.wav");
    Card cardW = new Card("W", "Pictures/W.jpg", "Sounds/Webbsida.wav");
    Card cardX = new Card("X", "Pictures/X.jpg", "Sounds/Xylofon.wav");
    Card cardY = new Card("Y", "Pictures/Y.jpg", "Sounds/Yxa.wav");
    Card cardZ = new Card("Z", "Pictures/Z.jpg", "Sounds/Zebra.wav");

    private List<Card> listOfCards = List.of(cardA, cardB, cardC, cardD, cardE, cardF, cardG, cardH, cardI, cardJ, cardK,
            cardL, cardM, cardN, cardO, cardP, cardQ, cardR, cardS, cardT, cardU, cardV, cardW, cardX, cardY, cardZ);

    public SetOfCards() {
    }

    public List<Card> getListOfCards() {
        return listOfCards;
    }
}