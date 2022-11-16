package org.javastudy.basicPackage;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date now = new Date();
		System.out.println(now);

		System.out.println(now.getYear() + 1900);// 년 1900~122
		System.out.println(now.getMonth() + 1);// 월
		System.out.println(now.getDate());// 일
		System.out.println(now.getHours());// 시
		System.out.println(now.getMinutes());// 분
		System.out.println(now.getSeconds());// 초
		System.out.println(now.getDay());// 요일->일요일 0

		System.out.println((now.getYear() + 1900) + "년" + (now.getMonth() + 1) + "월" + (now.getDate()) + "일"
				+ (now.getHours()) + "시" + (now.getMinutes()) + "분" + (now.getSeconds()) + "초");

	}
}
