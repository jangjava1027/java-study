package org.javastudy.interfaceEx;

abstract class Ab1{
	abstract void ab1();
}
abstract class Ab2 extends Ab1{
	abstract void ab2();
}
//class Abc extends Ab1,Ab2
class Abc extends Ab2{

	@Override
	void ab2() {
		System.out.println("ab1M");
		
	}

	@Override
	void ab1() {
		System.out.println("ab2M");
	}
	
}


public class AbstractExMain extends Abc{

	public static void main(String[] args) {
		Ab1 ab1=new Abc();
		Ab2 ab2=new Abc();
		Abc ab3=new Abc();
		
		
		
	}
}
