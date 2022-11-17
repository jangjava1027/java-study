package org.study.utilEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Connect Seccess!!");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oracle Driver Con nect Fail!!");
		}
		Date now=new Date();
		SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
		String day1=date.format(now);
		System.out.println(day1);
		
	}
}
