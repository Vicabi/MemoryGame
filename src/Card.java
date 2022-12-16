import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Card extends JLabel implements Flippable {

    String letter;
    private String picturePath;
    ImageIcon picture;
    private String pronunciationPath;
    private Color colorOfReverseSide = new Color(255, 102, 102);
    private boolean isFlipped;
    private boolean flipNoMore;

    public Card() {
        picture = getScaledImage();
        isFlipped = false;
        setOpaque(true);
        setBackground(getColorOfReverseSide());
        setBorder(new LineBorder(Color.WHITE, 3));
        setPreferredSize(new Dimension(175, 225));
    }

    public Card(String letter, String picturePath, String pronunciationPath) {
        this.letter = letter;
        this.picturePath = picturePath;
        this.pronunciationPath = pronunciationPath;
        picture = getScaledImage();
        isFlipped = false;
        setOpaque(true);
        setBackground(getColorOfReverseSide());
        setBorder(new LineBorder(Color.WHITE, 3));
        setPreferredSize(new Dimension(175, 225));
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

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
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

    public boolean isFlipNoMore() {
        return flipNoMore;
    }

    public void setFlipNoMore(boolean flipNoMore) {
        this.flipNoMore = flipNoMore;
    }

    @Override
    public void flipACardUp() {
        setIcon(picture);
        setFlipped(true);
    }

    public void flipACardDown() {
        setIcon(null);
        setFlipped(false);
    }

    public ImageIcon getScaledImage() {
        ImageIcon icon = new ImageIcon(this.picturePath);
        Image image = icon.getImage();
        Image imageScaled = image.getScaledInstance(165, 210, Image.SCALE_SMOOTH);
        return new ImageIcon(imageScaled);
    }
}