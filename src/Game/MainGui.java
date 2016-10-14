package Game;

import javax.swing.*;

/**
 * Created by lennyhicks on 10/9/16.
 */
public class MainGui {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainGui");
        frame.setContentPane(new MainGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
