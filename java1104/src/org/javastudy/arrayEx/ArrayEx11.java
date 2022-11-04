package org.javastudy.arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {

		System.out.println("다차원 배열 예제");

		int[][] arr1= {
				{100,66,77},
				{88,66,88},
				{80,46,97},
				{70,88,80},
				{100,90,80},};
		
		System.out.println("중간고사 성적표");
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
		System.out.println("======================================================");
		
		int kor=0;
		int math=0;
		int eng=0;
		
		for(int i=0;i<arr1.length;i++) {
			
			kor+=arr1[i][0];
			math+=arr1[i][1];
			eng+=arr1[i][2];
			
			int sum=0;
			double avg=0.0;
			
			System.out.print(i+"\t");
			
			for(int j=0;j<arr1[i].length;j++) {
				
				System.out.print(arr1[i][j]+"\t");
				sum+=arr1[i][j];						
			}
			avg=(double)sum/arr1[i].length;
			String avgStr=String.format("%.1f", avg);
			
			System.out.println(sum+"\t"+avgStr);
			
		}
		System.out.println("=====================================================");
		System.out.println("과목별"+"\t"+kor+"\t"+math+"\t"+eng);

	}
}
