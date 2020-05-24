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
<%-- 
c:if标签
   test必须属性，接受表达式
   如果为true,则显示if标签体内容
 --%>
 <c:if test="false">
 我是真........
 </c:if>
 <%
    List a=new ArrayList();
    
 request.setAttribute("list", a);
 request.setAttribute("number", 4);
 %>
 <c:if test="${not empty requestScope.list }">
 
   集合不为空
 
 </c:if>
 <c:if test="${number % 2!=0}">
 
    ${number}为奇数
 
 </c:if>

</body>
</html>