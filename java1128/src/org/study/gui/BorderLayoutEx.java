package org.study.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	public BorderLayoutEx() {// 프레임의 타이틀 달기
	setTitle("BorderLayout Title");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	//프레임 윈도우를 닫으면 프로그램을 종료
	setLayout(new BorderLayout());
	
	//BorderLayout 배치관리자 설정
	add(new JButton("Border APP"),BorderLayout.CENTER);
	add(new JButton("add"),BorderLayout.NORTH);
	add(new JButton("sub"),BorderLayout.SOUTH);
	add(new JButton("mul"),BorderLayout.EAST);
	add(new JButton("div"),BorderLayout.WEST);
	setSize(300, 200); //프레임 크기 300,200설정
	setVisible(true); //프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutEx();//자기자신의 클래스를 호출
		
		
	}
}
