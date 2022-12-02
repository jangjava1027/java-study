package org.study.controller;

import java.util.Scanner;

import org.study.commend_.ExcuteQueryCommend_;
import org.study.commend_.MemberDeleteDo_;
import org.study.commend_.MemberInsertDo_;
import org.study.commend_.MemberSelectDo_;
import org.study.commend_.MemberUpdateDo_;

public class MemberController_ {

	public static void main(String[] args) {
		System.out.println("CRUD");
		Scanner input=new Scanner(System.in);
		String query="";
		
		ExcuteQueryCommend_ commend=null;
		
		while(true) {
			System.out.print("쿼리문 입력: ");
			query=input.next();
			if(query.equals("insert")) {
				commend=new MemberInsertDo_();
				commend.excuteCommend();
			}else if(query.equals("select")){
				commend=new MemberSelectDo_();
				commend.excuteCommend();
			}else if(query.equals("update")){
				commend=new MemberUpdateDo_();
				commend.excuteCommend();
			}else if(query.equals("delete")){
				commend=new MemberDeleteDo_();
				commend.excuteCommend();
			}else if(query.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("쿼리문 입력오류. 다시 입력해주세요");
			}
			
			
			
		}
		
		
	}
}
