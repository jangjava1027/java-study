package org.study.inheritance;

public class OverrideParentMain {

	public static void main(String[] args) {
		
		OverrideSub1 override1=new OverrideSub1();
		override1.excuteQuery(10,20);
		OverrideSub2 override2=new OverrideSub2();
		override2.excuteQuery(20,30);
		OverrideSub3 override3=new OverrideSub3();
		override3.excuteQuery(30,40);
		
		
		
	}
}
