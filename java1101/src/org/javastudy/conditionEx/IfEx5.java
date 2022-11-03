package org.javastudy.conditionEx;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("조건이 두개 일때");

		Scanner input = new Scanner(System.in);

		System.out.print("국어 점수 입력: ");
		int kor = input.nextInt();
		
		if(kor>=90) {
			if(kor>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		}else if(kor>=80) {
			if(kor>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
			
		}else if(kor>=70) {
			if(kor>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
			
		}else if(kor>=60) {
			if(kor>=65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
			
		}else {
			System.out.println("F");
		}

//		// 90이상 A , 95이상이면 A+
//		if (kor >= 90) {
//			if (kor >= 95) {
//				System.out.println("A+");
//			} else {
//				System.out.println("A");
//			}
//		} else if (kor >= 80) {
//			// 80이상 B , 85이상이면 B+
//			if (kor >= 85) {
//				System.out.println("B+");
//			} else {
//				System.out.println("B");
//			}
//		} else if (kor >= 70) {
//			// 70이상 C , 75이상이면 C+
//			if (kor >= 75) {
//				System.out.println("C+");
//			} else {
//				System.out.println("C");
//			}
//		} else if (kor >= 60) {
//			// 60이상 D , 65이상이면 D+
//			if (kor >= 65) {
//				System.out.println("D+");
//			} else {
//				System.out.println("D");
//			}
//		} else {
//			// 60미만 F
//			System.out.println("F");
//		}
//
//		System.out.println("프로그램 종료합니다.");
//		input.close();

	}
}