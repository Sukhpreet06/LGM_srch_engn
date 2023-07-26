package com.company;


import java.util.ArrayList;
import javax.swing.*;

        public class srch_engn extends JFrame {
            private JTextField searchField;
            private JTextArea resultsArea;

            public srch_engn() {
                // Create an ArrayList of Strings to search through
                ArrayList<String> texts = new ArrayList<>();
                texts.add("The quick brown fox jumps over the lazy dog.");
                texts.add("Java is a popular programming language.");
                texts.add("Snapchat is a social media app.");
                texts.add("Pollution of the environment is a serious problem of industrialized societies." +
                        " Industrial development and the green revolution"+" have had a negative impact on the environment." +
                        " People have converted the life support system of all living "+"people into their own resources and " +
                        "have greatly disrupted the natural ecological balance. Serious degradation and " +
                        "depletion have been caused due to overuse,"+" abuse and mismanagement of resources to meet human greed.");

                // Set up the GUI
                setTitle("Search Engine");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel();
                JLabel searchLabel = new JLabel("Enter a search term: ");
                searchField = new JTextField(8);
                JButton searchButton = new JButton("Search");
                searchButton.addActionListener(e -> {
                    // Loop through the ArrayList, printing out any Strings that contain the search term
                    String searchTerm = searchField.getText();
                    StringBuilder results = new StringBuilder();
                    for (String text : texts) {
                        if (text.contains(searchTerm)) {
                            results.append(text).append("\n");
                        }
                    }
                    resultsArea.setText(results.toString());
                });
                resultsArea = new JTextArea(10, 30);
                JScrollPane scrollPane = new JScrollPane(resultsArea);
                panel.add(searchLabel);
                panel.add(searchField);
                panel.add(searchButton);
                panel.add(scrollPane);
                add(panel);
                pack();
                setVisible(true);
            }

            public static void main(String[] args) {
                new srch_engn();
            }
        }
