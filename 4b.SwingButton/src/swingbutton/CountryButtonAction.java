package swingbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonAction {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");

        // Create label to display the message
        JLabel messageLabel = new JLabel("Click a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Add action listeners
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(messageLabel);

        // Center and show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

