package lv.java.headfirst.chapter13.jFrameExamples;

import javax.swing.*;
import java.awt.*;

public class JFrameExampleE {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {

        JFrameExampleE gui = new JFrameExampleE();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button1 = new JButton("tesuji");
        JButton button2 = new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.NORTH, button1);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}


