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
                cardA.setOpaque(true);
                cardA.setBackground(cardA.getColorOfReverseSide());
                cardA.setBorder(new LineBorder(Color.WHITE, 3));
                cardA.setPreferredSize(new Dimension(175, 225));

                Card cardA2 = new Card();
                cardA2.setLetter("A");
                cardA2.setPicturePath("Pictures/A.jpg");
                cardA2.setPronunciationPath("Sounds/Apa.wav");
                cardA2.setPicture(cardA2.getScaledImage());
                cardA2.setOpaque(true);
                cardA2.setBackground(cardA2.getColorOfReverseSide());
                cardA2.setBorder(new LineBorder(Color.WHITE, 3));
                cardA2.setPreferredSize(new Dimension(175, 225));


                cardsCreated.add(cardA);
                cardsCreated.add(cardA2);
            } else if (randomIndex == 2) {
                Card cardB = new Card();
                cardB.setLetter("B");
                cardB.setPicturePath("Pictures/B.jpg");
                cardB.setPronunciationPath("Sounds/Boll.wav");
                cardB.setPicture(cardB.getScaledImage());
                cardB.setOpaque(true);
                cardB.setBackground(cardB.getColorOfReverseSide());
                cardB.setBorder(new LineBorder(Color.WHITE, 3));
                cardB.setPreferredSize(new Dimension(175, 225));

                Card cardB2 = new Card();
                cardB2.setLetter("B");
                cardB2.setPicturePath("Pictures/B.jpg");
                cardB2.setPronunciationPath("Sounds/Boll.wav");
                cardB2.setPicture(cardB2.getScaledImage());
                cardB2.setOpaque(true);
                cardB2.setBackground(cardB2.getColorOfReverseSide());
                cardB2.setBorder(new LineBorder(Color.WHITE, 3));
                cardB2.setPreferredSize(new Dimension(175, 225));


                cardsCreated.add(cardB);
                cardsCreated.add(cardB2);
            } else if (randomIndex == 3) {
                Card cardC = new Card();
                cardC.setLetter("C");
                cardC.setPicturePath("Pictures/C.jpg");
                cardC.setPronunciationPath("Sounds/Citron.wav");
                cardC.setPicture(cardC.getScaledImage());
                cardC.setOpaque(true);
                cardC.setBackground(cardC.getColorOfReverseSide());
                cardC.setBorder(new LineBorder(Color.WHITE, 3));
                cardC.setPreferredSize(new Dimension(175, 225));

                Card cardC2 = new Card();
                cardC2.setLetter("C");
                cardC2.setPicturePath("Pictures/C.jpg");
                cardC2.setPronunciationPath("Sounds/Citron.wav");
                cardC2.setPicture(cardC2.getScaledImage());
                cardC2.setOpaque(true);
                cardC2.setBackground(cardC2.getColorOfReverseSide());
                cardC2.setBorder(new LineBorder(Color.WHITE, 3));
                cardC2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardC);
                cardsCreated.add(cardC2);
            } else if (randomIndex == 4) {
                Card cardD = new Card();
                cardD.setLetter("D");
                cardD.setPicturePath("Pictures/D.jpg");
                cardD.setPronunciationPath("Sounds/Druva.wav");
                cardD.setPicture(cardD.getScaledImage());
                cardD.setOpaque(true);
                cardD.setBackground(cardD.getColorOfReverseSide());
                cardD.setBorder(new LineBorder(Color.WHITE, 3));
                cardD.setPreferredSize(new Dimension(175, 225));

                Card cardD2 = new Card();
                cardD2.setLetter("D");
                cardD2.setPicturePath("Pictures/D.jpg");
                cardD2.setPronunciationPath("Sounds/Druva.wav");
                cardD2.setPicture(cardD2.getScaledImage());
                cardD2.setOpaque(true);
                cardD2.setBackground(cardD2.getColorOfReverseSide());
                cardD2.setBorder(new LineBorder(Color.WHITE, 3));
                cardD2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardD);
                cardsCreated.add(cardD2);
            } else if (randomIndex == 5) {
                Card cardE = new Card();
                cardE.setLetter("E");
                cardE.setPicturePath("Pictures/E.jpg");
                cardE.setPronunciationPath("Sounds/Ekorre.wav");
                cardE.setPicture(cardE.getScaledImage());
                cardE.setOpaque(true);
                cardE.setBackground(cardE.getColorOfReverseSide());
                cardE.setBorder(new LineBorder(Color.WHITE, 3));
                cardE.setPreferredSize(new Dimension(175, 225));

                Card cardE2 = new Card();
                cardE2.setLetter("E");
                cardE2.setPicturePath("Pictures/E.jpg");
                cardE2.setPronunciationPath("Sounds/Ekorre.wav");
                cardE2.setPicture(cardE2.getScaledImage());
                cardE2.setOpaque(true);
                cardE2.setBackground(cardE2.getColorOfReverseSide());
                cardE2.setBorder(new LineBorder(Color.WHITE, 3));
                cardE2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardE);
                cardsCreated.add(cardE2);
            } else if (randomIndex == 6) {
                Card cardF = new Card();
                cardF.setLetter("F");
                cardF.setPicturePath("Pictures/F.jpg");
                cardF.setPronunciationPath("Sounds/Får.wav");
                cardF.setPicture(cardF.getScaledImage());
                cardF.setOpaque(true);
                cardF.setBackground(cardF.getColorOfReverseSide());
                cardF.setBorder(new LineBorder(Color.WHITE, 3));
                cardF.setPreferredSize(new Dimension(175, 225));

                Card cardF2 = new Card();
                cardF2.setLetter("F");
                cardF2.setPicturePath("Pictures/F.jpg");
                cardF2.setPronunciationPath("Sounds/Får.wav");
                cardF2.setPicture(cardF2.getScaledImage());
                cardF2.setOpaque(true);
                cardF2.setBackground(cardF2.getColorOfReverseSide());
                cardF2.setBorder(new LineBorder(Color.WHITE, 3));
                cardF2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardF);
                cardsCreated.add(cardF2);
            } else if (randomIndex == 7) {
                Card cardG = new Card();
                cardG.setLetter("G");
                cardG.setPicturePath("Pictures/G.jpg");
                cardG.setPronunciationPath("Sounds/Glass.wav");
                cardG.setPicture(cardG.getScaledImage());
                cardG.setOpaque(true);
                cardG.setBackground(cardG.getColorOfReverseSide());
                cardG.setBorder(new LineBorder(Color.WHITE, 3));
                cardG.setPreferredSize(new Dimension(175, 225));

                Card cardG2 = new Card();
                cardG2.setLetter("G");
                cardG2.setPicturePath("Pictures/G.jpg");
                cardG2.setPronunciationPath("Sounds/Glass.wav");
                cardG2.setPicture(cardG2.getScaledImage());
                cardG2.setOpaque(true);
                cardG2.setBackground(cardG2.getColorOfReverseSide());
                cardG2.setBorder(new LineBorder(Color.WHITE, 3));
                cardG2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardG);
                cardsCreated.add(cardG2);
            } else if (randomIndex == 8) {
                Card cardH = new Card();
                cardH.setLetter("H");
                cardH.setPicturePath("Pictures/H.jpg");
                cardH.setPronunciationPath("Sounds/Hus.wav");
                cardH.setPicture(cardH.getScaledImage());
                cardH.setOpaque(true);
                cardH.setBackground(cardH.getColorOfReverseSide());
                cardH.setBorder(new LineBorder(Color.WHITE, 3));
                cardH.setPreferredSize(new Dimension(175, 225));

                Card cardH2 = new Card();
                cardH2.setLetter("H");
                cardH2.setPicturePath("Pictures/H.jpg");
                cardH2.setPronunciationPath("Sounds/Hus.wav");
                cardH2.setPicture(cardH2.getScaledImage());
                cardH2.setOpaque(true);
                cardH2.setBackground(cardH2.getColorOfReverseSide());
                cardH2.setBorder(new LineBorder(Color.WHITE, 3));
                cardH2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardH);
                cardsCreated.add(cardH2);
            } else if (randomIndex == 9) {
                Card cardI = new Card();
                cardI.setLetter("I");
                cardI.setPicturePath("Pictures/I.jpg");
                cardI.setPronunciationPath("Sounds/Is.wav");
                cardI.setPicture(cardI.getScaledImage());
                cardI.setOpaque(true);
                cardI.setBackground(cardI.getColorOfReverseSide());
                cardI.setBorder(new LineBorder(Color.WHITE, 3));
                cardI.setPreferredSize(new Dimension(175, 225));

                Card cardI2 = new Card();
                cardI2.setLetter("I");
                cardI2.setPicturePath("Pictures/I.jpg");
                cardI2.setPronunciationPath("Sounds/Is.wav");
                cardI2.setPicture(cardI2.getScaledImage());
                cardI2.setOpaque(true);
                cardI2.setBackground(cardI2.getColorOfReverseSide());
                cardI2.setBorder(new LineBorder(Color.WHITE, 3));
                cardI2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardI);
                cardsCreated.add(cardI2);
            } else if (randomIndex == 10) {
                Card cardJ = new Card();
                cardJ.setLetter("J");
                cardJ.setPicturePath("Pictures/J.jpg");
                cardJ.setPronunciationPath("Sounds/Jojo.wav");
                cardJ.setPicture(cardJ.getScaledImage());
                cardJ.setOpaque(true);
                cardJ.setBackground(cardJ.getColorOfReverseSide());
                cardJ.setBorder(new LineBorder(Color.WHITE, 3));
                cardJ.setPreferredSize(new Dimension(175, 225));

                Card cardJ2 = new Card();
                cardJ2.setLetter("J");
                cardJ2.setPicturePath("Pictures/J.jpg");
                cardJ2.setPronunciationPath("Sounds/Jojo.wav");
                cardJ2.setPicture(cardJ2.getScaledImage());
                cardJ2.setOpaque(true);
                cardJ2.setBackground(cardJ2.getColorOfReverseSide());
                cardJ2.setBorder(new LineBorder(Color.WHITE, 3));
                cardJ2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardJ);
                cardsCreated.add(cardJ2);
            } else if (randomIndex == 11) {
                Card cardK = new Card();
                cardK.setLetter("K");
                cardK.setPicturePath("Pictures/K.jpg");
                cardK.setPronunciationPath("Sounds/Katt.wav");
                cardK.setPicture(cardK.getScaledImage());
                cardK.setOpaque(true);
                cardK.setBackground(cardK.getColorOfReverseSide());
                cardK.setBorder(new LineBorder(Color.WHITE, 3));
                cardK.setPreferredSize(new Dimension(175, 225));

                Card cardK2 = new Card();
                cardK2.setLetter("K");
                cardK2.setPicturePath("Pictures/K.jpg");
                cardK2.setPronunciationPath("Sounds/Katt.wav");
                cardK2.setPicture(cardK2.getScaledImage());
                cardK2.setOpaque(true);
                cardK2.setBackground(cardK2.getColorOfReverseSide());
                cardK2.setBorder(new LineBorder(Color.WHITE, 3));
                cardK2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardK);
                cardsCreated.add(cardK2);
            } else if (randomIndex == 12) {
                Card cardL = new Card();
                cardL.setLetter("L");
                cardL.setPicturePath("Pictures/L.jpg");
                cardL.setPronunciationPath("Sounds/Lök.wav");
                cardL.setPicture(cardL.getScaledImage());
                cardL.setOpaque(true);
                cardL.setBackground(cardL.getColorOfReverseSide());
                cardL.setBorder(new LineBorder(Color.WHITE, 3));
                cardL.setPreferredSize(new Dimension(175, 225));

                Card cardL2 = new Card();
                cardL2.setLetter("L");
                cardL2.setPicturePath("Pictures/L.jpg");
                cardL2.setPronunciationPath("Sounds/Lök.wav");
                cardL2.setPicture(cardL2.getScaledImage());
                cardL2.setOpaque(true);
                cardL2.setBackground(cardL2.getColorOfReverseSide());
                cardL2.setBorder(new LineBorder(Color.WHITE, 3));
                cardL2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardL);
                cardsCreated.add(cardL2);
            } else if (randomIndex == 13) {
                Card cardM = new Card();
                cardM.setLetter("M");
                cardM.setPicturePath("Pictures/M.jpg");
                cardM.setPronunciationPath("Sounds/Måne.wav");
                cardM.setPicture(cardM.getScaledImage());
                cardM.setOpaque(true);
                cardM.setBackground(cardM.getColorOfReverseSide());
                cardM.setBorder(new LineBorder(Color.WHITE, 3));
                cardM.setPreferredSize(new Dimension(175, 225));

                Card cardM2 = new Card();
                cardM2.setLetter("M");
                cardM2.setPicturePath("Pictures/M.jpg");
                cardM2.setPronunciationPath("Sounds/Måne.wav");
                cardM2.setPicture(cardM2.getScaledImage());
                cardM2.setOpaque(true);
                cardM2.setBackground(cardM2.getColorOfReverseSide());
                cardM2.setBorder(new LineBorder(Color.WHITE, 3));
                cardM2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardM);
                cardsCreated.add(cardM2);
            } else if (randomIndex == 14) {
                Card cardN = new Card();
                cardN.setLetter("N");
                cardN.setPicturePath("Pictures/N.jpg");
                cardN.setPronunciationPath("Sounds/Napp.wav");
                cardN.setPicture(cardN.getScaledImage());
                cardN.setOpaque(true);
                cardN.setBackground(cardN.getColorOfReverseSide());
                cardN.setBorder(new LineBorder(Color.WHITE, 3));
                cardN.setPreferredSize(new Dimension(175, 225));

                Card cardN2 = new Card();
                cardN2.setLetter("N");
                cardN2.setPicturePath("Pictures/N.jpg");
                cardN2.setPronunciationPath("Sounds/Napp.wav");
                cardN2.setPicture(cardN2.getScaledImage());
                cardN2.setOpaque(true);
                cardN2.setBackground(cardN2.getColorOfReverseSide());
                cardN2.setBorder(new LineBorder(Color.WHITE, 3));
                cardN2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardN);
                cardsCreated.add(cardN2);
            } else if (randomIndex == 15) {
                Card cardO = new Card();
                cardO.setLetter("O");
                cardO.setPicturePath("Pictures/O.jpg");
                cardO.setPronunciationPath("Sounds/Orm.wav");
                cardO.setPicture(cardO.getScaledImage());
                cardO.setOpaque(true);
                cardO.setBackground(cardO.getColorOfReverseSide());
                cardO.setBorder(new LineBorder(Color.WHITE, 3));
                cardO.setPreferredSize(new Dimension(175, 225));

                Card cardO2 = new Card();
                cardO2.setLetter("O");
                cardO2.setPicturePath("Pictures/O.jpg");
                cardO2.setPronunciationPath("Sounds/Orm.wav");
                cardO2.setPicture(cardO2.getScaledImage());
                cardO2.setOpaque(true);
                cardO2.setBackground(cardO2.getColorOfReverseSide());
                cardO2.setBorder(new LineBorder(Color.WHITE, 3));
                cardO2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardO);
                cardsCreated.add(cardO2);
            } else if (randomIndex == 16) {
                Card cardP = new Card();
                cardP.setLetter("P");
                cardP.setPicturePath("Pictures/P.jpg");
                cardP.setPronunciationPath("Sounds/Pil.wav");
                cardP.setPicture(cardP.getScaledImage());
                cardP.setOpaque(true);
                cardP.setBackground(cardP.getColorOfReverseSide());
                cardP.setBorder(new LineBorder(Color.WHITE, 3));
                cardP.setPreferredSize(new Dimension(175, 225));

                Card cardP2 = new Card();
                cardP2.setLetter("P");
                cardP2.setPicturePath("Pictures/P.jpg");
                cardP2.setPronunciationPath("Sounds/Pil.wav");
                cardP2.setPicture(cardP2.getScaledImage());
                cardP2.setOpaque(true);
                cardP2.setBackground(cardP2.getColorOfReverseSide());
                cardP2.setBorder(new LineBorder(Color.WHITE, 3));
                cardP2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardP);
                cardsCreated.add(cardP2);
            } else if (randomIndex == 17) {
                Card cardQ = new Card();
                cardQ.setLetter("Q");
                cardQ.setPicturePath("Pictures/Q.jpg");
                cardQ.setPronunciationPath("Sounds/Qigong.wav");
                cardQ.setPicture(cardQ.getScaledImage());
                cardQ.setOpaque(true);
                cardQ.setBackground(cardQ.getColorOfReverseSide());
                cardQ.setBorder(new LineBorder(Color.WHITE, 3));
                cardQ.setPreferredSize(new Dimension(175, 225));

                Card cardQ2 = new Card();
                cardQ2.setLetter("Q");
                cardQ2.setPicturePath("Pictures/Q.jpg");
                cardQ2.setPronunciationPath("Sounds/Qigong.wav");
                cardQ2.setPicture(cardQ2.getScaledImage());
                cardQ2.setOpaque(true);
                cardQ2.setBackground(cardQ2.getColorOfReverseSide());
                cardQ2.setBorder(new LineBorder(Color.WHITE, 3));
                cardQ2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardQ);
                cardsCreated.add(cardQ2);
            } else if (randomIndex == 18) {
                Card cardR = new Card();
                cardR.setLetter("R");
                cardR.setPicturePath("Pictures/R.jpg");
                cardR.setPronunciationPath("Sounds/Ring.wav");
                cardR.setPicture(cardR.getScaledImage());
                cardR.setOpaque(true);
                cardR.setBackground(cardR.getColorOfReverseSide());
                cardR.setBorder(new LineBorder(Color.WHITE, 3));
                cardR.setPreferredSize(new Dimension(175, 225));

                Card cardR2 = new Card();
                cardR2.setLetter("R");
                cardR2.setPicturePath("Pictures/R.jpg");
                cardR2.setPronunciationPath("Sounds/Ring.wav");
                cardR2.setPicture(cardR2.getScaledImage());
                cardR2.setOpaque(true);
                cardR2.setBackground(cardR2.getColorOfReverseSide());
                cardR2.setBorder(new LineBorder(Color.WHITE, 3));
                cardR2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardR);
                cardsCreated.add(cardR2);
            } else if (randomIndex == 19) {
                Card cardS = new Card();
                cardS.setLetter("S");
                cardS.setPicturePath("Pictures/S.jpg");
                cardS.setPronunciationPath("Sounds/Sol.wav");
                cardS.setPicture(cardS.getScaledImage());
                cardS.setOpaque(true);
                cardS.setBackground(cardS.getColorOfReverseSide());
                cardS.setBorder(new LineBorder(Color.WHITE, 3));
                cardS.setPreferredSize(new Dimension(175, 225));

                Card cardS2 = new Card();
                cardS2.setLetter("S");
                cardS2.setPicturePath("Pictures/S.jpg");
                cardS2.setPronunciationPath("Sounds/Sol.wav");
                cardS2.setPicture(cardS2.getScaledImage());
                cardS2.setOpaque(true);
                cardS2.setBackground(cardS2.getColorOfReverseSide());
                cardS2.setBorder(new LineBorder(Color.WHITE, 3));
                cardS2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardS);
                cardsCreated.add(cardS2);
            } else if (randomIndex == 20) {
                Card cardT = new Card();
                cardT.setLetter("T");
                cardT.setPicturePath("Pictures/T.jpg");
                cardT.setPronunciationPath("Sounds/Träd.wav");
                cardT.setPicture(cardT.getScaledImage());
                cardT.setOpaque(true);
                cardT.setBackground(cardT.getColorOfReverseSide());
                cardT.setBorder(new LineBorder(Color.WHITE, 3));
                cardT.setPreferredSize(new Dimension(175, 225));

                Card cardT2 = new Card();
                cardT2.setLetter("T");
                cardT2.setPicturePath("Pictures/T.jpg");
                cardT2.setPronunciationPath("Sounds/Träd.wav");
                cardT2.setPicture(cardT2.getScaledImage());
                cardT2.setOpaque(true);
                cardT2.setBackground(cardT2.getColorOfReverseSide());
                cardT2.setBorder(new LineBorder(Color.WHITE, 3));
                cardT2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardT);
                cardsCreated.add(cardT2);
            } else if (randomIndex == 21) {
                Card cardU = new Card();
                cardU.setLetter("U");
                cardU.setPicturePath("Pictures/U.jpg");
                cardU.setPronunciationPath("Sounds/Uggla.wav");
                cardU.setPicture(cardU.getScaledImage());
                cardU.setOpaque(true);
                cardU.setBackground(cardU.getColorOfReverseSide());
                cardU.setBorder(new LineBorder(Color.WHITE, 3));
                cardU.setPreferredSize(new Dimension(175, 225));

                Card cardU2 = new Card();
                cardU2.setLetter("U");
                cardU2.setPicturePath("Pictures/U.jpg");
                cardU2.setPronunciationPath("Sounds/Uggla.wav");
                cardU2.setPicture(cardU2.getScaledImage());
                cardU2.setOpaque(true);
                cardU2.setBackground(cardU2.getColorOfReverseSide());
                cardU2.setBorder(new LineBorder(Color.WHITE, 3));
                cardU2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardU);
                cardsCreated.add(cardU2);
            } else if (randomIndex == 22) {
                Card cardV = new Card();
                cardV.setLetter("V");
                cardV.setPicturePath("Pictures/V.jpg");
                cardV.setPronunciationPath("Sounds/Val.wav");
                cardV.setPicture(cardV.getScaledImage());
                cardV.setOpaque(true);
                cardV.setBackground(cardV.getColorOfReverseSide());
                cardV.setBorder(new LineBorder(Color.WHITE, 3));
                cardV.setPreferredSize(new Dimension(175, 225));

                Card cardV2 = new Card();
                cardV2.setLetter("V");
                cardV2.setPicturePath("Pictures/V.jpg");
                cardV2.setPronunciationPath("Sounds/Val.wav");
                cardV2.setPicture(cardV2.getScaledImage());
                cardV2.setOpaque(true);
                cardV2.setBackground(cardV2.getColorOfReverseSide());
                cardV2.setBorder(new LineBorder(Color.WHITE, 3));
                cardV2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardV);
                cardsCreated.add(cardV2);
            } else if (randomIndex == 23) {
                Card cardW = new Card();
                cardW.setLetter("W");
                cardW.setPicturePath("Pictures/W.jpg");
                cardW.setPronunciationPath("Sounds/Webbsida.wav");
                cardW.setPicture(cardW.getScaledImage());
                cardW.setOpaque(true);
                cardW.setBackground(cardW.getColorOfReverseSide());
                cardW.setBorder(new LineBorder(Color.WHITE, 3));
                cardW.setPreferredSize(new Dimension(175, 225));

                Card cardW2 = new Card();
                cardW2.setLetter("W");
                cardW2.setPicturePath("Pictures/W.jpg");
                cardW2.setPronunciationPath("Sounds/Webbsida.wav");
                cardW2.setPicture(cardW2.getScaledImage());
                cardW2.setOpaque(true);
                cardW2.setBackground(cardW2.getColorOfReverseSide());
                cardW2.setBorder(new LineBorder(Color.WHITE, 3));
                cardW2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardW);
                cardsCreated.add(cardW2);
            } else if (randomIndex == 24) {
                Card cardX = new Card();
                cardX.setLetter("X");
                cardX.setPicturePath("Pictures/X.jpg");
                cardX.setPronunciationPath("Sounds/Xylofon.wav");
                cardX.setPicture(cardX.getScaledImage());
                cardX.setOpaque(true);
                cardX.setBackground(cardX.getColorOfReverseSide());
                cardX.setBorder(new LineBorder(Color.WHITE, 3));
                cardX.setPreferredSize(new Dimension(175, 225));

                Card cardX2 = new Card();
                cardX2.setLetter("X");
                cardX2.setPicturePath("Pictures/X.jpg");
                cardX2.setPronunciationPath("Sounds/Xylofon.wav");
                cardX2.setPicture(cardX2.getScaledImage());
                cardX2.setOpaque(true);
                cardX2.setBackground(cardX2.getColorOfReverseSide());
                cardX2.setBorder(new LineBorder(Color.WHITE, 3));
                cardX2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardX);
                cardsCreated.add(cardX2);
            } else if (randomIndex == 25) {
                Card cardY = new Card();
                cardY.setLetter("Y");
                cardY.setPicturePath("Pictures/Y.jpg");
                cardY.setPronunciationPath("Sounds/Yxa.wav");
                cardY.setPicture(cardY.getScaledImage());
                cardY.setOpaque(true);
                cardY.setBackground(cardY.getColorOfReverseSide());
                cardY.setBorder(new LineBorder(Color.WHITE, 3));
                cardY.setPreferredSize(new Dimension(175, 225));

                Card cardY2 = new Card();
                cardY2.setLetter("Y");
                cardY2.setPicturePath("Pictures/Y.jpg");
                cardY2.setPronunciationPath("Sounds/Yxa.wav");
                cardY2.setPicture(cardY2.getScaledImage());
                cardY2.setOpaque(true);
                cardY2.setBackground(cardY2.getColorOfReverseSide());
                cardY2.setBorder(new LineBorder(Color.WHITE, 3));
                cardY2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardY);
                cardsCreated.add(cardY2);
            } else if (randomIndex == 26) {
                Card cardZ = new Card();
                cardZ.setLetter("Z");
                cardZ.setPicturePath("Pictures/Z.jpg");
                cardZ.setPronunciationPath("Sounds/Zebra.wav");
                cardZ.setPicture(cardZ.getScaledImage());
                cardZ.setOpaque(true);
                cardZ.setBackground(cardZ.getColorOfReverseSide());
                cardZ.setBorder(new LineBorder(Color.WHITE, 3));
                cardZ.setPreferredSize(new Dimension(175, 225));

                Card cardZ2 = new Card();
                cardZ2.setLetter("Z");
                cardZ2.setPicturePath("Pictures/Z.jpg");
                cardZ2.setPronunciationPath("Sounds/Zebra.wav");
                cardZ2.setPicture(cardZ2.getScaledImage());
                cardZ2.setOpaque(true);
                cardZ2.setBackground(cardZ2.getColorOfReverseSide());
                cardZ2.setBorder(new LineBorder(Color.WHITE, 3));
                cardZ2.setPreferredSize(new Dimension(175, 225));

                cardsCreated.add(cardZ);
                cardsCreated.add(cardZ2);
            }
        }
        Collections.shuffle(cardsCreated);
        return cardsCreated;
    }
}