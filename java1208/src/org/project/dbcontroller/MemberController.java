package org.project.dbcontroller;

import java.util.Scanner;

import org.project.commend.MemberCommend;
import org.project.commend.MemberDelete;
import org.project.commend.MemberInsert;
import org.project.commend.MemberSearchIdDo;
import org.project.commend.MemberSelect;
import org.project.commend.MemberSort;
import org.project.commend.MemberUpdate;
import org.project.commend.MemberselectAge;
import org.project.commend.Membersort2;

public class MemberController {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String query="";
		
		MemberCommend commend=null;
		
		while(true) {
			System.out.print("쿼리문 입력: ");
			query=input.next();
			if(query.equals("insert")) {
				commend=new MemberInsert();
				commend.excuteCommend();
			}else if(query.equals("select")) {
				commend=new MemberSelect();
				commend.excuteCommend();
			}else if(query.equals("update")) {
				commend=new MemberUpdate();
				commend.excuteCommend();
			}else if(query.equals("delete")) {
				commend=new MemberDelete();
				commend.excuteCommend();
			}else if(query.equals("selectAge")) {
				commend=new MemberselectAge();
				commend.excuteCommend();
				//검색기능
			}else if(query.equals("searchId")) {
				commend=new MemberSearchIdDo();
				commend.excuteCommend();
			}else if(query.equals("sort")) {
				commend=new MemberSort();
				commend.excuteCommend();
			}else if(query.equals("sort2")) {
				commend=new Membersort2();
				commend.excuteCommend();
			}else if(query.equals("boardwrite")) {
				commend=new Boardwrite();
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
