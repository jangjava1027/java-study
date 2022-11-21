package org.study.collection;//패키지

import java.util.Date;//import 자동으로 import-> java.lang


public class ClassTypeMain {
	
	public static void main(String[] args) {
		
		//타입     //객체참조변수(객체의 주소저장)	 
		ClassType c1= new ClassType();
					  //객체생성
		
		//기본타입(prenitive)
		c1.num1=100;
		//객체타입
		c1.name="이름";
		c1.obj=new Object();
		c1.day=new Date();
		//private 멤버->setter,getter
		c1.setId("m1");
		c1.getId();
		
		
	}
}
