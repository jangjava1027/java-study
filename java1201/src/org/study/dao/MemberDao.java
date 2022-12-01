package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println();
	}

	// 회원가입 return 정수1(성공)
	public int insert(String userId, String userPw, int age) {
		System.out.print(userId + " " + userPw + " " + age);
		int result = 0;

		Connection conn = null;// DB연동
		PreparedStatement pstm = null;// SQL처리
		String query = "";

		try {
			conn = DBConnect.getConnection();// 1. DB연동
			query = "insert into member(userId,userPw,age) values(?,?,?)";// SQL문
			pstm = conn.prepareStatement(query);// 2.SQL처리
			// DB 테이블을 추가
			pstm.setString(1, userId);// setString(인덱스(1~), 값)
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			// 실행
			result = pstm.executeUpdate();// 성공이면 1 반환, 수정,탈퇴

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

	// 회원조회 return 객체(DTO), null(가져올게 없으면)
	public ArrayList<MemberDto> select() {
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// DB 데이터(결과)를 저장할 객체
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member";
			pstm = conn.prepareStatement(query);//PreparedStatement는 쿼리문을 미리 생성
			rs = pstm.executeQuery();// DB데이터를 저장
			// DB데이터가 없으면 null
			if (rs != null) {
				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					lists.add(new MemberDto(userId, userPw, age));
					
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
//	public ArrayList<MemberDto> select() {
//		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
//
//		Connection conn = null;
//		PreparedStatement pstm = null;
//		ResultSet rs = null;
//		String query2 = null;
//
//		try {
//			conn = DBConnect.getConnection();
//			query2 = "select * from member";
//
//			pstm = conn.prepareStatement(query2);
//			rs = pstm.executeQuery();
//
//			while (rs.next()) {
//				lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getInt(3)));
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		return lists;
//
//	}
	//Statement 사용
//	public ArrayList<MemberDto> select() {
//		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
//		
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		String query="";
//		
//		try {
//			conn=DBConnect.getConnection();
//			query="select * from member";
//			stmt=conn.createStatement();//Statement는 쿼리문을 미리 생성하지 않는다.
//			rs=stmt.executeQuery(query);
			//실행할때마다 쿼리문이 생성되기 때문에  반복 실행시 효율이 떨어지고 SQL Injection(삽입공격) 공격에 취약하다!!
//			
//			while(rs.next()) {
//				lists.add(new MemberDto(rs.getNString(1), rs.getNString(2), rs.getInt(3)));
//			}
//				
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs!=null)
//				rs.close();
//				if(stmt!=null)
//				stmt.close();
//				if(conn!=null)
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return lists;
//	}


	// 회원수정 return 정수1(성공)
	public int update(String userId, String userPw, int age) {
		int result = 0;
		// 회원가입과 SQL문만 다르고 나머지는 같다.
		Connection conn = null;// DB연동 객체
		PreparedStatement pstm = null;// DB연동,SQL처리
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member set userPw=?,age=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);

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

// 회원탈퇴 return 정수1(성공)
	public int delete(String userId, String userPw, int age) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member where userId=?";
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

}
