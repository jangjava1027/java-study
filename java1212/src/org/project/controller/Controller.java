package org.project.controller;

import java.util.Scanner;

import org.project.commend.BoardId_list;
import org.project.commend.BoardWirter;
import org.project.commend.ExcuteCommend;
import org.project.commend.LoginDo;
import org.project.commend.MemberDeletetDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

public class Controller {
	

	public static void main(String[] args) {

	Scanner input=new Scanner(System.in);
	String query="";
	
	ExcuteCommend commend=null;
	
	while(true) {
		System.out.print("쿼리문 입력: ");
		query=input.next();
		if(query.equals("member_insert")) {
			commend=new MemberInsertDo();
			commend.excuteQueryCommend();
		}else if(query.equals("member_select")) {
			commend=new MemberSelectDo();
			commend.excuteQueryCommend();
		}else if(query.equals("member_update")) {
			commend=new MemberUpdateDo();
			commend.excuteQueryCommend();
		}else if(query.equals("member_delete")) {
			commend=new MemberDeletetDo();
			commend.excuteQueryCommend();
		}else if(query.equals("login")) {
			commend=new LoginDo();
			commend.excuteQueryCommend();
		}else if(query.equals("boardinsert")) {
			commend=new BoardWirter();
			commend.excuteQueryCommend();
		}else if(query.equals("boardId_list")) {
			commend=new BoardId_list();
			commend.excuteQueryCommend();
		}else if(query.equals("exit")) {
			System.out.println("종료");
			break;
		}else {
			System.out.println("쿼리문 입력오류. 다시 입력해주세요");
		}
	}
	}
}
