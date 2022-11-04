package org.javastudy.arrayEx;

public class ArrayEx4 {
	
	public static void main(String[] args) {
		
		System.out.println("배열");
		//숫자 1~10까지 배열저장하고
		//임의 인데스를 for문이용해서 100번정도 자리바꿈을 수행한후
		//배열의 첫번째인덱스 부터 5번째 인덱스까지 콘솔에출력
		
		//1.배열생성
		int[] arrInt=new int[10];
		//2. for-> 배열의 인덱스-> 1~10 
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=i+0;
			
		}
		//2.변수(빈공간)
		int temp;
//		String str=null;
//		System.out.println(str);
		
		for(int i=0;i<100;i++) {
			int idx=(int)(10*Math.random());
//			System.out.println(idx);
			
			temp=arrInt[idx];
			arrInt[idx]=arrInt[0];
			arrInt[0]=temp;
			
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.print(arrInt[i]+" ");
		}
		
		
	
		
		
		
		
		
		
		
	}
}
