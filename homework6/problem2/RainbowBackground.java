package problem2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by fissehaye on 6/6/18.
 */
public class RainbowBackground implements ActionListener {

    private JButton redButton;
    private JButton yellowButton;
    private JButton greenButton;
    private JButton blueButton;
    private JButton orangeButton;
    private JButton pinkButton;
    private JButton magentaButton;

    private JFrame frame;
    private FlowLayout layout;

    public static void main(String[] args) {
        RainbowBackground rainbowBackground = new RainbowBackground();
        rainbowBackground.setUpComponents();
    }

    private void setUpComponents() {

        frame = new JFrame("Rainbow colors info");
        layout = null;

        Color violet = new Color(128, 0, 128);
        Color indigo = new Color(75, 0, 130);

        redButton = new JButton();
        redButton.setName("red");
        redButton.setOpaque(true);
        redButton.setBorderPainted(false);
        redButton.setBackground(Color.RED);
        redButton.setBounds(0,0,100,100);
        redButton.addActionListener(this);

        yellowButton = new JButton();
        yellowButton.setName("orange");
        yellowButton.setOpaque(true);
        yellowButton.setBorderPainted(false);
        yellowButton.setBackground(Color.ORANGE);
        yellowButton.setBounds(102,0,100,100);
        yellowButton.addActionListener(this);

        greenButton = new JButton();
        greenButton.setName("green");
        greenButton.setOpaque(true);
        greenButton.setBorderPainted(false);
        greenButton.setBackground(Color.GREEN);
        greenButton.setBounds(204,0,100,100);
        greenButton.addActionListener(this);

        blueButton = new JButton();
        blueButton.setName("blue");
        blueButton.setOpaque(true);
        blueButton.setBorderPainted(false);
        blueButton.setBackground(Color.BLUE);
        blueButton.setBounds(306,0,100,100);
        blueButton.addActionListener(this);

        orangeButton = new JButton();
        orangeButton.setName("yellow");
        orangeButton.setOpaque(true);
        orangeButton.setBorderPainted(false);
        orangeButton.setOpaque(true);
        orangeButton.setBorderPainted(false);
        orangeButton.setBackground(Color.YELLOW);
        orangeButton.setBounds(408,0,100,100);
        orangeButton.addActionListener(this);

        pinkButton = new JButton();
        pinkButton.setName("indigo");
        pinkButton.setOpaque(true);
        pinkButton.setBorderPainted(false);
        pinkButton.setBackground(indigo);
        pinkButton.setBounds(510,0,100,100);
        pinkButton.addActionListener(this);

        magentaButton = new JButton();
        magentaButton.setName("violet");
        magentaButton.setOpaque(true);
        magentaButton.setBorderPainted(false);
        magentaButton.setBackground(violet);
        magentaButton.setBounds(612,0,100,100);
        magentaButton.addActionListener(this);

        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);
        frame.add(blueButton);
        frame.add(orangeButton);
        frame.add(pinkButton);
        frame.add(magentaButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,120);
        frame.setLayout(layout);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String buttonName = button.getName();

        switch (buttonName) {

            case "red" :
                JOptionPane.showMessageDialog(button, "Red signifies passion, vitality, enthusiasm and security", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "orange" :
                JOptionPane.showMessageDialog(button, "Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "green" :
                JOptionPane.showMessageDialog(button, "Green denotes fertility, growth, balance, health and wealth", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "blue" :
                JOptionPane.showMessageDialog(button, "Blue is associated with Spirituality and Divinity", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "yellow" :
                JOptionPane.showMessageDialog(button, "Yellow represents clarity of thought, wisdom, orderliness and energy", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "indigo" :
                JOptionPane.showMessageDialog(button, "Indigo represents spirtual attainment, psychic abilities, self awareness", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "violet" :
                JOptionPane.showMessageDialog(button, "Violet is considered to be the symbol of the highest element of spirituality", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
