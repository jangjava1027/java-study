package org.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		
		Connection conn=null; //DB연동 객체
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";//오라클 기본 DB URL
		String user="system";//user Id
		String password="1234";//user Password
		
		//1.drive 찾기
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
			//2.DB연결 -> xe
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("DB연동 Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver fail");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연동 fail");
			e.printStackTrace();
		}
		System.out.println(conn);
		
		if(conn!=null) {
			System.out.println("orcle 연동 성공");
		}else {
			System.out.println("orcle 연동 성공");
		}
		
		
	}
}
