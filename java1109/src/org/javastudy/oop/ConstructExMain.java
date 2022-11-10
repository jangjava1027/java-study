package org.javastudy.oop;

public class ConstructExMain {

	public static void main(String[] args) {

		ConstructEx c1 = new ConstructEx();
		c1.setUserId("n0");
		c1.setUserPw("00");
		c1.setAge(19);
		System.out.println("id :" + c1.getUserId());
//		System.out.println(c1.toString());
		c1.info();

		ConstructEx c2 = new ConstructEx("m1");
		c2.setUserPw("01");
		c2.setAge(30);
		c2.info();

		ConstructEx c3 = new ConstructEx("m2", "03");
		c3.setAge(27);
		c3.info();

		ConstructEx c4 = new ConstructEx("m3", "04", 22);
		c4.info();

	}

}
