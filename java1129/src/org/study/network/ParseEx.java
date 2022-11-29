package org.study.network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseEx {

	public static void main(String[] args) {
		
		URL opinion=null;//자원의 경로
		URL join=null;
		
		
		
		
		try {
//			join=new URL("http://192.168.23.211:8092/springMVC1206/join");//절대경로로 URL 객체생성
			// 기본 서버의 패스 경로
			join=new URL("http://192.168.23.211:8092/springMVC1206/");
			opinion =new URL(join,"join");//상대 경로로 URL 객체생성
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL입니다.");
		}
		
		System.out.println("protocol= "+opinion.getProtocol());//프로토콜 출력
		System.out.println("host= "+opinion.getHost());//호스트이름 출력
		System.out.println("port= "+opinion.getPort());//포트번호 출력
		System.out.println("basicPath: "+join);
		System.out.println("path= "+join.getPath());//경로부분 출력
		System.out.println("filename= "+join.getFile());//파일이름 출력
		
//		System.out.println("protocol= "+join.getProtocol());//프로토콜 출력
//		System.out.println("host= "+join.getHost());//호스트이름 출력
//		System.out.println("port= "+join.getPort());//포트번호 출력
//		System.out.println("path= "+join.getPath());//경로부분 출력
//		System.out.println("filename= "+join.getFile());//파일이름 출력
		
		
		
		
	}
}
