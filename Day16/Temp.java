package Day16;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class Temp extends JFrame {
   
    JLabel labelFahr;
    JLabel labelCels;
    JTextField textFahr;
    JTextField textCels;
    JRadioButton conFahToCel;
    JRadioButton conCelToFah;

    public Temp () {

        super ("Temperature");
        setLayout (new FlowLayout ());

        labelFahr = new JLabel ("Fahrenheit: ", SwingConstants.LEFT);
        labelFahr.setToolTipText("This is a temerature scale");
        add (labelFahr);
        textFahr = new JTextField (10);
        add (textFahr);

        labelCels = new JLabel ("Celsius:       ", SwingConstants.LEFT);
        labelCels.setToolTipText("This is a scale and unit of measurement for temperature");
        add (labelCels);
        textCels = new JTextField (10);
        add (textCels);

        conFahToCel = new JRadioButton ("Convert Fahrenheit to Celsius");
        add (conFahToCel);
        conCelToFah = new JRadioButton ("Convert Celsius to Fahrenheit");
        add (conCelToFah);

        JPanel panel = new JPanel(new GridLayout(2, 2, 12, 6));
        panel.add(labelFahr);
        panel.add(labelCels);
        panel.add(textFahr);
        panel.add(textCels);
        add(panel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(conFahToCel);
        buttonPanel.add(conCelToFah);   
        add(buttonPanel, BorderLayout.SOUTH);

        conFahToCel.addActionListener(new FahrListener ());
        conCelToFah.addActionListener(new CelsListener ());

    } 

    private class FahrListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == conFahToCel){
                int conFahToCel = (int) ((5.0/9.0 * (((Double.parseDouble(textFahr.getText())) -32))));
                textCels.setText(conFahToCel + " ?C");
                textFahr.requestFocus();
                textFahr.selectAll();
            }

        } 
    } 

    private class CelsListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == conCelToFah){
                int conCelToFah = (int) (( 9.0/5.0 * (((Double.parseDouble(textCels.getText())))))) + 32;
                textFahr.setText(conCelToFah + " ?F");
                textCels.requestFocus();
                textCels.selectAll();
            }

        } 
    } 
    
        public static void main(String[] args) {

            Temp app = new Temp ();
            app.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            app.setSize (500, 150); 
            app.setVisible (true); 
        } 
    } 
 