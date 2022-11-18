package org.javastudy.innerclass;

public class SingletonEx {

	public static void main(String[] args) {
		
//		new Dao();
//		new Dao();
//		new Dao();
		//싱글톤->객체를 한번만 생성
		Dao dao=Dao.getInstance();
		dao.insert();
		dao.delete();
		dao.update();
		dao.select();
		
		
		
	}
}
