package lv.java.headfirst.chapter13.jFrameExamples;

import javax.swing.*;
import java.awt.*;

public class JFrameExampleA {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {

        JFrameExampleA gui = new JFrameExampleA();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button1 = new JButton("tesuji");
        JButton button2 = new JButton("watari");
        panel.add(button1);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}


