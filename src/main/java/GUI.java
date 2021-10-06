import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        // the window
        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        // makes the panel
        panel = new JPanel();

        // a border object
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        // a layout manager object
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        // action to perform when button is clicked
        count++;
        label.setText("Number of clicks: " + count);
    }
}
