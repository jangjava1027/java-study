package org.javastudy.innerclass;

public class Dao {
	//싱글톤 패턴
	//생성자 private
	private Dao() {
		System.out.println("Dao");				
	}//내부 클래스
	private static class InnerClass{
		//인스턴스 한번만 생성
		private static final Dao INSTANCE=new Dao();
	}
	public static Dao getInstance() {
		return InnerClass.INSTANCE;
	}
	public void insert() {}
	public void delete() {}
	public void update() {}
	public void select() {}
	
}
