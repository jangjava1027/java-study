package org.study.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		System.out.println("BufferedOutputStream");
		
//		Scanner input=new Scanner(System.in);
//		String userId=input.next();
//		System.out.println(userId);
		
		FileOutputStream fos=null;
		String fileUrl="C:\\Users\\Administrator\\Desktop\\ioex2\\123.txt";
		 try {
			fos=new FileOutputStream(fileUrl);
			//BufferedOutputStream의 버퍼크기를 5로 한다.
			BufferedOutputStream bos=new BufferedOutputStream(fos,8);
			//파일 123.txt에 1부터 9까지 출력한다.
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		 System.out.println("=============================");
		 //123.txt->콘솔에 출력
		
		 FileReader fReader=null;
		 String fileUrl2="C:\\Users\\Administrator\\Desktop\\ioex2\\123.txt";
		 try {
			 fReader=new FileReader(fileUrl2);
			 int inData=0;
			 while((inData=fReader.read())!=-1) {
				 System.out.print((char)inData+" ");
			 }
			 
		 } catch (FileNotFoundException e1) {
			 e1.printStackTrace();
		 } catch (IOException e) {
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
