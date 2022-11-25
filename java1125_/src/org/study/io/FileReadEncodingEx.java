package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadEncodingEx {

	public static void main(String[] args) {
		System.out.println("encoding");
		
		FileInputStream fin=null;
		InputStreamReader inReader=null;
		String fileUrl="C:\\Users\\Administrator\\Desktop\\ioex2\\test5.txt";
		
		try {
			fin=new FileInputStream(fileUrl);
			inReader=new InputStreamReader(fin,"MS949");//문자열 인코딩
			
			int inData=0;
			while((inData=inReader.read())!=-1) {
				System.out.println((char)inData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				inReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
