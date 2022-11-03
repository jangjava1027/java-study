package org.javastudy.loofEx;

import java.util.Scanner;

public class WhileEx6 {

	public static void main(String[] args) {

		System.out.println("while(true)");
		//while(true)이용해서
		//아이디와 비밀번호가 일치하면 while문을 종료("로그인 성공")
		//일치하지 않으면("로그인 실패") 출력하고 다시 입력
		//로그인 성공하면 while문 종료 하는 프로그램을 작성하시오.
		//while,if,break,Scanner
		Scanner input=new Scanner(System.in);
		
		String dbId="root";
		String dbPw="1111";
		
		while(true) {
			System.out.print("아이디 입력: ");
			String id=input.next();
			
			System.out.print("비밀번호 입력: ");
			String pw=input.next();
			
			if(dbId.equals(id) && dbPw.equals(pw)) {
				System.out.println("로그인  성공");
				break;
			}else {
				System.out.println("로그인 실패-> 다시로그인 하세요.");
			}
			
			
		}
		
		input.close();
	}

}
