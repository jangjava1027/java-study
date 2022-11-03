package org.javastudy.arrayEx;

public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("배열");
		// 로또 0번지~44번지->1~45 활용
		// 1.배열 선언
		int[] lotto = new int[45];

		System.out.println(lotto.length);
		// 2. 초기화1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.print(lotto[i] + ",");
		}
		System.out.println();
//		System.out.println(Math.random());
//		System.out.println(Math.random()*10);

		int temp;

		for (int i = 0; i < 1000; i++) {
//			System.out.println((int)(Math.random()*46));
			// random 인데스->(0~44번지)
			int idx = (int) (Math.random() * 45);

			temp = lotto[idx];// random->temp
			lotto[idx] = lotto[0];// 0번지->random
			lotto[0] = temp;
		}

		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.print(lotto[i]);
				break;
			}
			System.out.print(lotto[i] + " ");
		}

	}

}
