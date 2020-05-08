package ui;

import javax.swing.*;
import java.awt.*;

/**
 * app for running game and displaying panels
 */
public class ImpermissibleIsleApp extends JFrame {

    public ImpermissibleIsleApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(800, 650));

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
