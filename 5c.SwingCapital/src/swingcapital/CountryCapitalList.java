package swingcapital;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class CountryCapitalList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capitals");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Varies");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String country : countryList.getSelectedValuesList()) {
                    System.out.println(country + " → " + capitals.get(country));
                }
            }
        });

        frame.add(new JScrollPane(countryList));
        frame.setVisible(true);
    }
}

