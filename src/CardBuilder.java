import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardBuilder {

    private List<Integer> duplicates = new ArrayList<>();
    private int randomIndex;
    private List<Card>cardsForGame = createCards();

    public List<Card> getCardsForGame() {
        return cardsForGame;
    }
    public CardBuilder() {
    }

    public List<Card>createCards(){
        List<Card>cardsCreated = new ArrayList<>();
        duplicates.clear();
        for (int i = 0; i < 12; i++) {
            while (true){
                randomIndex = (int) (Math.random() * 26); // 26 för att vi har 26 olika bokstäver i vår kortlek
                if (!duplicates.contains(randomIndex)) {
                    break;
                }
            }
            duplicates.add(randomIndex);
            if (randomIndex == 1){
                Card cardA = new Card();
                cardA.setLetter("A");
                cardA.setPicturePath("Pictures/A.jpg");
                cardA.setPronunciationPath("Sounds/Apa.wav");
                Card cardA2 = cardA;
                cardsCreated.add(cardA);
                cardsCreated.add(cardA2);
            } else if (randomIndex == 2) {
                Card cardB = new Card();
                cardB.setLetter("B");
                cardB.setPicturePath("Pictures/B.jpg");
                cardB.setPronunciationPath("Sounds/Boll.wav");
                Card cardB2 = cardB;
                cardsCreated.add(cardB);
                cardsCreated.add(cardB2);
            }else if (randomIndex == 3) {
                Card cardC = new Card();
                cardC.setLetter("C");
                cardC.setPicturePath("Pictures/C.jpg");
                cardC.setPronunciationPath("Sounds/Citron.wav");
                Card cardC2 = cardC;
                cardsCreated.add(cardC);
                cardsCreated.add(cardC2);
            }else if (randomIndex == 4) {
                Card cardD = new Card();
                cardD.setLetter("D");
                cardD.setPicturePath("Pictures/D.jpg");
                cardD.setPronunciationPath("Sounds/Druva.wav");
                Card cardD2 = cardD;
                cardsCreated.add(cardD);
                cardsCreated.add(cardD2);
            }else if (randomIndex == 5) {
                Card cardE = new Card();
                cardE.setLetter("E");
                cardE.setPicturePath("Pictures/E.jpg");
                cardE.setPronunciationPath("Sounds/Ekorre.wav");
                Card cardE2 = cardE;
                cardsCreated.add(cardE);
                cardsCreated.add(cardE2);
            }else if (randomIndex == 6) {
                Card cardF = new Card();
                cardF.setLetter("F");
                cardF.setPicturePath("Pictures/F.jpg");
                cardF.setPronunciationPath("Sounds/Får.wav");
                Card cardF2 = cardF;
                cardsCreated.add(cardF);
                cardsCreated.add(cardF2);
            }else if (randomIndex == 7) {
                Card cardG = new Card();
                cardG.setLetter("G");
                cardG.setPicturePath("Pictures/G.jpg");
                cardG.setPronunciationPath("Sounds/Glass.wav");
                Card cardG2 = cardG;
                cardsCreated.add(cardG);
                cardsCreated.add(cardG2);
            }else if (randomIndex == 8) {
                Card cardH = new Card();
                cardH.setLetter("H");
                cardH.setPicturePath("Pictures/H.jpg");
                cardH.setPronunciationPath("Sounds/Hus.wav");
                Card cardH2 = cardH;
                cardsCreated.add(cardH);
                cardsCreated.add(cardH2);
            }else if (randomIndex == 9) {
                Card cardI = new Card();
                cardI.setLetter("I");
                cardI.setPicturePath("Pictures/I.jpg");
                cardI.setPronunciationPath("Sounds/Is.wav");
                Card cardI2 = cardI;
                cardsCreated.add(cardI);
                cardsCreated.add(cardI2);
            }else if (randomIndex == 10) {
                Card cardJ = new Card();
                cardJ.setLetter("J");
                cardJ.setPicturePath("Pictures/J.jpg");
                cardJ.setPronunciationPath("Sounds/Jojo.wav");
                Card cardJ2 = cardJ;
                cardsCreated.add(cardJ);
                cardsCreated.add(cardJ2);
            } else if (randomIndex == 11) {
                Card cardK = new Card();
                cardK.setLetter("K");
                cardK.setPicturePath("Pictures/K.jpg");
                cardK.setPronunciationPath("Sounds/Katt.wav");
                Card cardK2 = cardK;
                cardsCreated.add(cardK);
                cardsCreated.add(cardK2);
            }else if (randomIndex == 12) {
                Card cardL = new Card();
                cardL.setLetter("L");
                cardL.setPicturePath("Pictures/L.jpg");
                cardL.setPronunciationPath("Sounds/Lök.wav");
                Card cardL2 = cardL;
                cardsCreated.add(cardL);
                cardsCreated.add(cardL2);
            }else if (randomIndex == 13) {
                Card cardM = new Card();
                cardM.setLetter("M");
                cardM.setPicturePath("Pictures/M.jpg");
                cardM.setPronunciationPath("Sounds/Måne.wav");
                Card cardM2 = cardM;
                cardsCreated.add(cardM);
                cardsCreated.add(cardM2);
            }else if (randomIndex == 14) {
                Card cardN = new Card();
                cardN.setLetter("N");
                cardN.setPicturePath("Pictures/N.jpg");
                cardN.setPronunciationPath("Sounds/Napp.wav");
                Card cardN2 = cardN;
                cardsCreated.add(cardN);
                cardsCreated.add(cardN2);
            }else if (randomIndex == 15) {
                Card cardO = new Card();
                cardO.setLetter("O");
                cardO.setPicturePath("Pictures/O.jpg");
                cardO.setPronunciationPath("Sounds/Orm.wav");
                Card cardO2 = cardO;
                cardsCreated.add(cardO);
                cardsCreated.add(cardO2);
            }else if (randomIndex == 16) {
                Card cardP = new Card();
                cardP.setLetter("P");
                cardP.setPicturePath("Pictures/P.jpg");
                cardP.setPronunciationPath("Sounds/Pil.wav");
                Card cardP2 = cardP;
                cardsCreated.add(cardP);
                cardsCreated.add(cardP2);
            }else if (randomIndex == 17) {
                Card cardQ = new Card();
                cardQ.setLetter("Q");
                cardQ.setPicturePath("Pictures/Q.jpg");
                cardQ.setPronunciationPath("Sounds/Qigong.wav");
                Card cardQ2 = cardQ;
                cardsCreated.add(cardQ);
                cardsCreated.add(cardQ2);
            } else if (randomIndex == 18) {
                Card cardR = new Card();
                cardR.setLetter("R");
                cardR.setPicturePath("Pictures/R.jpg");
                cardR.setPronunciationPath("Sounds/Ring.wav");
                Card cardR2 = cardR;
                cardsCreated.add(cardR);
                cardsCreated.add(cardR2);
            }else if (randomIndex == 19) {
                Card cardS = new Card();
                cardS.setLetter("S");
                cardS.setPicturePath("Pictures/S.jpg");
                cardS.setPronunciationPath("Sounds/Sol.wav");
                Card cardS2 = cardS;
                cardsCreated.add(cardS);
                cardsCreated.add(cardS2);
            }else if (randomIndex == 20) {
                Card cardT = new Card();
                cardT.setLetter("T");
                cardT.setPicturePath("Pictures/T.jpg");
                cardT.setPronunciationPath("Sounds/Träd.wav");
                Card cardT2 = cardT;
                cardsCreated.add(cardT);
                cardsCreated.add(cardT2);
            }else if (randomIndex == 21) {
                Card cardU = new Card();
                cardU.setLetter("U");
                cardU.setPicturePath("Pictures/U.jpg");
                cardU.setPronunciationPath("Sounds/Uggla.wav");
                Card cardU2 = cardU;
                cardsCreated.add(cardU);
                cardsCreated.add(cardU2);
            }else if (randomIndex == 22) {
                Card cardV = new Card();
                cardV.setLetter("V");
                cardV.setPicturePath("Pictures/V.jpg");
                cardV.setPronunciationPath("Sounds/Val.wav");
                Card cardV2 = cardV;
                cardsCreated.add(cardV);
                cardsCreated.add(cardV2);
            }else if (randomIndex == 23) {
                Card cardW = new Card();
                cardW.setLetter("W");
                cardW.setPicturePath("Pictures/W.jpg");
                cardW.setPronunciationPath("Sounds/Webbsida.wav");
                Card cardW2 = cardW;
                cardsCreated.add(cardW);
                cardsCreated.add(cardW2);
            }else if (randomIndex == 24) {
                Card cardX = new Card();
                cardX.setLetter("X");
                cardX.setPicturePath("Pictures/X.jpg");
                cardX.setPronunciationPath("Sounds/Xylofon.wav");
                Card cardX2 = cardX;
                cardsCreated.add(cardX);
                cardsCreated.add(cardX2);
            }else if (randomIndex == 25) {
                Card cardY = new Card();
                cardY.setLetter("Y");
                cardY.setPicturePath("Pictures/Y.jpg");
                cardY.setPronunciationPath("Sounds/Yxa.wav");
                Card cardY2 = cardY;
                cardsCreated.add(cardY);
                cardsCreated.add(cardY2);
            }else if (randomIndex == 26) {
                Card cardZ = new Card();
                cardZ.setLetter("Z");
                cardZ.setPicturePath("Pictures/Z.jpg");
                cardZ.setPronunciationPath("Sounds/Zebra.wav");
                Card cardZ2 = cardZ;
                cardsCreated.add(cardZ);
                cardsCreated.add(cardZ2);
            }
        }
        Collections.shuffle(cardsCreated);
        return cardsCreated;
    }

}