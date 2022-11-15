package org.study.basicPackage;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("String"); 
		//String 생성방법
		String str1="java2022";
		String str2=new String("java2022");
		char[] ch= {'j','a','v','a','2','0','2','2'};
		String str3=new String(ch);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		String s1="java";
		String s2="oracle";		
		System.out.println("String 주요매서드");		
		String strTest1="java 2022 Project";
		int size=strTest1.length();
		System.out.println("문자열 길이:"+size);//17개->16번지
		char strTest1ch=strTest1.charAt(5);
		System.out.println(strTest1ch);
		System.out.println(strTest1.codePointAt(5));
		//문자열 비교(사전순서)
		System.out.println(s1.compareTo(s2));
		System.out.println("m1".compareTo("m1"));
		System.out.println("m1".compareTo("a1"));
		//문자열 결합->원래 문자열은 그대로** 원본은 수정 되지 않는다.
		System.out.println(s1);
		System.out.println(s2);
		String s3=s1.concat(s2);
		System.out.println(s3);
		//문자열에 찾을 값이 포함되어 있는냐?
		System.out.println("m1234".contains("1"));
		//문자열 중에 값을 찾아 변경->원본은 수정 되지 않는다.
		String strTest2="java 2022 Project";
		String newstr1=strTest2.replace("2022", "2023");
		System.out.println(newstr1);
		//문자열을 "-"로 구분(잘라서) String배열화
		String phone="010-1234-4567";
		String[] phoneArr= phone.split("-");
		System.out.println(phoneArr.length);
//		System.out.println(phoneArr[0]);
//		System.out.println(phoneArr[1]);
//		System.out.println(phoneArr[2]);
	
		//for문 출력
		for(int i=0;i<phoneArr.length;i++) {
			System.out.println(phoneArr[i]);
		}
		
		//foreach문 출력
		System.out.println();
		
		for(String s:phoneArr) {
			System.out.println(s);
		}
		//대문자
		System.out.println("abcd".toUpperCase());
		//소문자
		System.out.println("ABCD".toLowerCase());
		
		String str4=" abcd ";
		System.out.println(str4.length());
		String str4Trim=str4.trim();
		System.out.println(str4Trim.length());
		
		
		
		
		
		
		
		
		
	}
}
