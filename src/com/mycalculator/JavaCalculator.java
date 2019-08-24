package com.mycalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField txtDisplay;
    private JButton btnClear;
    private JButton btn9;
    private JButton btnMultiply;
    private JButton btn1;
    private JButton btnSubtract;
    private JButton btn4;
    private JButton btn7;
    private JButton btnZero;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton btnDot;
    private JButton btn3;
    private JButton btn6;
    private JButton btnAdd;
    private JButton btnDivide;
    private JButton btnEqual;

    public JavaCalculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(btn1Text);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(btn2Text);

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(btn3Text);

            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(btn4Text);

            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(btn5Text);

            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(btn6Text);

            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = txtDisplay.getText() + btn7.getText();
                txtDisplay.setText(btn7Text);

            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8Text = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(btn8Text);

            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(btn9Text);

            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = txtDisplay.getText() + btnZero.getText();
                txtDisplay.setText(btnZeroText);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
