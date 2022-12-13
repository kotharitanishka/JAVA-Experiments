package Exp6;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Q1 implements ActionListener {
    JFrame f;
    JLabel l;
    JTextField t;
    JButton b1, b2, b3;

    Q1() {
        f = new JFrame("buttons");

        l = new JLabel("click on a button");
        l.setBounds(100, 50, 150, 30);

        t = new JTextField();
        t.setBounds(100, 100, 150, 30);

        b1 = new JButton("B1");
        b1.setBounds(100, 150, 50, 30);
        b1.addActionListener(this);

        b2 = new JButton("B2");
        b2.setBounds(100, 200, 50, 30);
        b2.addActionListener(this);

        b3 = new JButton("B3");
        b3.setBounds(100, 250, 50, 30);
        b3.addActionListener(this);

        f.add(l);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setResizable(true);

    }

    public static void main(String[] args) {
        Q1 abc = new Q1();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t.setText("button b1 is pressed");
        } else if (e.getSource() == b2) {
            t.setText("button b2 is pressed");
        } else {
            t.setText("button b3 is pressed");
        }

    };

}
