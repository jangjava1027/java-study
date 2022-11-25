package org.study.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

		InputStreamReader reader = null;

		try {
			System.out.print("이름이 무엇입니까?");
			reader = new InputStreamReader(System.in);

			BufferedReader in = new BufferedReader(reader);
			String name = in.readLine();

			System.out.println("안녕하세요! " + name + "님 점수를입력하세요.");

			String[] subject = { "국어", "영어", "수학", "과학" };
			int[] ju = new int[4];

			double sum = 0.0;

			for (int i = 0; i < subject.length; i++) {
				System.out.print(subject[i] + ":");
				String juIn = in.readLine();
				ju[i] = Integer.parseInt(juIn);
				sum += ju[i];
			}
			System.out.println("국어: " + ju[0] + ", 영어: " + ju[1] + ", 수학: " + ju[2] + ", 과학: " + ju[3]);
			System.out.println("평균: " + sum / ju.length);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
