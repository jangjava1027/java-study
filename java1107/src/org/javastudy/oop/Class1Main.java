package org.javastudy.oop;

public class Class1Main {

	public static void main(String[] args) {

		System.out.println("static멤버(클래스멤버)");

		Class1.title = "클래스멤버";
		Class1.classMethod();//
//		Class1.PROJECTNAME="final은 변경불가(상수)";
		
		System.out.println(Class1.PROJECTNAME);
		
		Class1 c1 = new Class1();
		c1.name = "m1";
		c1.age = 20;
		c1.title = "title1";
		c1.instanceMethod();
		
		
		
	}

}
