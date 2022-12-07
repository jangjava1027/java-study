package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.connect.DBConnect;
import org.project.dto.Member1207Dto;

public class MemberDao {

	public MemberDao() {
	}

	public int insertDo(String userId, String userPw, int age, String email) {
		System.out.println("아이디: " + userId + " 비밀번호: " + userPw + " 나이: " + age + " 이메일: " + email);
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1207(userId,userPw,age,email) values(?,?,?,?)";
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
				e.printStackTrace();
			}
		}

		return result;
	}

	public ArrayList<Member1207Dto> select() {
		ArrayList<Member1207Dto> lists = new ArrayList<Member1207Dto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new Member1207Dto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member1207 set userPw=?,age=?,email=? where userId=?";
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
				e.printStackTrace();
			}
		}

		return result;
	}

	public int delete(String userId, String userPw, int age, String email) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member1207 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

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
				e.printStackTrace();
			}
		}

		return result;
	}

	public List<Member1207Dto> searchId(String userId) {
		List<Member1207Dto> lists = new ArrayList<Member1207Dto>();
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 where userId like '%"+userId+"%'";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new Member1207Dto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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

	public List<Member1207Dto> sort(String sortmethod) {
		List<Member1207Dto> lists=new ArrayList<Member1207Dto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 order by userId "+sortmethod+"";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new Member1207Dto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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

	public List<Member1207Dto> selectAge(int startNum, int endNum) {
		
List<Member1207Dto> lists=new ArrayList<Member1207Dto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 where age>=? and age<?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1,startNum);
			pstm.setInt(2, endNum);
			
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new Member1207Dto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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

	public List<Member1207Dto> sort2(String standard, String sortmethod) {
		List<Member1207Dto> lists=new ArrayList<Member1207Dto>();
		
		Connection conn=null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1207 order by "+standard+" "+sortmethod+"";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					lists.add(new Member1207Dto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
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

}
