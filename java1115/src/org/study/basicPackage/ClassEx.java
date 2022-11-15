package org.study.basicPackage;
//Orcle할때 필수로 쓰이는 것
public class ClassEx {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OrcleDriver");
			System.out.println("Oracle연동 success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle연동 fail");
 		}

	}
}
