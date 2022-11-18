package org.javastudy.connect;

import java.sql.SQLException;

import org.javastudy.exception.Exception9;

public class Select implements Exception9 {

	@Override
	public void excute() throws ClassNotFoundException, SQLException {
		System.out.println("회원조회");
	}

}
