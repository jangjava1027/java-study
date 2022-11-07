package org.javastudy.oop;

public class Car {

	// 필드
	public String carName;
	public int carYear;
	public int carCoin;
	public String carColoer;
	public int carCC;

	// 기본생성자->생략하면 자동으로 생성(다른 생성자가 없을시)

	// 인스턴스 매서드 new
	public void carinfo() {
		System.out.println("이름: " + carName);
		System.out.println("연식: " + carYear);
		System.out.println("가격: " + carCoin);
		System.out.println("색상: " + carColoer);
		System.out.println("배기량: " + carCC);

	}

}
