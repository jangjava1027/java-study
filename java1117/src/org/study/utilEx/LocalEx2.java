package org.study.utilEx;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEx2 {

	public static void main(String[] args) {
		
		 LocalDateTime startDateTime=LocalDateTime.now();
		 LocalDateTime endDateTime=LocalDateTime.of(2023, 8, 1, 23, 59, 59);
		 System.out.println("기준날짜 :"+startDateTime);
		 System.out.println("기준날짜 :"+endDateTime);
		
		 boolean bool=startDateTime.isBefore(endDateTime);
		 System.out.println(bool);
		 
		 bool=startDateTime.isEqual(endDateTime);
		 System.out.println(bool);
		 
		 bool=startDateTime.isAfter(endDateTime);
		 System.out.println(bool);
		 if(startDateTime.isAfter(endDateTime)) {
			 System.out.println("선택날짜 이후입니다.");
		 }else {
			 System.out.println("선택날짜 이후가 아닙니다.");
		 }
		 //////////////////////////////////////////
		 ZonedDateTime utcZone=ZonedDateTime.now(ZoneId.of("UTC"));
		 System.out.println(utcZone);
		
		 ZonedDateTime seoulZone=ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		 System.out.println(seoulZone);
		 
		 
		 
		
	}
}
