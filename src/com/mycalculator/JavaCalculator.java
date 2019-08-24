package com.mycalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0; // set variable to store values
    private double total2 = 0.0;
    private char math_operator;

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
    private JLabel labelDeveloperName;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }

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

        // actions ie plus, minus, multiply, divide ...
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnAdd.getText();
                getOperator(buttonText);
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnSubtract.getText();
                getOperator(buttonText);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0.0;
                txtDisplay.setText("");
            }
        });

        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().equals("")){
                    txtDisplay.setText("0.");
                }
                else if (txtDisplay.getText().contains(".")){
                    btnDot.setEnabled(false);
                }
                else {
                    String btnDotText = txtDisplay.getText() + btnDot.getText();
                    txtDisplay.setText(btnDotText);
                }
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnDivide.getText();
                getOperator(buttonText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMultiply.getText();
                getOperator(buttonText);
            }
        });

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(txtDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(txtDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(txtDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(txtDisplay.getText());
                        break;
                }
                txtDisplay.setText(Double.toString(total2));
                total1 = 0.0;
            }
        });
    }

    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("C:/Users/Utilisateur/Documents/Java/calculator_icon.png");
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
