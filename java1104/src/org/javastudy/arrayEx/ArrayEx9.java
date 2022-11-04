package org.javastudy.arrayEx;

public class ArrayEx9 {

	public static void main(String[] args) {

		System.out.println("다차원배열");
		
		//5행5열 다차원 배열 int[][] arrInt2생성
		//정수10부터10씩 더해서 250개 초기화 시키고
		//콘솔에 출력
		
		int[][] arrInt2=new int[5][5];
		
		int num=0;
		
		for(int i=0;i<arrInt2.length;i++) {
			for(int j=0;j<arrInt2[i].length;j++) {
				
				arrInt2[i][j]=num*10+10;
				
				System.out.print(arrInt2[i][j]+" ");
				num++;
			}
			System.out.println();
		}
		

	}
}
