package org.study.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		System.out.println("FileWriter");

		// 콘솔에 입력
		InputStreamReader inReader = new InputStreamReader(System.in);
		// 2.file생성->텍스트
		FileWriter fWriter = null;
		// 3.생성될 파일 URL
		String fileUrl = "C:\\Users\\Administrator\\Desktop\\ioex2//test5.txt";

		try {
			// 4.file test4.txt생성
			fWriter = new FileWriter(fileUrl);

			int inData = 0;
			// 5.콘솔입력 데이터를 저장->ctr+z가 입력될때까지
			while ((inData = inReader.read()) != -1) {
				// 6.fwriter저장(한글자씩)
				fWriter.write(inData);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
