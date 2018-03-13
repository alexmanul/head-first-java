package lv.java.headfirst.chapter12;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel1 extends JPanel {

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("mango.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}
