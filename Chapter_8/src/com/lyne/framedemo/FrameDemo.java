package com.lyne.framedemo;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Headfirst Java practice code.
 * @author nn_liu
 *
 */
public class FrameDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setTitle("Party");
		frame.setSize(300, 300);
		frame.setLocation(300, 200);
		frame.setVisible(true);
		
		JLabel label = new JLabel("Party Time!");
		Button button1 = new Button("You bet");
		Button button2 = new Button("Shoot me");
		Panel panel = new Panel();
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
