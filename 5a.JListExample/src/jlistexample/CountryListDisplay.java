package jlistexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryListDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                java.util.List<String> selected = countryList.getSelectedValuesList();
                System.out.println("Selected Countries: " + selected);
            }
        });

        frame.add(new JScrollPane(countryList));
        frame.setVisible(true);
    }
}
