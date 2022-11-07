package org.javastudy.oop;

//접근지정장(제한자) class 클래스명
public class ClassBasicMain {

	//main->매서드
	//접근지정자 static(클래스 매서드) 반환타입 main((String[] args)
	public static void main(String[] args) {
		
		int i=10;
						//객체생성연산자->주소생성
						//new   ->인스턴스화(객체)
		ClassBasic c1=new ClassBasic();
		//c1->객체참조변수->객체
		
		c1.userId="m111";
		c1.userPw="1111";
		c1.age=20;
		
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println("id :"+c1.userId);
		System.out.println("password :"+c1.userPw);
		System.out.println("age :"+c1.age);
		
		//ClassBasic 타입의 객체를 생성하고 c2(객체참조변수)를 
		//이용해서 ,userId->"s1111",userPw->"22222",age->30으로 초기화하고 
		//콘솔에 출력
		System.out.println();
		
		ClassBasic c2=new ClassBasic();
		
		c2.userId="s1111";
		c2.userPw="22222";
		c2.age=30;
		
		System.out.println(c2);
		System.out.println(c2.getClass());
		System.out.println("id: "+c2.userId);
		System.out.println("password: "+c2.userPw);
		System.out.println("age: "+c2.age);
		
		
		
		
		
		
	}
	
	
	
}
