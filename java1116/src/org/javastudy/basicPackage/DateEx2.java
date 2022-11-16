package org.javastudy.basicPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEx2 {

	public static void main(String[] args) {
		System.out.println("Date");

		Date now = new Date();
		System.out.println(now);

		// 일요일이 0
		int weekday = now.getDay();

		switch (weekday) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			System.out.println("해당요일이 없습니다.");

		}

		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
