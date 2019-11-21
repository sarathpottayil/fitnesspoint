<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
poda pattiiiiii
<c:if test="${ not empty studentList}">
<table border="1px">
<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.name}<td>${student.pass}
</c:forEach>
</table>
</c:if>
</body>
</html>