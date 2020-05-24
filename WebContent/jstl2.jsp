<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setAttribute("number", 1);
%>
<c:choose>
<c:when test="${number==1 }">星期一</c:when>
<c:when test="${number==2 }">星期二</c:when>
<c:when test="${number==3 }">星期三</c:when>
<c:when test="${number==4 }">星期四</c:when>
<c:when test="${number==5 }">星期五</c:when>
<c:when test="${number==6 }">星期六</c:when>
<c:when test="${number==7 }">星期七</c:when>

<c:otherwise> 数字不合法</c:otherwise>






</c:choose>

</body>
</html>