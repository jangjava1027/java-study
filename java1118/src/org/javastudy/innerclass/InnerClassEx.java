package org.javastudy.innerclass;

//외부클래스
public class InnerClassEx {
	// 내부클래스
	// 인스턴스 클래스
	class InstanceClass2 {// 기본default 생략되어있음
		int num1;

		void m1() {
			System.out.println("InstanceClass2");
		}
	}

	// static클래스
	static class StaticClass2 {
		static void method1() {
			System.out.println("StaticClass2,static매서드");
		}
	}

	void localMethod() {
		// 지역클래스
		class LocalClass2 {
			int num2;

			void m2() {
				System.out.println("LocalCalss2");
			}
		}
		LocalClass2 loc2 = new LocalClass2();
		loc2.m2();
	}

}
