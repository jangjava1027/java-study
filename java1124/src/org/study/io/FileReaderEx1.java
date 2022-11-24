package org.study.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		
		System.out.println("FileReader");
		
		String fileName="E:\\ioex\\test2.txt";
		File file1=new File(fileName);//file객체 생성후 연결
		
		FileReader fReader=null;
		
		try {
			fReader=new FileReader(file1);
			int inData=0;
			while((inData=fReader.read())!=-1) {
				System.out.print((char)inData);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일X");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOX");
			e.printStackTrace();
		}finally {
			try {
				fReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
