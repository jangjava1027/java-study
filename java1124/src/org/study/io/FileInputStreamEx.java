package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream inFile=null;
		
		try {
			inFile=new FileInputStream("C:\\Windows\\system.ini");
			
			int inData;
				//입력된 inFile의 끝(-1)
			while((inData=inFile.read())!=-1) {//read->int형
				System.out.print((char)inData);//파일이 문자형->byte: char형으로 강제 형변환해야함.
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력예외");
			e.printStackTrace();
		}finally {
			try {
				inFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
