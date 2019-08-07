<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
ArrayList ls = new ArrayList();
ls = (ArrayList) session.getAttribute("ls");
%>

</head>
<body>
<%=ls.get(1) %>
</body>
</html>