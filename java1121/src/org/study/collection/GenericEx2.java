package org.study.collection;


class Gen1 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class Gen2 {
	private String num;

	public void setNum(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}
}

//Generic type class
class Gen3<T> {
	private T num;

	public void setNum(T num) {
		this.num = num;
	}

	public T getNum() {
		return num;
	}
}

public class GenericEx2 {

	public static void main(String[] args) {

		Gen1 g1 = new Gen1();
		g1.setNum(10);
		g1.getNum();

		Gen2 g2 = new Gen2();
		g2.setNum("root");
		;
		g2.getNum();

		Gen3<Integer> g3 = new Gen3<Integer>();

		Integer i = 10;

//		g3.setNum(new Integer(10));//바로 아랫줄과 같음
		g3.setNum(i);// 박싱
		// 자동박싱
		g3.setNum(10);
		g3.getNum();

		Gen3<String> g4 = new Gen3<String>();

		g4.setNum("root");
		g4.getNum();

		// 기본타입X-> Wrapper클래스 적용(박싱,언박싱)
		GenericEx1<Float> g5 = new GenericEx1<Float>();
		GenericEx1<Long> g6 = new GenericEx1<Long>();
		GenericEx1<Byte> g7 = new GenericEx1<Byte>();
		GenericEx1<Short> g8 = new GenericEx1<Short>();
		GenericEx1<Double> g9 = new GenericEx1<Double>();
		GenericEx1<Character> g10 = new GenericEx1<Character>();
		GenericEx1<Boolean> g11 = new GenericEx1<Boolean>();

		// 타입비교
		if (g3.getNum() instanceof Integer) {
			System.out.println("Integer");
		}
		if (g4.getNum() instanceof String) {
			System.out.println("String");
		}
		// 다형성
		Object ob = new Integer(10);
		ob = new Float(10.0f);
		ob = new String("문자열");
		
		Object[] arrObj= {
						new Integer(10),
						new Integer(20),
						30,40,50//자동 박싱
						};

		Object[] arrObj2= {
						new String("문자열1"),
						new String("문자열2")
						};
		
	}
}
