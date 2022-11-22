package org.study.collection;

class A{
	int n;
	String s1;
	int m1() {
		return 0;
	}
}

class G1<T>{
	T t1;
	T m1(T t2) {		
		return t2;
	}
}
public class Test1122 {

	public static void main(String[] args) {
		
		G1<String> g1=new G1<String>();
		g1.t1="String";
		String m1=g1.m1("문자열");
		
		G1<Integer> g2=new G1<Integer>();
		g2.t1=new Integer(10);//박싱
		g2.t1=10;//자동박싱
		Integer i1=g2.m1(new Integer(10));
		int i2=g2.m1(new Integer(10)).intValue();//언박싱
		g2.m1(10);//자동언박싱
		
		
		//기본형
		int i=10;
		
		//객체형=new
		String str=new String("문자열");
//		String str2="문자열";
		Integer i4=new Integer(10);
//		Integer i5=10;
		
		MemberDTO user1=new MemberDTO("m1", "1111", "s111", 11);
		MemberDTO user2=new MemberDTO("m2", "2222", "s211", 21);
		MemberDTO user3=new MemberDTO("m3", "3333", "s311", 31);
		MemberDTO user4=new MemberDTO("m4", "4444", "s411", 41);
		MemberDTO user5=new MemberDTO("m5", "5555", "s511", 51);
		//객체 user1
		System.out.println("user1");
		System.out.print("아이디: "+user1.getUserId()+" ");
		System.out.print("비밀번호: "+user1.getUserPw()+" ");
		System.out.print("이름: "+user1.getUserName()+" ");
		System.out.println("나이: "+user1.getAge());
		
		System.out.println();
		
		System.out.println("user2");
		System.out.print("아이디: "+user2.getUserId()+" ");
		System.out.print("비밀번호: "+user2.getUserPw()+" ");
		System.out.print("이름: "+user2.getUserName()+" ");
		System.out.println("나이: "+user2.getAge());
		
		System.out.println();
		
		System.out.println("user3");
		System.out.print("아이디: "+user3.getUserId()+" ");
		System.out.print("비밀번호: "+user3.getUserPw()+" ");
		System.out.print("이름: "+user3.getUserName()+" ");
		System.out.println("나이: "+user3.getAge());
		
		System.out.println();
		
		System.out.println("user4");
		System.out.print("아이디: "+user4.getUserId()+" ");
		System.out.print("비밀번호: "+user4.getUserPw()+" ");
		System.out.print("이름: "+user4.getUserName()+" ");
		System.out.println("나이: "+user4.getAge());
		
		System.out.println();
		
		System.out.println("user5");
		System.out.print("아이디: "+user5.getUserId()+" ");
		System.out.print("비밀번호: "+user5.getUserPw()+" ");
		System.out.print("이름: "+user5.getUserName()+" ");
		System.out.println("나이: "+user5.getAge());
		
		
	}
	
}
