import javax.swing.*;
import java.awt.*;

public class Card extends JLabel implements Flippable {

    private String letter;
    private String picturePath;
    private String pronunciationPath;
    private Color colorOfReverseSide = new Color(255, 102, 102);
    private boolean isFlipped = false;

    public Card (){}

    public Card (String letter, String picturePath, String pronunciationPath) {
        this.letter = letter;
        this.picturePath = picturePath;
        this.pronunciationPath = pronunciationPath;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getPronunciationPath() {
        return pronunciationPath;
    }

    public void setPronunciationPath(String pronunciationPath) {
        this.pronunciationPath = pronunciationPath;
    }

    public Color getColorOfReverseSide() {
        return colorOfReverseSide;
    }

    public boolean isFlipped() {
        return isFlipped;
    }

    public void setFlipped(boolean flipped) {
        isFlipped = flipped;
    }

    @Override
    public void flipACard(){
        this.setIcon(getScaledImage());
    }

    public ImageIcon getScaledImage() {
        ImageIcon icon = new ImageIcon(this.picturePath);
        Image image = icon.getImage();
        Image imageScaled = image.getScaledInstance(165, 210, Image.SCALE_SMOOTH);
        return new ImageIcon(imageScaled);
    }
}