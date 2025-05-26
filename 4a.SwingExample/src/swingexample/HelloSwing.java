package swingexample;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Swing Welcome");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

        // Set font to plain, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(800, 200);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}

