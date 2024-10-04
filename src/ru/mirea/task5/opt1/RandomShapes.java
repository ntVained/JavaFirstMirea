package ru.mirea.task5.opt1;

import javax.swing.*;

public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ShapePanel panel = new ShapePanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}
