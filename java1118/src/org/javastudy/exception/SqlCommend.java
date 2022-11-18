package org.javastudy.exception;

import java.io.IOException;
import java.sql.SQLException;

public interface SqlCommend {

	// 추상매서드
	void excuteQueryCommend() 
			throws IOException, SQLException, ClassNotFoundException;
}
