package org.javastudy.oop;

import java.util.Scanner;

public class CarBasicMain {

	public static void main(String[] args) {
		// 필드를 초기화 하고 콘솔에 출력
		// setters,getters를 이용해서

		// 기본생성자 생성자
		CarBasic c1 = new CarBasic();
		c1.setCarName("HCar");
		c1.setCarYear(2022);
		c1.setCarCoin(2000);

		System.out.print("carName: " + c1.getCarName());
		System.out.print("carYear: " + c1.getCarYear());
		System.out.println("carCoin: " + c1.getCarCoin());
		System.out.println();
		// 생성자2
		CarBasic c2 = new CarBasic("Kcar");
		c2.setCarYear(2023);
		c2.setCarCoin(3000);

		System.out.print("carName: " + c2.getCarName());
		System.out.print("carYear: " + c2.getCarYear());
		System.out.println("carCoin: " + c2.getCarCoin());
		System.out.println();
		// 생성자3
		CarBasic c3 = new CarBasic("DCar", 2023);
		c3.setCarCoin(3300);
		System.out.print("carName: " + c3.getCarName());
		System.out.print("carYear: " + c3.getCarYear());
		System.out.println("carCoin: " + c3.getCarCoin());
		System.out.println();
		// 생성자4
		CarBasic c4 = new CarBasic("TCar", 2022, 4000);
		System.out.print("carName: " + c4.getCarName());
		System.out.print("carYear: " + c4.getCarYear());
		System.out.println("carCoin: " + c4.getCarCoin());

	}

}
