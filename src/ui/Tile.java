package ui;

import javax.swing.*;
import java.awt.*;

public class Tile extends JLabel {

    public Tile() {
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        setOpaque(true);
        setBackground(Color.RED);
    }

}
