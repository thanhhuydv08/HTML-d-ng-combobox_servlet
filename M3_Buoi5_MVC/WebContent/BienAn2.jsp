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
ls.add(0,1);
ls.add(1,2);
ls.add(2,3);
int a=10;
session.setAttribute("ls", ls);
%>

</head>
<body>

</body>
</html>