package org.javastudy.oop;

import java.util.Date;

class FiledEx {
	// 클래스의 필드
	// 인스턴스멤버
	public int num;// 기본자료형
	public String name;// String
	private int[] arr1;// 배열
	private Date day;// 라이브러리
	private Car car;// 다른클래스
	//클래스필드
	private static final String MEMBERNAME="JAVA";
	
	public static void method() {
		System.out.println(MEMBERNAME);
	}

}
