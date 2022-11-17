package org.study.utilEx;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateEx {

	public static void main(String[] args) {
		System.out.println("LocalDate");
		
		LocalDate ldate =LocalDate.now();
		System.out.println(ldate);
		
		System.out.println(ldate.getYear());//년
		System.out.println(ldate.getMonth());//월,객체
		System.out.println(ldate.getMonthValue());//월숫자(7)
		System.out.println(ldate.getDayOfYear());//일(년기준)
		System.out.println(ldate.getDayOfMonth());//일(달기준)
		System.out.println(ldate.getDayOfWeek());//요일
		System.out.println(ldate.isLeapYear());//윤년여부
		System.out.println("LocalDate.of(2022,11,17)");
		
		LocalDate ldate2=LocalDate.of(2022, 11, 17);
		System.out.println(ldate2);
		
	}
	
}
