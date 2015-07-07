<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>num</td>
		<td>name</td>
		<td>title</td>
		<td>date</td>
		<td>hit</td>
	</tr>
	
	<c:forEach items="${list}" var="dto">
	
	<tr>
		<td>${dto.bId}</td>
		<td>${dto.Name}</td>
		<td>
			<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
			<a href="content_view?bId=${dto.bId}">${dto.bTitle}</a>
		</td>
		<td>${dto.bDate}</td>
		<td>${dto.bHit}</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5"> <a href="write_view">글작성</a></td>
	</tr>
</table>


</body>
</html>