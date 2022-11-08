package org.javastudy.oop;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		System.out.println("회원가입");
		
		MemberDTO member=new MemberDTO();
//		member.setUserId("m11");
//		member.setUserPw("111");
//		member.setAge("22");
//		
//		System.out.print("아이디: "+member.getUserId());
//		System.out.print("비밀번호: "+member.getUserPw());
//		System.out.print("나이: "+member.getAge());
		
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.print("회원가입 하겠습니까?");
			String key=input.next();
			if(key.equals("n")) {
				System.out.println("종료합니다.");
				break;
			}else if(key.equals("y")) {
				System.out.println("회원정보를 입력해주세요.");
				System.out.print("아이디: ");
				member.setUserId(input.next());
				
				System.out.print("비밀번호: ");
				member.setUserPw(input.next());
				
				System.out.print("나이: ");
				member.setAge(input.next());
								
				System.out.print("id: "+member.getUserId());
				System.out.print("pw: "+member.getUserPw());
				System.out.println("age: "+member.getAge());
				
			}else {
				System.out.println("입력오류! 다시 입력하세요.");
				
			}		
			
		}		
		
	}
	
}
