package org.study.dao_;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect_.DBConnect_;
import org.study.dto_.MemberDto_;

public class MemberDao_ {

	public MemberDao_() {
	}

	public int insert(String userId, String userPw, int age, String email) {
		System.out.println("아이디: " + userId + " 비밀번호: " + userPw + " 나이: " + age + " 이메일: " + email);
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect_.getConnection();
			query = "insert into member2(userId,userPw,age,email) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	public ArrayList<MemberDto_> select() {
		ArrayList<MemberDto_> lists = new ArrayList<MemberDto_>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect_.getConnection();
			query = "select * from member2";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					String userId=rs.getString(1);
					String userPw=rs.getString(2);
					int age=rs.getInt(3);
					String email=rs.getString(4);
					lists.add(new MemberDto_(userId, userPw, age, email));
							
//					lists.add(new MemberDto_(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return lists;
	}

	public int update(String userId, String userPw, int age, String email) {
		System.out.println("아이디: " + userId + " 비밀번호: " + userPw + " 나이: " + age + " 이메일: " + email);
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect_.getConnection();
			query = "update member2 set userPw=?,age=?,email=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userId);

			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	public int delete(String userId, String userPw, int age, String email) {
		System.out.println("아이디: " + userId + " 비밀번호: " + userPw + " 나이: " + age + " 이메일: " + email);
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect_.getConnection();
			query = "delete from member2 where userId=? and userPw=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);

			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

}
