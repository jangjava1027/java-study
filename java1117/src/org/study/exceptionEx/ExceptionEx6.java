package org.study.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("Exception");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle Driver Null");
		}

		System.out.println("프로그램 정상 실행");

	}
}
