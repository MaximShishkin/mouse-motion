package ru.shishkin.mouseMotion;

import javax.swing.JFrame;

public class StartClass {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setBounds(10, 10, 100, 105);
		f.add(new PanelClass());
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}