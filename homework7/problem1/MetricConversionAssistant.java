package problem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by fissehaye on 6/10/18.
 */
public class MetricConversionAssistant implements ActionListener {

    private double mile;
    private double pound;
    private double gallon;
    private double fahrenheit;

    private double kilometer;
    private double kilogram;
    private double liter;
    private double centigrade;

    private JFrame frame;

    private JLabel mileLabel;
    private JLabel poundLabel;
    private JLabel gallonLabel;
    private JLabel fahrenheitLabel;
    private JLabel kilometerLabel;
    private JLabel kilogramLabel;
    private JLabel litersLabel;
    private JLabel centigradeLabel;

    private JTextField mileTextField;
    private JTextField poundTextField;
    private JTextField gallonTextField;
    private JTextField fahrenheitTextField;

    private JTextField kilometerTextField;
    private JTextField kilogramTextField;
    private JTextField litersTextField;
    private JTextField centigradeTextField;

    private JButton convertButton;


    private StringBuilder reversedOutput = new StringBuilder();
    private StringBuilder duplicateRemovedOutput = new StringBuilder();


    public static void main(String[] args) {
        MetricConversionAssistant mca = new MetricConversionAssistant();
        mca.displayGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    private void displayGUI() {
        frame = new JFrame("Metric Conversion Assistant");


        mileLabel = new JLabel("Mile:");
        mileLabel.setBounds(50, 30, 100, 20);

        poundLabel = new JLabel("Pound:");
        poundLabel.setBounds(50, 55, 100, 20);

        gallonLabel = new JLabel("Gallon:");
        gallonLabel.setBounds(50, 80, 100, 20);

        fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitLabel.setBounds(50, 105, 100, 20);



        kilometerLabel = new JLabel("Kilometer:");
        kilometerLabel.setBounds(320, 30, 100, 20);

        kilogramLabel = new JLabel("Kilogram:");
        kilogramLabel.setBounds(320, 55, 100, 20);

        litersLabel = new JLabel("Liters:");
        litersLabel.setBounds(320, 80, 100, 20);

        centigradeLabel = new JLabel("Centigrade:");
        centigradeLabel.setBounds(320, 105, 100, 20);


        mileTextField = new JTextField();
        mileTextField.setBounds(140,30, 120,20);

        poundTextField = new JTextField();
        poundTextField.setBounds(140,55, 120,20);

        gallonTextField = new JTextField();
        gallonTextField.setBounds(140,80, 120,20);

        fahrenheitTextField = new JTextField();
        fahrenheitTextField.setBounds(140,105, 120,20);

        kilometerTextField = new JTextField();
        kilometerTextField.setBounds(410,30, 120,20);

        kilogramTextField = new JTextField();
        kilogramTextField.setBounds(410,55, 120,20);

        litersTextField = new JTextField();
        litersTextField.setBounds(410,80, 120,20);

        centigradeTextField = new JTextField();
        centigradeTextField.setBounds(410,105, 120,20);

        convertButton = new JButton("Convert");
        convertButton.setName("convert");
        convertButton.setBounds(270,180,100,20);
        convertButton.addActionListener( event -> {

            if (mileTextField.getText().length() > 0) {
                mile = Double.parseDouble(mileTextField.getText());
                kilometer = mile * 1.60934;

                BigDecimal bigDecimalKilometer = new BigDecimal(kilometer);
                bigDecimalKilometer = bigDecimalKilometer.round(new MathContext(3));
                double roundedKilometer = bigDecimalKilometer.doubleValue();

                kilometerTextField.setText(String.valueOf(roundedKilometer));
            }

            if (poundTextField.getText().length() > 0) {
                pound = Double.parseDouble(poundTextField.getText());
                kilogram = pound * 0.453592;

                BigDecimal bigDecimalKilogram = new BigDecimal(kilogram);
                bigDecimalKilogram = bigDecimalKilogram.round(new MathContext(4));
                double roundedKilogram = bigDecimalKilogram.doubleValue();

                kilogramTextField.setText(String.valueOf(roundedKilogram));
            }

            if (gallonTextField.getText().length() > 0) {
                gallon = Double.parseDouble(gallonTextField.getText());
                liter = Math.round(gallon * 3.78541);

                BigDecimal bigDecimalLiter = new BigDecimal(liter);
                bigDecimalLiter = bigDecimalLiter.round(new MathContext(3));
                double roundedLiter = bigDecimalLiter.doubleValue();

                litersTextField.setText(String.valueOf(roundedLiter));
            }

            if (fahrenheitTextField.getText().length() > 0) {
                fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                centigrade = (fahrenheit - 32) * (5/9);

                BigDecimal bigDecimalCentigrade= new BigDecimal(centigrade);
                bigDecimalCentigrade = bigDecimalCentigrade.round(new MathContext(3));
                double roundedCentigrade = bigDecimalCentigrade.doubleValue();

                centigradeTextField.setText(String.valueOf(roundedCentigrade));
            }
        });

        Container container = frame.getContentPane();

        container.add(mileLabel);
        container.add(poundLabel);
        container.add(gallonLabel);
        container.add(fahrenheitLabel);
        container.add(kilometerLabel);
        container.add(kilogramLabel);
        container.add(litersLabel);
        container.add(centigradeLabel);

        container.add(mileTextField);
        container.add(poundTextField);
        container.add(gallonTextField);
        container.add(fahrenheitTextField);
        container.add(kilometerTextField);
        container.add(kilogramTextField);
        container.add(litersTextField);
        container.add(centigradeTextField);


        container.add(convertButton);
        frame.setSize(600,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
