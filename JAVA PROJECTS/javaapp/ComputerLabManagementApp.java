package javaapp;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ComputerLabManagementApp extends JFrame implements ActionListener{
	   // GUI components
    private JLabel ipLabel, valueLabel;
    private JTextField ipTextField, valueTextField;
    private JButton addButton, displayButton;
    private JTextArea displayArea;

    // ArrayList to hold computer details
    private ArrayList<Computer> computers = new ArrayList<Computer>();

    // Constructor
    public ComputerLabManagementApp() {
        setTitle("Computer Lab Management App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        // Initialize GUI components
        ipLabel = new JLabel("IP Address: ");
        valueLabel = new JLabel("Value Amount: ");
        ipTextField = new JTextField(20);
        valueTextField = new JTextField(20);
        addButton = new JButton("Add");
        displayButton = new JButton("Display");
        displayArea = new JTextArea(15, 30);
        displayArea.setEditable(false);

        // Add GUI components to JFrame
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(ipLabel);
        panel.add(ipTextField);
        panel.add(valueLabel);
        panel.add(valueTextField);
        panel.add(addButton);
        panel.add(displayButton);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Add action listeners to buttons
        addButton.addActionListener(this);
        displayButton.addActionListener(this);

        setVisible(true);
    }

    // Action listener method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Add computer details to ArrayList
            String ip = ipTextField.getText();
            double value = Double.parseDouble(valueTextField.getText());
            computers.add(new Computer(ip, value));
            // Clear text fields
            ipTextField.setText("");
            valueTextField.setText("");
        } else if (e.getSource() == displayButton) {
            // Display computer details in dialog box
            String message = "";
            for (Computer c : computers) {
                message += "IP Address: " + c.getIpAddress() + ", Value Amount: " + c.getValue() + "\n";
            }
            if (message.equals("")) {
                message = "No computers added yet.";
            }
            JOptionPane.showMessageDialog(this, message, "Computer Details", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Computer class to hold details
    private class Computer {
        private String ipAddress;
        private double value;

        public Computer(String ip, double v) {
            ipAddress = ip;
            value = v;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public double getValue() {
            return value;
        }
    }

    // Main method to run application
    public static void main(String[] args) {
        new ComputerLabManagementApp();
    }

}
