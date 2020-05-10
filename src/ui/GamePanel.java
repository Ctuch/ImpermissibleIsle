package ui;

import javax.swing.*;
import java.awt.*;

import static java.awt.Label.CENTER;

public class GamePanel extends JPanel {

    public GamePanel() {
        setLayout(new GridLayout(6,6, 10, 10));

        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.LIGHT_GRAY);
        createTiles();
    }

    private void createTiles() {
        for (int i = 0; i < 36; i++) {
            Tile tile = new Tile();
            tile.setText("hello");
            add(tile);
        }
    }

}
