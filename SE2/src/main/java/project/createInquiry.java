package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inquiry extends javax.swing.JFrame {
    private JLabel accountLabel;
    private JTextField accountField;
    private JButton searchButton;
    private JLabel inquiryLabel;
    private JTextField inquiryField;
    private JButton submitButton;

    public Inquiry() {
        initComponents();

        setTitle("Inquiry Form");
        setSize(500, 250);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountField.getText();
               
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inquiry = inquiryField.getText();
                
            }
        });
    }

    private void initComponents() {
        accountLabel = new JLabel("Account number:");
        accountField = new JTextField();
        searchButton = new JButton("Search");
        inquiryLabel = new JLabel("What is your inquiry?");
        inquiryField = new JTextField();
        submitButton = new JButton("Submit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        accountLabel.setBounds(20, 20, 120, 25);
        add(accountLabel);

        accountField.setBounds(150, 20, 200, 25);
        add(accountField);

        searchButton.setBounds(360, 20, 100, 25);
        add(searchButton);

        inquiryLabel.setBounds(20, 60, 150, 25);
        add(inquiryLabel);

        inquiryField.setBounds(180, 60, 280, 25);
        add(inquiryField);

        submitButton.setBounds(180, 100, 100, 30);
        add(submitButton);
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inquiry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

