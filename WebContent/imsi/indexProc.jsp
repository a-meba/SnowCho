<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String userid = request.getParameter("userid");
	String userpwd = request.getParameter("userpwd");
	String username = request.getParameter("username");
	
	String dbPwd = "1234";
	String dbUsr = "c##port_project";
	String dbDrv = "jdbc:oracle:thin:@192.168.219.102:1521/xe";
	String dbUrl = "oracle.jdbc.driver.OracleDriver";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; //select 문장에서 사용 
	int result = 0;

	// DB 접속
	try {
		Class.forName(dbUrl); 
		conn = DriverManager.getConnection(dbDrv, dbUsr, dbPwd); 
		//------------------------------------------------------------------------------------------------------------------
		String sql = "";
		sql += "insert into member values(?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid);
		pstmt.setString(2, userpwd);
		pstmt.setString(3, username);
		result = pstmt.executeUpdate();
		//--------------------------------------------------------------------------------------------------------------------
		System.out.println("DB접속 성공");
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("DB접속 실패");
	} finally {
		if(rs != null){
			rs.close(); 
		}
		if(pstmt != null){
			pstmt.close(); 
		}
		if(conn != null){
			conn.close(); 
		}
	}
	
	if(result > 0) {
		out.print("<script> alert('수정성공'); location.href='index.jsp'; </script>");
	}else {
		out.print("<script> alert('수정실패'); location.href='update.jsp?id=" + userid + "'</script>");
	}
	
%>
