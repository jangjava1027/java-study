package org.study.abstractEx;

import java.util.Scanner;

public class DBController {

	public static void main(String[] args) {
		
		//부모타입 객체참조변수->다형성 이용
//		SQLQueryCommend insert=new DBinsertDo();
//		insert.excuteQueryCommend();
//		SQLQueryCommend update=new DBUpdateDo();
//		update.excuteQueryCommend();
//		SQLQueryCommend delete=new DBDeleteDo();
//		delete.excuteQueryCommend();
//		SQLQueryCommend select=new DBSelectDo();
//		select.excuteQueryCommend();
				
		Scanner input=new Scanner(System.in);
		//while(true)문만 사용
//		while(true) {
//			System.out.print("쿼리문 입력-> ");
//			String  query=input.next();
//			if(query.equals("exit")) {
//				System.out.println("종료합니다.");
//				break;
//			}else if(query.equals("insert")) {
//				SQLQueryCommend insert=new DBinsertDo();
//				insert.excuteQueryCommend();
//			}else if(query.equals("update")) {
//				SQLQueryCommend update=new DBUpdateDo();
//				update.excuteQueryCommend();
//			}else if(query.equals("delete")) {
//				SQLQueryCommend delete=new DBDeleteDo();
//				delete.excuteQueryCommend();
//			}else if(query.equals("select")) {
//				SQLQueryCommend select=new DBSelectDo();
//				select.excuteQueryCommend();
//			}else {
//				System.out.println("쿼리 입력 오류 ! 다시 입력하세요.");
//			}
//			
//		}
//		input.close();
		//while문과 switch문 
		boolean run=true;
		
		while(run) {	
			System.out.print("쿼리문 입력: ");
			String query=input.next();
			
			switch(query) {
			case "exit":
				run=false;
				System.out.println("종료합니다.");
				break;
			case "insert":
				SQLQueryCommend insert=new DBinsertDo();
				insert.excuteQueryCommend();
				break;
			case "update":
				SQLQueryCommend update=new DBUpdateDo();
				update.excuteQueryCommend();
				break;
			case "delete":
				SQLQueryCommend delete=new DBDeleteDo();
				delete.excuteQueryCommend();
				break;
			case "select":
				SQLQueryCommend select=new DBSelectDo();
				select.excuteQueryCommend();
				break;
			default:
				System.out.println("입력오류! 다시 입력하세요.");
			}
		}
		input.close();
	}

}
