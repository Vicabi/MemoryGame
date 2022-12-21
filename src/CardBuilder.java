import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardBuilder {

    private List<Integer> duplicates = new ArrayList<>();
    private int randomIndex;
    private List<Card> cardsForGame = createCards();

    public List<Card> getCardsForGame() {
        return cardsForGame;
    }

    public CardBuilder() {
    }

    public List<Card> createCards() {
        int cardsToMake = HomeScreen.settings.getDifficulty();
        List<Card> cardsCreated = new LinkedList<>();
        duplicates.clear();
        for (int i = 0; i < cardsToMake / 2; i++) { // viktigt att dela cardsToMake med två för att vi skapar par av kort
            while (true) {
                randomIndex = (int) (Math.random() * 25) + 1; // 26 för att vi har 26 olika bokstäver i vår kortlek
                if (!duplicates.contains(randomIndex)) {
                    break;
                }
            }
            duplicates.add(randomIndex);
            if (randomIndex == 1) {
                Card cardA = new Card();
                cardA.setLetter("A");
                cardA.setPicturePath("Pictures/A.jpg");
                cardA.setPronunciationPath("Sounds/Apa.wav");
                cardA.setPicture(cardA.getScaledImage());

                Card cardA2 = new Card();
                cardA2.setLetter("A");
                cardA2.setPicturePath("Pictures/A.jpg");
                cardA2.setPronunciationPath("Sounds/Apa.wav");
                cardA2.setPicture(cardA2.getScaledImage());

                cardsCreated.add(cardA);
                cardsCreated.add(cardA2);
            } else if (randomIndex == 2) {
                Card cardB = new Card();
                cardB.setLetter("B");
                cardB.setPicturePath("Pictures/B.jpg");
                cardB.setPronunciationPath("Sounds/Boll.wav");
                cardB.setPicture(cardB.getScaledImage());

                Card cardB2 = new Card();
                cardB2.setLetter("B");
                cardB2.setPicturePath("Pictures/B.jpg");
                cardB2.setPronunciationPath("Sounds/Boll.wav");
                cardB2.setPicture(cardB2.getScaledImage());

                cardsCreated.add(cardB);
                cardsCreated.add(cardB2);
            } else if (randomIndex == 3) {
                Card cardC = new Card();
                cardC.setLetter("C");
                cardC.setPicturePath("Pictures/C.jpg");
                cardC.setPronunciationPath("Sounds/Citron.wav");
                cardC.setPicture(cardC.getScaledImage());

                Card cardC2 = new Card();
                cardC2.setLetter("C");
                cardC2.setPicturePath("Pictures/C.jpg");
                cardC2.setPronunciationPath("Sounds/Citron.wav");
                cardC2.setPicture(cardC2.getScaledImage());

                cardsCreated.add(cardC);
                cardsCreated.add(cardC2);
            } else if (randomIndex == 4) {
                Card cardD = new Card();
                cardD.setLetter("D");
                cardD.setPicturePath("Pictures/D.jpg");
                cardD.setPronunciationPath("Sounds/Druva.wav");
                cardD.setPicture(cardD.getScaledImage());

                Card cardD2 = new Card();
                cardD2.setLetter("D");
                cardD2.setPicturePath("Pictures/D.jpg");
                cardD2.setPronunciationPath("Sounds/Druva.wav");
                cardD2.setPicture(cardD2.getScaledImage());

                cardsCreated.add(cardD);
                cardsCreated.add(cardD2);
            } else if (randomIndex == 5) {
                Card cardE = new Card();
                cardE.setLetter("E");
                cardE.setPicturePath("Pictures/E.jpg");
                cardE.setPronunciationPath("Sounds/Ekorre.wav");
                cardE.setPicture(cardE.getScaledImage());

                Card cardE2 = new Card();
                cardE2.setLetter("E");
                cardE2.setPicturePath("Pictures/E.jpg");
                cardE2.setPronunciationPath("Sounds/Ekorre.wav");
                cardE2.setPicture(cardE2.getScaledImage());

                cardsCreated.add(cardE);
                cardsCreated.add(cardE2);
            } else if (randomIndex == 6) {
                Card cardF = new Card();
                cardF.setLetter("F");
                cardF.setPicturePath("Pictures/F.jpg");
                cardF.setPronunciationPath("Sounds/Får.wav");
                cardF.setPicture(cardF.getScaledImage());

                Card cardF2 = new Card();
                cardF2.setLetter("F");
                cardF2.setPicturePath("Pictures/F.jpg");
                cardF2.setPronunciationPath("Sounds/Får.wav");
                cardF2.setPicture(cardF2.getScaledImage());

                cardsCreated.add(cardF);
                cardsCreated.add(cardF2);
            } else if (randomIndex == 7) {
                Card cardG = new Card();
                cardG.setLetter("G");
                cardG.setPicturePath("Pictures/G.jpg");
                cardG.setPronunciationPath("Sounds/Glass.wav");
                cardG.setPicture(cardG.getScaledImage());

                Card cardG2 = new Card();
                cardG2.setLetter("G");
                cardG2.setPicturePath("Pictures/G.jpg");
                cardG2.setPronunciationPath("Sounds/Glass.wav");
                cardG2.setPicture(cardG2.getScaledImage());

                cardsCreated.add(cardG);
                cardsCreated.add(cardG2);
            } else if (randomIndex == 8) {
                Card cardH = new Card();
                cardH.setLetter("H");
                cardH.setPicturePath("Pictures/H.jpg");
                cardH.setPronunciationPath("Sounds/Hus.wav");
                cardH.setPicture(cardH.getScaledImage());

                Card cardH2 = new Card();
                cardH2.setLetter("H");
                cardH2.setPicturePath("Pictures/H.jpg");
                cardH2.setPronunciationPath("Sounds/Hus.wav");
                cardH2.setPicture(cardH2.getScaledImage());

                cardsCreated.add(cardH);
                cardsCreated.add(cardH2);
            } else if (randomIndex == 9) {
                Card cardI = new Card();
                cardI.setLetter("I");
                cardI.setPicturePath("Pictures/I.jpg");
                cardI.setPronunciationPath("Sounds/Is.wav");
                cardI.setPicture(cardI.getScaledImage());

                Card cardI2 = new Card();
                cardI2.setLetter("I");
                cardI2.setPicturePath("Pictures/I.jpg");
                cardI2.setPronunciationPath("Sounds/Is.wav");
                cardI2.setPicture(cardI2.getScaledImage());

                cardsCreated.add(cardI);
                cardsCreated.add(cardI2);
            } else if (randomIndex == 10) {
                Card cardJ = new Card();
                cardJ.setLetter("J");
                cardJ.setPicturePath("Pictures/J.jpg");
                cardJ.setPronunciationPath("Sounds/Jojo.wav");
                cardJ.setPicture(cardJ.getScaledImage());

                Card cardJ2 = new Card();
                cardJ2.setLetter("J");
                cardJ2.setPicturePath("Pictures/J.jpg");
                cardJ2.setPronunciationPath("Sounds/Jojo.wav");
                cardJ2.setPicture(cardJ2.getScaledImage());

                cardsCreated.add(cardJ);
                cardsCreated.add(cardJ2);
            } else if (randomIndex == 11) {
                Card cardK = new Card();
                cardK.setLetter("K");
                cardK.setPicturePath("Pictures/K.jpg");
                cardK.setPronunciationPath("Sounds/Katt.wav");
                cardK.setPicture(cardK.getScaledImage());

                Card cardK2 = new Card();
                cardK2.setLetter("K");
                cardK2.setPicturePath("Pictures/K.jpg");
                cardK2.setPronunciationPath("Sounds/Katt.wav");
                cardK2.setPicture(cardK2.getScaledImage());

                cardsCreated.add(cardK);
                cardsCreated.add(cardK2);
            } else if (randomIndex == 12) {
                Card cardL = new Card();
                cardL.setLetter("L");
                cardL.setPicturePath("Pictures/L.jpg");
                cardL.setPronunciationPath("Sounds/Lök.wav");
                cardL.setPicture(cardL.getScaledImage());

                Card cardL2 = new Card();
                cardL2.setLetter("L");
                cardL2.setPicturePath("Pictures/L.jpg");
                cardL2.setPronunciationPath("Sounds/Lök.wav");
                cardL2.setPicture(cardL2.getScaledImage());

                cardsCreated.add(cardL);
                cardsCreated.add(cardL2);
            } else if (randomIndex == 13) {
                Card cardM = new Card();
                cardM.setLetter("M");
                cardM.setPicturePath("Pictures/M.jpg");
                cardM.setPronunciationPath("Sounds/Måne.wav");
                cardM.setPicture(cardM.getScaledImage());

                Card cardM2 = new Card();
                cardM2.setLetter("M");
                cardM2.setPicturePath("Pictures/M.jpg");
                cardM2.setPronunciationPath("Sounds/Måne.wav");
                cardM2.setPicture(cardM2.getScaledImage());

                cardsCreated.add(cardM);
                cardsCreated.add(cardM2);
            } else if (randomIndex == 14) {
                Card cardN = new Card();
                cardN.setLetter("N");
                cardN.setPicturePath("Pictures/N.jpg");
                cardN.setPronunciationPath("Sounds/Napp.wav");
                cardN.setPicture(cardN.getScaledImage());

                Card cardN2 = new Card();
                cardN2.setLetter("N");
                cardN2.setPicturePath("Pictures/N.jpg");
                cardN2.setPronunciationPath("Sounds/Napp.wav");
                cardN2.setPicture(cardN2.getScaledImage());

                cardsCreated.add(cardN);
                cardsCreated.add(cardN2);
            } else if (randomIndex == 15) {
                Card cardO = new Card();
                cardO.setLetter("O");
                cardO.setPicturePath("Pictures/O.jpg");
                cardO.setPronunciationPath("Sounds/Orm.wav");
                cardO.setPicture(cardO.getScaledImage());

                Card cardO2 = new Card();
                cardO2.setLetter("O");
                cardO2.setPicturePath("Pictures/O.jpg");
                cardO2.setPronunciationPath("Sounds/Orm.wav");
                cardO2.setPicture(cardO2.getScaledImage());

                cardsCreated.add(cardO);
                cardsCreated.add(cardO2);
            } else if (randomIndex == 16) {
                Card cardP = new Card();
                cardP.setLetter("P");
                cardP.setPicturePath("Pictures/P.jpg");
                cardP.setPronunciationPath("Sounds/Pil.wav");
                cardP.setPicture(cardP.getScaledImage());

                Card cardP2 = new Card();
                cardP2.setLetter("P");
                cardP2.setPicturePath("Pictures/P.jpg");
                cardP2.setPronunciationPath("Sounds/Pil.wav");
                cardP2.setPicture(cardP2.getScaledImage());

                cardsCreated.add(cardP);
                cardsCreated.add(cardP2);
            } else if (randomIndex == 17) {
                Card cardQ = new Card();
                cardQ.setLetter("Q");
                cardQ.setPicturePath("Pictures/Q.jpg");
                cardQ.setPronunciationPath("Sounds/Qigong.wav");
                cardQ.setPicture(cardQ.getScaledImage());

                Card cardQ2 = new Card();
                cardQ2.setLetter("Q");
                cardQ2.setPicturePath("Pictures/Q.jpg");
                cardQ2.setPronunciationPath("Sounds/Qigong.wav");
                cardQ2.setPicture(cardQ2.getScaledImage());

                cardsCreated.add(cardQ);
                cardsCreated.add(cardQ2);
            } else if (randomIndex == 18) {
                Card cardR = new Card();
                cardR.setLetter("R");
                cardR.setPicturePath("Pictures/R.jpg");
                cardR.setPronunciationPath("Sounds/Ring.wav");
                cardR.setPicture(cardR.getScaledImage());

                Card cardR2 = new Card();
                cardR2.setLetter("R");
                cardR2.setPicturePath("Pictures/R.jpg");
                cardR2.setPronunciationPath("Sounds/Ring.wav");
                cardR2.setPicture(cardR2.getScaledImage());

                cardsCreated.add(cardR);
                cardsCreated.add(cardR2);
            } else if (randomIndex == 19) {
                Card cardS = new Card();
                cardS.setLetter("S");
                cardS.setPicturePath("Pictures/S.jpg");
                cardS.setPronunciationPath("Sounds/Sol.wav");
                cardS.setPicture(cardS.getScaledImage());

                Card cardS2 = new Card();
                cardS2.setLetter("S");
                cardS2.setPicturePath("Pictures/S.jpg");
                cardS2.setPronunciationPath("Sounds/Sol.wav");
                cardS2.setPicture(cardS2.getScaledImage());

                cardsCreated.add(cardS);
                cardsCreated.add(cardS2);
            } else if (randomIndex == 20) {
                Card cardT = new Card();
                cardT.setLetter("T");
                cardT.setPicturePath("Pictures/T.jpg");
                cardT.setPronunciationPath("Sounds/Träd.wav");
                cardT.setPicture(cardT.getScaledImage());

                Card cardT2 = new Card();
                cardT2.setLetter("T");
                cardT2.setPicturePath("Pictures/T.jpg");
                cardT2.setPronunciationPath("Sounds/Träd.wav");
                cardT2.setPicture(cardT2.getScaledImage());

                cardsCreated.add(cardT);
                cardsCreated.add(cardT2);
            } else if (randomIndex == 21) {
                Card cardU = new Card();
                cardU.setLetter("U");
                cardU.setPicturePath("Pictures/U.jpg");
                cardU.setPronunciationPath("Sounds/Uggla.wav");
                cardU.setPicture(cardU.getScaledImage());

                Card cardU2 = new Card();
                cardU2.setLetter("U");
                cardU2.setPicturePath("Pictures/U.jpg");
                cardU2.setPronunciationPath("Sounds/Uggla.wav");
                cardU2.setPicture(cardU2.getScaledImage());

                cardsCreated.add(cardU);
                cardsCreated.add(cardU2);
            } else if (randomIndex == 22) {
                Card cardV = new Card();
                cardV.setLetter("V");
                cardV.setPicturePath("Pictures/V.jpg");
                cardV.setPronunciationPath("Sounds/Val.wav");
                cardV.setPicture(cardV.getScaledImage());

                Card cardV2 = new Card();
                cardV2.setLetter("V");
                cardV2.setPicturePath("Pictures/V.jpg");
                cardV2.setPronunciationPath("Sounds/Val.wav");
                cardV2.setPicture(cardV2.getScaledImage());

                cardsCreated.add(cardV);
                cardsCreated.add(cardV2);
            } else if (randomIndex == 23) {
                Card cardW = new Card();
                cardW.setLetter("W");
                cardW.setPicturePath("Pictures/W.jpg");
                cardW.setPronunciationPath("Sounds/Webbsida.wav");
                cardW.setPicture(cardW.getScaledImage());

                Card cardW2 = new Card();
                cardW2.setLetter("W");
                cardW2.setPicturePath("Pictures/W.jpg");
                cardW2.setPronunciationPath("Sounds/Webbsida.wav");
                cardW2.setPicture(cardW2.getScaledImage());

                cardsCreated.add(cardW);
                cardsCreated.add(cardW2);
            } else if (randomIndex == 24) {
                Card cardX = new Card();
                cardX.setLetter("X");
                cardX.setPicturePath("Pictures/X.jpg");
                cardX.setPronunciationPath("Sounds/Xylofon.wav");
                cardX.setPicture(cardX.getScaledImage());

                Card cardX2 = new Card();
                cardX2.setLetter("X");
                cardX2.setPicturePath("Pictures/X.jpg");
                cardX2.setPronunciationPath("Sounds/Xylofon.wav");
                cardX2.setPicture(cardX2.getScaledImage());

                cardsCreated.add(cardX);
                cardsCreated.add(cardX2);
            } else if (randomIndex == 25) {
                Card cardY = new Card();
                cardY.setLetter("Y");
                cardY.setPicturePath("Pictures/Y.jpg");
                cardY.setPronunciationPath("Sounds/Yxa.wav");
                cardY.setPicture(cardY.getScaledImage());

                Card cardY2 = new Card();
                cardY2.setLetter("Y");
                cardY2.setPicturePath("Pictures/Y.jpg");
                cardY2.setPronunciationPath("Sounds/Yxa.wav");
                cardY2.setPicture(cardY2.getScaledImage());

                cardsCreated.add(cardY);
                cardsCreated.add(cardY2);
            } else if (randomIndex == 26) {
                Card cardZ = new Card();
                cardZ.setLetter("Z");
                cardZ.setPicturePath("Pictures/Z.jpg");
                cardZ.setPronunciationPath("Sounds/Zebra.wav");
                cardZ.setPicture(cardZ.getScaledImage());

                Card cardZ2 = new Card();
                cardZ2.setLetter("Z");
                cardZ2.setPicturePath("Pictures/Z.jpg");
                cardZ2.setPronunciationPath("Sounds/Zebra.wav");
                cardZ2.setPicture(cardZ2.getScaledImage());

                cardsCreated.add(cardZ);
                cardsCreated.add(cardZ2);
            }
        }
        Collections.shuffle(cardsCreated);
        return cardsCreated;
    }
}