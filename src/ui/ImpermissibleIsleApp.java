package ui;

import model.Board;
import model.decks.FloodDeck;
import model.decks.TreasureDeck;
import model.roles.RoleManager;

import javax.swing.*;
import java.awt.*;

/**
 * app for running game and displaying panels
 */
public class ImpermissibleIsleApp extends JFrame {

    GamePanel gamePanel; //panel that displays the tiles on the board
    Board board;
    FloodDeck floodDeck;
    TreasureDeck treasureDeck;
    RoleManager roleManager;

    /**
     * creates frame and panels to display on screen
     */
    public ImpermissibleIsleApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(800, 650));

        board = new Board();
        floodDeck = new FloodDeck();
        treasureDeck = new TreasureDeck();
        gamePanel = new GamePanel();
        roleManager = new RoleManager();

        add(gamePanel);

        pack();
        centerOnScreen();
        setVisible(true);
    }

    // centers.this
    private void centerOnScreen() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - getWidth()) / 2, (screen.height - getHeight()) / 2);
    }
}
