package org.study.gui;

interface In1{
	abstract void ab1();
}
public class Test1128 {

	public static void main(String[] args) {
		//다형성 이용
		//익명클래스
		In1 i0=new In1() {
			
			@Override
			public void ab1() {
				System.out.println("익명클래스 In1 오버라이딩");
			}
		};
		i0.ab1();
		
		//람다식
		In1 i1=()->{
			System.out.println("람다식으로 In1 오버라이딩");
		};
		i1.ab1();
		
		System.out.println();
		
//		System.out.println("컴파일에러")
		System.out.println("실행중(Run Time)에러");
		
		int[] iArr=new int[3];
		//예외(치명적인 에러가 아닌,,무시정도의 에러)
		try {
			//예외발생 예상코드
			iArr[4]=10;
			System.out.println("예외가 발생되지 않았다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();;
			System.out.println("배열의 인덱스 초과 예외발생");
		}
			
		
		System.out.println("프로그램종료");
	}
}
