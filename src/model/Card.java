package model;

import javax.swing.*;
import java.awt.*;

public class Card extends JLabel {

    private CardType cardType;
    private String cardName;

    public Card(String cardName, CardType cardType) {
        init();
        this.cardType = cardType;
        this.cardName = cardName;
    }
    public Card(CardType cardType) {
        init();
        this.cardType = cardType;
        cardName = cardType.toString();
    }

    private void init() {
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        setOpaque(true);
        setBackground(Color.BLUE);
    }




}
