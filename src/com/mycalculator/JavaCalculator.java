package com.mycalculator;

import javax.swing.*;

public class JavaCalculator {
    private JPanel JavaCalculator;
    private JTextField textField1;
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
