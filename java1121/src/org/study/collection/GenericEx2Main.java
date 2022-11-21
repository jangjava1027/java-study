package org.study.collection;

public class GenericEx2Main<T> {

	public static void main(String[] args) {
		
		//제네릭타입
		GenericEx1<Integer> g1=new GenericEx1<Integer>();
		
//		g1.t1=new Integer(10);//박싱
		//자동박싱
		g1.t1=10;
		
//		int num1=g1.m1(10).intValue();//언박싱
		int num1=g1.m1(10);//자동언박싱
		
		//제네릭타입 String
		GenericEx1<String> g2=new GenericEx1<String>();
		g2.t1="String type";
		String str1=g2.m1("문자열");
		
		
		
		
		
	}
	
}
