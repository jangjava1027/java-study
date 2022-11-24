package org.study.study;

class 빵클래스{
	//클래스의 멤버-> 필드,생성자,매서드
	
	//필드
	public int 가격;
	public int 시간;
	//static멤버(클래스멤버)->공유
	public static int MAXNUM=100;
	
	//생성자
	public 빵클래스() {
		//생성자 매서드(매서드는 매서드인데 반환타입없는 매서드)->객체의 종유를 설정할수있다.
	}
	public 빵클래스(int 가격) {
		this.가격=가격;
	}
	//매서드
	public String 빵종류(String 종류) {
		
		return 종류;
	}

}

public class ClassBasic {

	public static void main(String[] args) {
		
		System.out.println("클래스기본개념");
		
		//static 멤버는 클래스명. 변수명
		System.out.println(빵클래스.MAXNUM);
		
		//사용자정의타입
		  //빵1:객체참조변수 //new 객체의 주소 생성
		빵클래스 빵1=new 빵클래스();
		빵1.가격=1000;
		빵1.시간=1;
		System.out.println(빵1.가격);
		System.out.println(빵1.시간);
		
		String 빵종류=빵1.빵종류("팥빵");
		System.out.println(빵종류);
		//객체화(인스턴스화)
		빵클래스 빵2=new 빵클래스(2000);
		빵2.시간=2;
		System.out.println(빵2.가격);
		System.out.println(빵2.시간);
		
		String 빵종류2=빵2.빵종류("밤빵");
		System.out.println(빵종류2);
		
		
		
		
		
	}
}
