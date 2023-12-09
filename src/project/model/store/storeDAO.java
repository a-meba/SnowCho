package project.model.store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project.database.dbconn;

public class storeDAO {
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
