package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoEx1 {

	public static void main(String[] args) {
		
		String fileUrl="C:\\Users\\Administrator\\Desktop\\ioex//test3.txt";
		//1.file객체생성->2.파일 경로 추가
		File file=new File(fileUrl);
		
		//3.file 가져오기(Reader->텍스트)
		FileReader fReader=null;
		try {
			fReader=new FileReader(file);
			//4.가져온 파일을 읽는다.
			int inData=0;
			while((inData=fReader.read())!=-1) {
				//5.콘솔에 출력
				System.out.print((char)inData);
			}
		} catch (FileNotFoundException e) {
			//파일유무
			e.printStackTrace();
		} catch (IOException e) {
			//입출력
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
