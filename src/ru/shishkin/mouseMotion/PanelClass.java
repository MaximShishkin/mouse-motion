package ru.shishkin.mouseMotion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelClass extends JPanel {
	
	Robot rob;
	int x=400,y=350;
	Random rnd = new Random();
	
	Timer timer = new Timer(30000, new ActionListener() {
	    public void actionPerformed(ActionEvent ev) {
	    
	    	LocalDateTime time = LocalDateTime.now();
			
			if (time.getMinute() % 2 == 0) {
				rob.mouseMove(x+rnd.nextInt(200), y+rnd.nextInt(150));
				System.out.println("WOW! ������");
			}
			else {
				rob.mouseMove(x-rnd.nextInt(200), y-rnd.nextInt(150));
				System.out.println("WOW! ��������");
			}
	    }
    });
	
	PanelClass()
	{
		
		try {
			rob=new Robot();
		} catch (AWTException e) {
			// TODO ������������� ��������� ���� catch
			e.printStackTrace();
		}
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBounds(10, 10, 50, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				timer.start();
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("END");
		btnNewButton1.setBounds(60, 10, 50, 50);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				timer.stop();
			}
		});
		add(btnNewButton1);
	}
}
