package org.javastudy.interfaceEx;

interface In1{
//	public static final Int MAXNUM=100;//생략가능
	int MAXNUM=100;
//	public abstract void in1Method1();//기본 public->생략가능
	void in1Method1();
	default void defaultMethod() {//거의 안씀,선택
		System.out.println("defaultMethod");
	}
}
interface In2 extends In1{
	public abstract void excuteCommend();
}
class In12 implements In2{

	@Override
	public void in1Method1() {
		System.out.println("in1Method1 오버라이딩");
	}

	@Override
	public void excuteCommend() {
		System.out.println("excuteCommend 오버라이딩");
	}
	
}
public class InterfaceExMain {

	
	public static void main(String[] args) {
		
		In12 i12=new In12();
		In1 i1=new In12();
		In2 i2=new In12();
		
		
		
		
	}
}
