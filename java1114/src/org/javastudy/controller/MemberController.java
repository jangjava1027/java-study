package org.javastudy.controller;

import java.util.Scanner;

import org.javastudy.commend.CRUDCommend;
import org.javastudy.commend.DBDeleteCommend;
import org.javastudy.commend.DBInsertCommend;
import org.javastudy.commend.DBSelectCommend;
import org.javastudy.commend.DBUpdateCommend;

public class MemberController {

	public static void main(String[] args) {

		CRUDCommend commend=null;
		
		Scanner input=new Scanner(System.in);
		boolean bool=true;
		while (bool) {
			System.out.print("쿼리문 입력: ");
			String query = input.next();

			if (query.equals("insert")) {
				commend = new DBInsertCommend();
				commend.excuteCommend();
			} else if (query.equals("update")) {
				commend = new DBUpdateCommend();
				commend.excuteCommend();
			} else if (query.equals("delete")) {
				commend = new DBDeleteCommend();
				commend.excuteCommend();
			} else if (query.equals("select")) {
				commend = new DBSelectCommend();
				commend.excuteCommend();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				bool=false;
//				break;
			} else {
				System.out.println("쿼리문 입력오류->다시 입력하세요.");
			}

		}

	}
}
