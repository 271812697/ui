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
<c:forEach begin="1" end="10" var="i" step="1" >

${i}<br>

 </c:forEach>
 <hr>
 <%
 List list=new ArrayList();
 list.add("aaa");
 list.add("bbb");
 list.add("ccc");
 list.add("ddd");
 list.add("eee");
 request.setAttribute("list", list);
 %>
 <c:forEach items="${list}" var="te" varStatus="s" >
      ${te} ${s.index} <br>
 </c:forEach>

</body>
</html>