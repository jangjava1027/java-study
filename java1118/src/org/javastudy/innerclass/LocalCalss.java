package org.javastudy.innerclass;

public class LocalCalss {

	public void localMethod() {
		
		class LocalClassBasic{
			void m1() {
				System.out.println("지역클래스 매서드");
			}
		}
		LocalClassBasic local=new LocalClassBasic();
		local.m1();
	}
}
