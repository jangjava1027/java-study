package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fOut=new FileOutputStream("c:\\test1.txt");
			FileInputStream fin=null;
			
			for(int i=0;i<10;i++) {
				int n=i;
				fOut.write(n);;
			}
			if(fOut != null)fOut.close();
			
			fin=new FileInputStream("c:\\test1.txt");
			
			int inData=0;
			while((inData=fin.read())!=-1) {//read는 int형으로 받아야함
				System.out.print(inData+" ");//불러오는 파일이 int형이라 강제형변환 필요X
			}
			if(fin!=null)fin.close();
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
