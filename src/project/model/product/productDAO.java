package project.model.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import project.database.dbconn;

public class productDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ArrayList<productDTO> getSelectAll() {
		ArrayList<productDTO> list = new ArrayList<>();
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "select * from product";
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
	
	public productDTO getSelectOne(productDTO dto) {
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "select * from product where product_id = ?";
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
	
	public int setUpdate(productDTO dto) {
		int result = 0;
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "update product set product_name=?, product_price=? where product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct_name());
			pstmt.setInt(2, dto.getProduct_price());
			pstmt.setString(3, dto.getProduct_id());
			result = pstmt.executeUpdate();
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
		return result;
	}
	
	public int setDelete(productDTO dto) {
		int result = 0;
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			String sql = "delete from product where user_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct_id());
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
