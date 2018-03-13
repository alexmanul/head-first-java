package lv.java.headfirst.chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI3C implements ActionListener {

    private JFrame frame;

    public static void main(String[] args) {
        SimpleGUI3C gui = new SimpleGUI3C();
        gui.go();
    }

    public void go() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel2 drawPanel = new MyDrawPanel2();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}