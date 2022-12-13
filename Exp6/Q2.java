package Exp6;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 implements ActionListener {
    JFrame f;
    JLabel l, fnn, lnn;
    JTextField fn, ln;
    JButton s, r;

    Q2() {
        f = new JFrame("form");

        l = new JLabel("click on a button");
        l.setBounds(100, 50, 150, 30);

        fnn = new JLabel("enter first name");
        fnn.setBounds(50, 100, 150, 30);
        
        fn = new JTextField();
        fn.setBounds(150, 100, 150, 30);

        lnn = new JLabel("enter last");
        lnn.setBounds(50, 150, 150, 30);

        ln = new JTextField();
        ln.setBounds(150, 150, 150, 30);

        s = new JButton("submit");
        s.setBounds(100, 200, 100, 30);
        s.addActionListener(this);

        r = new JButton("reset");
        r.setBounds(100, 250, 100, 30);
        r.addActionListener(this);

        f.add(l);
        f.add(fn);
        f.add(fnn);
        f.add(lnn);
        f.add(ln);
        f.add(s);
        f.add(r);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setResizable(true);

    }

    public static void main(String[] args) {
        Q2 xyz = new Q2();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r) {
            fn.setText(" ");
            ln.setText(" ");

        }

    };

}
