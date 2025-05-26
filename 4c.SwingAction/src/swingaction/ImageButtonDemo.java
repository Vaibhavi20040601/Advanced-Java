package swingaction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Load image icons
        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hour_glass.png");

        // Create buttons with icons
        JButton btnDigitalClock = new JButton(digitalIcon);
        JButton btnHourGlass = new JButton(hourglassIcon);

        // Create label to display message
        JLabel messageLabel = new JLabel("Click an image button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Add action listeners
        btnDigitalClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(btnDigitalClock);
        frame.add(btnHourGlass);
        frame.add(messageLabel);

        // Center frame and make visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

