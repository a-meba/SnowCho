package project.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbconn {
	
	public static Connection dbstart() {
		
		String dburl = "jdbc:oracle:thin:@192.168.219.102:1521/xe";
		String dbdriver = "oracle.jdbc.driver.OracleDriver";
		String dbuser = "c##port_project";
		String dbpwd = "1234";
		
		Connection conn = null;
		try {
			Class.forName(dbdriver); 
			System.out.println("데이터베이스 드라이버 로딩 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 드라이버 로딩 실패");
		}
		
		try {
			conn = DriverManager.getConnection(dburl, dbuser, dbpwd); 
			System.out.println("데이터베이스 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결 실패");
		}
		return conn;
		
	}
	
	public static void dbclose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
	      try {
	            if(rs != null) {rs.close();}
	            if(pstmt != null){ pstmt.close();}
	            if(conn != null){ conn.close();}
          }catch (Exception e) {
	            e.printStackTrace();
	          }

	}
}
