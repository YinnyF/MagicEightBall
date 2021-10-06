import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI() {
        // the window
        JFrame frame = new JFrame();

        // makes the panel
        JPanel panel = new JPanel();

        // a border object
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // a layout manager object
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // GUI with Swing - old school :)
        new GUI();


    }
}
