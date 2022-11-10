package org.study.DBMemberController;

import java.util.Scanner;

import org.study.DBMemberCommend.MemberJoinCommend;
import org.study.DBMemberDto.MemberDTO;

public class MemberController {

	public static void main(String[] args) {
		//객체화(인스턴스)	  //객체참조변수(객체)
//		MemberJoinCommend commend1=new MemberJoinCommend();
//		MemberJoinCommend commend2=new MemberJoinCommend("제목1");
		
		//회원가입 MemberDTO
		//userId중복안되게
		MemberDTO member1=new MemberDTO("m1", "11", 10, "mansu", "서울시 노원구 상계동");
//		System.out.println(member1.getUserId());		
		MemberDTO member2=new MemberDTO("m2", "11", 10, "mansu", "서울시 노원구 상계동");
//		System.out.println(member2.getUserId());	
		MemberDTO member3=new MemberDTO("m3", "11", 10, "mansu", "서울시 노원구 상계동");
//		System.out.println(member3.getUserId());	
		MemberDTO member4=new MemberDTO("m4", "11", 10, "mansu", "서울시 노원구 상계동");
//		System.out.println(member4.getUserId());	
		MemberDTO member5=new MemberDTO("m5", "11", 10, "mansu", "서울시 노원구 상계동");
//		System.out.println(member5.getUserId());
		
//		String userId=member1.getUserId();
//		String userPw=member1.getUserPw();
		
//		System.out.println(userId);
//		System.out.println(userPw);
//		
//		if(userId.equals("m111")&& userPw.equals("1111")) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
//		
//		member1.getMemberDTO();
//		member2.getMemberDTO();
//		member3.getMemberDTO();
//		member4.getMemberDTO();
//		member5.getMemberDTO();
		
		Scanner input=new Scanner(System.in);
		System.out.println("회원가입");
		
		System.out.print("아이디 : ");
		String userId=input.next();
		
		System.out.print("비밀번호: ");
		String userPw=input.next();
		
		System.out.print("나이: ");
		int userAge=input.nextInt();
		
		System.out.print("이름: ");
		String userName=input.next();
		
		System.out.print("주소: ");
		String userAddr=input.next();
		
		MemberDTO member6=new MemberDTO(userId, userPw, userAge, userName, userAddr);
		
		member6.getMemberDTO();
		
		
		
		
		
	}

}
