package org.study.commend_;

import java.util.Scanner;

import org.study.dao_.MemberDao_;
import org.study.dbconnect_.DBConnect_;

public class MemberInsertDo_ implements ExcuteQueryCommend_{

	@Override
	public void excuteCommend() {
		System.out.println("회원가입");
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("아이디: ");
		String userId=input.next();
		System.out.print("비밀번호: ");
		String userPw=input.next();
		System.out.print("나이: ");
		int age=input.nextInt();
		System.out.print("이메일: ");
		String email=input.next();
		
		MemberDao_ dao=new MemberDao_();
		
		int result=dao.insert(userId, userPw, age, email);
		
		if(result!=0) {//0이 아니면 ~ 0만 실패, 나머지 성공
			System.out.println("회원가입 Success");
		}else {
			System.out.println("회원가입 fail");
		}
		
	}



	
}
