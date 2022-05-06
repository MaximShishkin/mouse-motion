package ru.shishkin.mouseMotion;

import javax.swing.JFrame;

public class Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 100, 105);
        frame.add(new Panel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
