package lv.java.headfirst.chapter13.jFrameExamples;

import javax.swing.*;
import java.awt.*;

public class JFrameExampleC {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {

        JFrameExampleC gui = new JFrameExampleC();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button1 = new JButton("tesuji");
        JButton button2 = new JButton("watari");
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.CENTER, button1);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}


