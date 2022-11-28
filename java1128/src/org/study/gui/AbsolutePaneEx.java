package org.study.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsolutePaneEx extends JFrame{

	public AbsolutePaneEx() {
		this.setTitle("AbsolutePaneEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		
		JButton btn1=new JButton("BTN1");
		JButton btn2=new JButton("BTN2");
		JButton btn3=new JButton("BTN3");
		JButton btn4=new JButton("BTN4");
		
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		btn3.setSize(150, 50);
		btn4.setSize(150, 50);		
		
		btn1.setBackground(Color.cyan);
		btn1.setLocation(0, 0);//정중앙에 놓고 싶으면 setSize의 반만큼 빼주면 된다.
		
		btn2.setBackground(Color.green);
		btn2.setLocation(435, 0);
		
		btn3.setBackground(Color.magenta);
		btn3.setLocation(435, 511);
		
		btn4.setBackground(Color.orange);
		btn4.setLocation(0, 511);
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		
		//Object,JFrame
		this.add(panel);
		this.setSize(600, 600);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new AbsolutePaneEx();
		
		
	}
}
