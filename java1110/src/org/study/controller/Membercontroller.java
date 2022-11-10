package org.study.controller;

import java.util.Scanner;

import org.study.commend.DBQueryCommend;
import org.study.commend.MemberDeleteCommend;
import org.study.commend.MemberInsertCommend;
import org.study.commend.MemberSelectCommend;
import org.study.commend.MemberUpdateCommend;

public class Membercontroller {

	public static void main(String[] args) {

		// Scanner이용,while(true)
		// query->insert면 콘솔에 "회원가입Commend"
		// query->update면 콘솔에 "회원수정Commend"
		// query->delete면 콘솔에 "회원탈퇴Commend"
		// query->select면 콘솔에 "회원조회Commend"
		// query->exit면 콘솔에 "종료합니다"
		// query->나머지면 콘솔에 "입력쿼리 오류"
		// 다형성 이용해서 DBQueryCommend(부모타입)의 참조변수를 이용
		// 상속을 통해서 excuteQueryCommend() 오버라이드 해서
		// 서브(자식)클래스를 객체를 이용해서 구현 하시오
		
		DBQueryCommend commend;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("쿼리문 입력->  ");
			String query = input.next();
			if (query.equals("exit")) {
				System.out.print("종료합니다.");
				break;
			} else if (query.equals("insert")) {
				commend = new MemberInsertCommend();
				commend.excuteQueryCommend();
			} else if (query.equals("update")) {
				commend = new MemberUpdateCommend();
				commend.excuteQueryCommend();
			} else if (query.equals("delete")) {
				commend = new MemberDeleteCommend();
				commend.excuteQueryCommend();
			} else if (query.equals("select")) {
				commend = new MemberSelectCommend();
				commend.excuteQueryCommend();
			} else {
				System.out.println("입력쿼리 오류-> 다시입력하세요");
			}

		}
		
		input.close();

	}

}
