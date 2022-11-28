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

public class JMenuEx extends JFrame implements ActionListener{

	Button btn;
	
	public JMenuEx() {
		super("JMenu EX");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		
		//파일 메뉴 만들기 --------------------------------------------------
		JMenu filemenu=new JMenu("파일(F)");//1차 메뉴탭 설정
		filemenu.setMnemonic('F');//단축키를 Alt+F로 설정
		
		JMenuItem newfile=new JMenuItem("새파일(N)");//2차 메뉴 탭(아이템)설정
		newfile.setMnemonic('N');//단축키를 Alt+N로 설정
		filemenu.add(newfile);//JMenuItem인 newfile을 JMenu의 filemenu에 저장
		
		JMenuItem open=new JMenuItem("열기(O)");
		open.setMnemonic('O');
		filemenu.add(open);
		
		JMenuItem save=new JMenuItem("저장(S)");
		open.setMnemonic('S');
		filemenu.add(save);
		
		JMenuItem close=new JMenuItem("닫기(C)");
		open.setMnemonic('C');
		filemenu.add(close);
		bar.add(filemenu);//JMenuBar에 JMenu 부착
		
		//도움말 메뉴 만들기-------------------------------------------------
		JMenu helpmenu=new JMenu("도움말(D)");
		helpmenu.setMnemonic('D');
		
		JMenuItem help=new JMenuItem("Help(H)");
		help.setMnemonic('H');
		helpmenu.add(help);
		bar.add(helpmenu);
		
		setSize(400, 300);//프레임 사이즈 설정
		setVisible(true);//보이기	
		
		btn=new Button("닫기(C)");//버튼 생성 안됨!!!!
		
		newfile.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		JDialog dial=new JDialog(this, "새파일");
		dial.setLayout(new FlowLayout(FlowLayout.CENTER,100,120));
		btn.setSize(100, 100);;
		dial.setSize(300, 200);
		dial.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		new JMenuEx();
//		j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
