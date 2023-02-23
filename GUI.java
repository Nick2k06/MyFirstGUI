import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    //Constructor
    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");

        //this allows the number of clicks to show past one digit
        label.setPreferredSize(new Dimension(200, 50));

        //Changes the background color
        button.setBackground(Color.decode("#FDFD96"));
        button.setOpaque(true);

        //Changes the text color of the button to black
        button.setForeground(Color.BLACK);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));

        panel.setBackground(Color.decode("#FDFD96"));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click this button!");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        if (count == 10) {
            label.setText("<html>Number of clicks: " + count + "<br>That's nothing.</html>");
            System.out.println("That's nothing.");
        } else if (count == 30) {
            label.setText("<html>Number of clicks: " + count + "<br>Getting better...</html>");
            System.out.println("Getting better...");
        } else if (count == 50) {
            label.setText("<html>Number of clicks: " + count + "<br>Are you not tired yet?</html>");
            System.out.println("Are you not tired yet?");
        } else if (count == 75) {
            label.setText("<html>Number of clicks: "+ count + "<br>You've got it!</html>");
            System.out.println("You've got it!");
        } else if (count == 100) {
            label.setText("<html>Number of clicks: " + count + "<br>Wow.</html>");
            System.out.println("Wow.");
        } else {
            label.setText("Number of clicks: " + count);
        }
    }
}