package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx {

	public static void main(String[] args) {
		
		URL url=null;
		BufferedReader in=null;
		
		try {
//			url = new URL("http://192.168.23.211:8092/springMVC1206/join");
			url = new URL("https://www.starbucks.co.kr/index.do");
			
			in= new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine;
			
			while((inputLine=in.readLine())!=null) {
				System.out.println(inputLine);
			}
//		} catch (MalformedURLException e) {//IOException을  상속받아서 따로 예외처리 하지않아도 실행됨.
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중에 오류가 발생했습니다.");
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}
