package org.study.basicPackage;

public class WrapperEx2 {

	public static void main(String[] args) {
		System.out.println("Wrapper클래스");
		//언박싱
		
		Byte b1=new Byte((byte)10);
		Short s1=new Short((short)10);
		Integer i1=new Integer(10);
		Long l1=new Long(10);
		Float f1=new Float(1.1f);
		Double d1=new Double(1.1);
		Character ch1=new Character('a');
		Boolean bool1=new Boolean(false);
		
		System.out.println("객체형 >>> 기본타입(언박싱)");
		byte b2=b1.byteValue();
		short s2=s1.shortValue();
		int i2=i1.intValue();
		long l2=l1.longValue();
		float f2=f1.floatValue();
		double d2=d1.doubleValue();
		char ch2=ch1.charValue();
		boolean bool2=bool1.booleanValue();
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bool2);
		
		
		
	}
}
