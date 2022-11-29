package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlEx1 {

	public static void main(String[] args) {

		try {
			URL aurl = new URL("http://192.168.23.211:8092/springMVC1206/joinOK");

			URLConnection uc = aurl.openConnection();
			uc.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());

			out.write("userId=m111&userPw=1111&userName=m1");
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
				in.close();
			}
//		} catch (MalformedURLException e) {//IOException을  상속받아서 따로 예외처리 하지않아도 실행됨.
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중에 오류가 발생했습니다.");
		}

	}
}
