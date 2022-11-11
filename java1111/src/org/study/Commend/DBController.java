package org.study.Commend;

import java.util.Scanner;

public class DBController {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println("쿼리문 입력-> ");
			String query=input.next();
			switch(query) {
			case "exit":
				
			}
			if(query.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}else if(query.equals("insert")) {
				SQLQueryCommend i=new DBinsertDo();
				i.excuteQueryCommend();
			}else if(query.equals("update")) {
				SQLQueryCommend u=new DBupdateDo();
				u.excuteQueryCommend();
			}else if(query.equals("delete")) {
				SQLQueryCommend d=new DBdeleteDo();
				d.excuteQueryCommend();
			}else if(query.equals("select")) {
				SQLQueryCommend s=new DBselectDo();
				s.excuteQueryCommend();
			}else {
				System.out.println("입력오류! 다시입력하세요~");
			}
		}
		
		input.close();
		
		
		
	}
}
