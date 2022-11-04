package org.javastudy.arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {

		System.out.println("다차원배열");

		int[][] score = { 
				{ 100, 67, 76 }, 
				{ 88, 66, 86 }, 
				{ 80, 46, 93 }, 
				{ 70, 88, 85 }, 
				{ 100, 90, 89 }, };

		System.out.println("===중간고사 성적표===");
		System.out.println("번호\t국어 \t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		
		int kor = 0;
		int math = 0;
		int eng = 0;
								//요소의 갯수:5
		for (int i = 0; i < score.length; i++) {

			kor += score[i][0];
			math += score[i][1];
			eng += score[i][2];
			
			int sum = 0;
			double avg = 0.0;

			System.out.print(i + "\t");

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}

			avg = (double) sum / score[i].length;
			System.out.println(sum + "\t" + avg);
			System.out.println();

		}

		System.out.println("=================================================");
		System.out.println("과목별 합" + "\t"+ kor + "\t" + math + "\t" + eng);


	}
}
