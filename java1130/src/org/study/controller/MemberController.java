package org.study.controller;

import java.util.Scanner;

import org.study.commend.MemberCommend;
import org.study.commend.MemberDeleteDo;
import org.study.commend.MemberInsertDo;
import org.study.commend.MemberSelectDo;
import org.study.commend.MemberUpdateDo;

public class MemberController {

	public static void main(String[] args) {
		// 1.Controller ->
		// 2.사용자요청(Request)받아서
		// 3.일을 시키고 Commend
		// 4.결과받아서 반환값을 이용해서
		// 5.다시 View로 응답

		Scanner input = new Scanner(System.in);
		String query = "";
		MemberCommend commend = null;
		
		while (true) {
			System.out.print("SQL문을 입력하세요(insert,update,select,delete): ");
			query = input.next();

			if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else if (query.equals("insert")) {
				commend = new MemberInsertDo();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateDo();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectDo();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteDo();
				commend.excuteQueryCommend();
			} else {
				System.out.println("query문 입력오류, 다시 입력해주세요");
			}

		}

	}
}
