package project.model.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project.database.dbconn;

public class orderDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void SelectAll() {
		try {
			conn = dbconn.dbstart();
			//---------------------------------
			
			//---------------------------------
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbconn.dbclose(rs, pstmt, conn);
		}
	}
}
