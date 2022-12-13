import javax.swing.*;

public class Card extends JPanel implements Flippable {

    private String value;

    public Card (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
    }

    @Override
    public void flipACard(Card card){

    }
}
