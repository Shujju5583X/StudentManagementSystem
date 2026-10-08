<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Login</title>
</head>
<body>
<%
String SName = (String)request.getAttribute("SName");
String SPassword = (String)request.getAttribute("SPassword");
%>
<%= SName %>
<%= SPassword %>
</body>
</html>