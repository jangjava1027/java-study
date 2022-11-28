package org.study.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {
	
	public SwingEx2() {
		setTitle("Swing EX2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//container 생성
		Container conPane=getContentPane();
		conPane.setBackground(Color.LIGHT_GRAY);
		conPane.setLayout(new FlowLayout());//레이아웃 설정-> 컴포넌트 배치 기준
		//컨테이너에 컴포넌트 추가		
		conPane.add(new JButton("OK"));
		conPane.add(new JButton("CANSEL"));
		conPane.add(new JButton("GO!"));
		
		setSize(300, 300);
		setVisible(true);		
	}	
	public static void main(String[] args) {
		new SwingEx2();
		
		
		
		
		
		
		
	}
	
}
