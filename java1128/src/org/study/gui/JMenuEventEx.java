package org.study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEventEx extends JFrame implements ActionListener {

	JMenuBar jMenuB;
	JMenu jMenu;
	JMenuItem jMe_01, jMe_02;
	Button btn;

	public JMenuEventEx() {
		super("JMenuEventEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jMenuB=new JMenuBar();//MenuBar생성
		jMenu=new JMenu("메뉴");//JMenu생성
		jMe_01=new JMenuItem("메뉴1");//아이템생성
		jMe_02=new JMenuItem("메뉴2");//아이템생성
		btn=new Button("BUTTON");//button생성
		
		this.add(jMenuB);//프레임에 bar추가
		jMenuB.add(jMenu);//bar에 메뉴추가
		jMenu.add(jMe_01);//메뉴에 아이템추가
		jMenu.add(jMe_02);//메뉴에 아이템추가
		
		this.setSize(500, 400);//프레임 크기 설정
		this.setVisible(true);//보여라
		
		jMe_01.addActionListener(this);//이벤트 연결
		jMe_02.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JDialog dial=new JDialog(this, "다이얼로그");//다이얼로그 컴포넌트
		dial.setLayout(new FlowLayout(FlowLayout.CENTER,100,120));
		btn.setSize(100, 100);//다이얼로그 버튼
		dial.add(btn);// 버튼 추가
		dial.setSize(300, 200);
		dial.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);//다이얼로그 버튼 클릭하면 다이얼 안보임
			}
			
		});
				
	}

	public static void main(String[] args) {

		new JMenuEventEx();
	}
}
