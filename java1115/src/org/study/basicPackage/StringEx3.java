package org.study.basicPackage;

import javax.management.Query;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println("String");

		String str1 = "java 2022 Project";
		System.out.println(str1.length());
		String str2 = str1.substring(5);

		String query4 = "/delete.do1";

		System.out.println(query4.substring(query4.length() - 3));
		System.out.println(query4.substring(query4.length() - 3).length());
		while (true) {
			System.out.println("입력문자열의 끝 3자리 값이 .do 일때 실행");
			
			String url=query4.substring(query4.length() - 3);
			
			if (url.equals(".do")) {
				System.out.println("입력값 오류!");
			} else if(url.equals("exit")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("입력값 오류! 다시 입력하세요.");
			}

		}
//				System.out.println(query1.substring(0, query1.length() - 3));
//				System.out.println(query2.substring(0, query2.length() - 3));
//				System.out.println(query3.substring(0, query3.length() - 3));
//				System.out.println(query4.substring(0, query4.length() - 3));

	}
}
