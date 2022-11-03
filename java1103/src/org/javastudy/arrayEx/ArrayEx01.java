package org.javastudy.arrayEx;

public class ArrayEx01 {

	public static void main(String[] args) {
		System.out.println("배열");
		//int배열 arr1을 선언하고 초기화했다.		
		int[] arr1=new int[5];
					//int형 data5개를 저장할 수 있는 배열 생성
		
		System.out.println(arr1);
		
//		arr1[0]=10;//arr1 0번지를 10으로 초기화
//		arr1[1]=20;//arr1 2번지를 20으로 초기화
//		arr1[2]=30;//arr1 3번지를 30으로 초기화
//		arr1[3]=40;//arr1 4번지를 40으로 초기화
//		arr1[4]=50;//arr1 5번지를 50으로 초기화
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);
//		System.out.println(arr1[4]);
		
		int arr1Size=arr1.length;//배열의 길이를 나타냄.
		System.out.println(arr1Size);
		
		//for문 이용해서 배열의 길이이용
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=i*10+10;
			System.out.println(arr1[i]);
		}
		
		
		System.out.println("===========");
		
		for(int i: arr1) {
			System.out.println(i);
		}
		
	}
	
}
