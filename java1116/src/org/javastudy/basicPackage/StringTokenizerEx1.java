package org.javastudy.basicPackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
//		String url="userId=m1111&userPw=1111&userName=s1111";		
//		StringTokenizer token=new StringTokenizer(url, "&");
//		System.out.println("토큰의 갯수: "+token.countTokens());
//		
//		//토큰이 있으면
//		while(token.hasMoreTokens()) {
//			String ntoken=token.nextToken();//다음토큰
//			System.out.println(ntoken);
//		}
//		System.out.println("=================================");
//		StringTokenizer이용해서 -구분기호를 콘솔에 출력
//		String phone="010-1234-5678";
//		StringTokenizer token2=new StringTokenizer(phone, "-");
//		
//		System.out.println("토큰의 갯수: "+token2.countTokens());
//		while(token2.hasMoreTokens()) {
//			String ntoken=token2.nextToken();
//			System.out.println(ntoken);
//		}
		
		Scanner input=new Scanner(System.in);
		System.out.print("아이디입력: ");
		String userId=input.next();
		String userId2="userId=".concat(userId);
		System.out.println(userId2);
		
		System.out.print("비밀번호 입력: ");
		String userPw=input.next();
		String userPw2="userPw=".concat(userPw);
		System.out.println(userPw2);
		
		System.out.print("이름 입력: ");
		String userName=input.next();
		String userName2="userName=".concat(userName);
		System.out.println(userName2);
		
		String s1=userId2.concat("&");
		String s2=userPw2.concat("&");
		String s3=s1.concat(s2);
		String s4=s3.concat(userName2);
		
		System.out.println(s4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
