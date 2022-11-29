package org.study.gui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenuEx2 extends JFrame implements ActionListener{
	
	JPanel jPanel;//메뉴바가 담길 패널
	JMenuBar jMenuBar;//메뉴바
	JMenu jMenu1,jMenu2;//메뉴1,2
	JMenuItem jMenuItem1,jMenuItem2,jMenuItem3,jMenuItem4,jMenuItem5,exit;//메뉴아이템
	
	public JMenuEx2() {
		super("JMenu2 Ex");
		jMenuBar=new JMenuBar();
		this.setJMenuBar(jMenuBar);//1.메뉴바 추가
		
		jMenu1=new JMenu("파일");
		jMenu2=new JMenu("도움말");
		
		jMenuItem1=new JMenuItem("새창");//메뉴1아이템
		jMenuItem2=new JMenuItem("메뉴1");//메뉴1아이템
		jMenuItem3=new JMenuItem("메뉴2");//메뉴1아이템
		jMenuItem4=new JMenuItem("메뉴3");//메뉴1아이템
		jMenuItem5=new JMenuItem("메뉴4");//메뉴1아이템
		exit=new JMenuItem("닫기");//메뉴2 아이템

		//2.메뉴에 메뉴아이템 추가
		jMenu1.add(jMenuItem1);
		jMenu1.add(jMenuItem2);
		jMenu1.add(jMenuItem3);
		jMenu1.add(jMenuItem4);
		jMenu1.add(jMenuItem5);
		jMenu2.add(exit);
		
		
		//3.메뉴바에 메뉴1,새창,메뉴2 추가
		jMenuBar.add(jMenu1);
		jMenuBar.add(jMenu2);
		
		
		
		this.setSize(400, 300);//컨테이너 크기 설정
		this.setVisible(true);//보여라~
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//
		//Android App ->이벤트 구현 방법
		//이벤트 구현1->익명클래스					리스너
		jMenuItem4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스 이용해서 이벤트 구현");
			}
		});
		//이벤트 구현2->람다식
		jMenuItem5.addActionListener((ActionListener)->{
			System.out.println("람다식 이용 이벤트 구현");
		});
		
		
		//이벤트 구현3->동시구현 방법(구현할 이벤트가 많을때 사용)
		jMenuItem1.addActionListener(this);
		jMenuItem2.addActionListener(this);
		jMenuItem3.addActionListener(this);
		exit.addActionListener(this);
	
	}
	//e->이벤트 실제 target
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트 target
		if(e.getSource()==exit) {
			System.out.println("종료합니다.");
			System.exit(0);
		}else if(e.getSource()==jMenuItem1) {
			System.out.println("새창 선택");
			newWindow();//매서드(새창띄우기)
		}else if(e.getSource()==jMenuItem2) {
			System.out.println("메뉴1 선택");
		}else if(e.getSource()==jMenuItem3) {
			System.out.println("메뉴2 선택");
		}
		
	}
	//Dialog 생성 매서드
	private void newWindow() {
		//컨테이너 JFrame,Jpanal
		//JFrame->윈도우
		//JPanal->그룹핑된
		Button btn=new Button("Close");//버튼 생성
		btn.setSize(100, 100);//버튼 사이즈
		
		JPanel jPanel=new JPanel();//패널 생성
		
		Dialog dialog=new Dialog(this, "새창열기");//새창열기 다이얼로그 생성
		dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));
		
		jPanel.add(btn);//패널에 버튼 추가
		dialog.add(jPanel);//다이얼 로그에 패널 추가
		
		dialog.setSize(300, 200);
		dialog.setVisible(true);
		
		//btn을 클릭하면 dialog가 보이지 않게 이벤트 구현
		
		//추상클래스
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dialog.setVisible(false);
//				System.out.println("새창닫기");
//			}
//		});
		//람다식
		btn.addActionListener((ActionListener)->{
			dialog.setVisible(false);
			System.out.println("새창닫기");
		});
		
		
//		btn.addActionListener(this);//타깃 설정다시해서 구현해야함 
		
		
		
	}
	public static void main(String[] args) {
		
		new JMenuEx2();
		
	}


}
