package org.javastudy.oop;

//접근지정장(제한자) class 클래스명
public class ClassBasic {

	
		
		//필드. 속성, 프로퍼티
		//저근지정자 타입 필드명
		public String userId;
		public String userPw;
		public int age;
		
		//생성자->construct
		public ClassBasic() {
			System.out.println("생성자(기본)");
		}
		
		
		//접근지정자 반환타입 매서드명(매개인자..)
		public void instnanceMethod() {
			System.out.println("매서드(인스턴스)");
		}
		
		
	}
	
	

