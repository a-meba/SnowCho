<%@page import="java.sql.Connection"%>
<%@page import="project.database.dbconn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 데이터베이스 연결
    dbconn db = new dbconn();
    Connection conn = db.dbstart();
    
    // 여기서 원하는 데이터베이스 작업 수행
    
    // 데이터베이스 연결 닫기
    db.dbclose(null, null, conn);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
