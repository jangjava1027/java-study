package org.study.basicPackage;

public class StringEx1 {

	public static void main(String[] args) {
		System.out.println("String"); 
		
		String str01="java2022";
		String str02=new String("java2022");
		
		char[] ch={'j','a','v','a','2','0','2','2',};
		String str03=new String(ch);
		
		String str1="java2022";
		String str2="java2022";
		System.out.println(str1 == str2);//객체비교
		System.out.println(str1.equals(str2));//값
		
		String str3=new String("java2022");//스트링 객체
		String str4=new String("java2022");//힙에 저장
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
	}
}
