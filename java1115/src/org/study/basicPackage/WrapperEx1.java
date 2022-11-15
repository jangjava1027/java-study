package org.study.basicPackage;

public class WrapperEx1 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		System.out.println("기본타입 >>> Wrapper(박싱)");
		//박싱
		int i=10;		
		Integer it1=new Integer(i);
		
		Byte b1=new Byte((byte)10);
		Short s1=new Short((short)10);
		Integer i1=new Integer(10);
		Long l1=new Long(10);
		Float f1=new Float(1.1f);
		Double d1=new Double(1.1);
		Character ch1=new Character('a');
		Boolean bool1=new Boolean(false);
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch1);
		System.out.println(bool1);
		
	}
}
