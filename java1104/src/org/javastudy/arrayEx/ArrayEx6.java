package org.javastudy.arrayEx;

public class ArrayEx6 {

	public static void main(String[] args) {

		System.out.println("char형 배열>>String");
		
		// .charAt(0)
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		
		
		String str1=new String(ch); //char형 String
		System.out.println(str1);
		
		String str2=String.valueOf(ch);
		System.out.println(str2);
	}
}
