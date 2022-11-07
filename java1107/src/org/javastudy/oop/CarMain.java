package org.javastudy.oop;

public class CarMain {

	public static void main(String[] args) {

		Car hCar = new Car();

		hCar.carName = "Hcar";
		hCar.carYear = 2022;
		hCar.carCoin = 3000;
		hCar.carColoer = "red";
		hCar.carCC = 2000;

		hCar.carinfo();

		System.out.println();

		Car mCar = new Car();

		mCar.carName = "Mcar";
		mCar.carYear = 2022;
		mCar.carCoin = 4500;
		mCar.carColoer = "bule";
		mCar.carCC = 2000;

		mCar.carinfo();

		System.out.println(hCar.getClass() == mCar.getClass());

	}

}
