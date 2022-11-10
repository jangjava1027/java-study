package org.study.test;

import java.util.Scanner;

public class OverrideMain {

	public static void main(String[] args) {

//		ActionQuerylnsert a1=new ActionQuerylnsert();
//		a1.excuteQuery();
//		ActionQueryUpdate a2=new ActionQueryUpdate();
//		a2.excuteQuery();
//		ActionQueryDelete a3=new ActionQueryDelete();
//		a3.excuteQuery();
//		ActionQuerySelect a4=new ActionQuerySelect();
//		a4.excuteQuery();

//		//다형성
//		OverrideBasic action=new ActionQuerylnsert();
//		action.excuteQuery();
//		
//		action=new ActionQueryUpdate();
//		action.excuteQuery();
//		
//		action=new ActionQuerySelect();
//		action.excuteQuery();
//		
//		action=new ActionQueryDelete();
//		action.excuteQuery();

		// 실제 프로젝트 구현 모델
		OverrideBasic action;

		String query = "";

		System.out.print("쿼리문 입력하세요->");

		Scanner input = new Scanner(System.in);
		query = input.next();

		if (query.equals("insert")) {
			action = new ActionQuerylnsert();
			action.excuteQuery();
		} else if (query.equals("update")) {
			action = new ActionQueryUpdate();
			action.excuteQuery();
		} else if (query.equals("delete")) {
			action = new ActionQueryDelete();
			action.excuteQuery();
		} else if (query.equals("select")) {
			action = new ActionQuerySelect();
			action.excuteQuery();
		} else {
			System.out.println("SQL입력오류");
		}

		input.close();

	}
}
