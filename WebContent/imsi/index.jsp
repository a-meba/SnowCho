<%@page import="java.sql.Connection"%>
<%@page import="project.database.dbconn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name = "form" method = "post" action = "indexProc.jsp">
	<input type = "text" name = "userid">
	<input type = "text" name = "userpwd">
	<input type = "text" name = "username">
	<button type = "submit">submit</button>
</form>
</body>
</html>
