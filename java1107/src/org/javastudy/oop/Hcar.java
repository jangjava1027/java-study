package org.javastudy.oop;

public class Hcar {

	public static void main(String[] args) {

		Car h1 = new Car();
		h1.carName = "HCar";
		h1.carYear = 2022;
		h1.carCoin = 3000;
		h1.carColoer = "red";
		h1.carCC = 3000;

		h1.carinfo();

		CarBumfer hBumfer = new CarBumfer();

		hBumfer.carBumferName = "HCar Bumfer";
		hBumfer.carBumferPrice = 200;

		CarHandle hHandle = new CarHandle();
		hHandle.carHandleName = "HCar Handle";
		hHandle.carHandlePrice = 50;

		CarChain hChain = new CarChain();
		hChain.carChainName = "HCar Chain";
		hChain.carChainPrice = 100;

		
		
		
		
		
		
	}
}
