package problem1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by fissehaye on 6/6/18.
 */

public class StringOperations implements ActionListener {

    private JFrame frame;
    private JButton countLettersButton;
    private JButton reverseLettersButton;
    private JButton removeDuplicatesButton;
    private JTextField inputTextField;
    private JTextField outputTextField;
    private JLabel inputLabel;
    private JLabel outputLabel;

    private StringBuilder reversedOutput = new StringBuilder();
    private StringBuilder duplicateRemovedOutput = new StringBuilder();


    public static void main(String[] args) {
        StringOperations swingExample = new StringOperations();
        swingExample.displayGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String buttonName = button.getName();

        String inputText = inputTextField.getText();

        switch (buttonName) {

            case "count" :
                countCharacters(inputText);
                break;
            case "reverse" :
                reverseCharacters(inputText);
                break;
            case "remove" :
                removeDuplicateCharacters(inputText);
                break;
        }
    }

    private void displayGUI() {
        frame = new JFrame("Click");

        inputLabel = new JLabel("Input");
        inputLabel.setBounds(175, 30, 50, 15);
        inputTextField = new JTextField();
        inputTextField.setBounds(175,45, 300,20);


        outputLabel = new JLabel("Output");
        outputLabel.setBounds(175, 65, 50, 20);
        outputTextField = new JTextField();
        outputTextField.setBounds(175,85, 300,20);

        // Setup count letter button
        countLettersButton = new JButton("Count Letters");
        countLettersButton.setName("count");
        countLettersButton.setBounds(20,20,150,30);
        countLettersButton.addActionListener(this);

        // Setup reverse letters button
        reverseLettersButton = new JButton("Reverse Letters");
        reverseLettersButton.setName("reverse");
        reverseLettersButton.setBounds(20,52,150,30);
        reverseLettersButton.addActionListener(this);

        // Setup remove letters button
        removeDuplicatesButton = new JButton("Remove Duplicates");
        removeDuplicatesButton.setName("remove");
        removeDuplicatesButton.setBounds(20,84,150,30);
        removeDuplicatesButton.addActionListener(this);

        frame.add(countLettersButton);
        frame.add(reverseLettersButton);
        frame.add(removeDuplicatesButton);
        frame.add(inputLabel);
        frame.add(inputTextField);
        frame.add(outputLabel);
        frame.add(outputTextField);
        frame.setSize(600,180);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void countCharacters(String input) {

        int characterCount = input.length();
        outputTextField.setText("");
        outputTextField.setText(String.valueOf(characterCount));
    }

    private void reverseCharacters(String input) {
        String reversedOutput = reverseString(input);
        outputTextField.setText("");
        outputTextField.setText(reversedOutput);
    }

    private String reverseString(String input) {

        if (0 == input.length()) {
            return reversedOutput.toString();
        }
        reversedOutput.append(input.charAt(input.length() - 1));
        input = input.substring(0, input.length() - 1);

        return reverseString(input);
    }

    private void removeDuplicateCharacters(String input) {

        String outputText = removeDuplicateChars(input);
        outputTextField.setText("");
        outputTextField.setText(outputText);
    }

    private String removeDuplicateChars(String input) {

        if (input.length() == 0) {
            return duplicateRemovedOutput.toString();
        }

        if (duplicateRemovedOutput.toString().indexOf(input.charAt(0)) == -1) {
            duplicateRemovedOutput.append(input.charAt(0));
        }
        input = input.substring(1);
        return removeDuplicateChars(input);
    }

}
