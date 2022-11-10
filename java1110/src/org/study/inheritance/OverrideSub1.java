package org.study.inheritance;

public class OverrideSub1 extends OverrideParent {

	@Override
	public void excuteQuery(int num1, int num2) {
		System.out.println("OverrideSub1");
//		super.excuteQuery(100, 200);
	}
}
