package project.model.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import project.database.dbconn;

public class memberDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<memberDTO> getSelectAll(memberDTO dto) {
		ArrayList<memberDTO> list = new ArrayList<>();
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
				while(rs.next()) {
					
				}
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
		return list;
	}
	
	public memberDTO getSelectOne(memberDTO dto) {
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "select * from member where user_id = ?";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
				if(rs.next()) {
					
				}
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
		return dto;
	}
	
	public int setUpdate(memberDTO dto) {
		int result = 0;
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "update member set user_name=?, user_phone=?, user_birthdate=? where user_id = ? and user_password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUser_name());
			pstmt.setString(2, dto.getUser_phone());
			pstmt.setString(3, dto.getUser_birthdate());
			pstmt.setString(4, dto.getUser_id());
			pstmt.setString(5, dto.getUser_password());
			result = pstmt.executeUpdate();
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
		return result;
	}
	
	public int setDelete(memberDTO dto) {
		int result = 0;
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "delete from member where user_id = ? and user_password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUser_id());
			pstmt.setString(2, dto.getUser_password());
			result = pstmt.executeUpdate();
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
		return result;
	}
	
}
