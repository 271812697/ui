<%@ page import="java.io.IOException" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>


<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<script>
<%
System.out.println("66666");
%>

</script>
<body>
<h1><font color=red>你好</font></h1>	
<%

response.setContentType("text/html;charset=utf-8");
Cookie[] cook=request.getCookies();
boolean flag=true;
if(cook!=null&&cook.length!=0) {
	for(Cookie temp:cook) {
		if(temp.getName().equals("lasttime")) {
			String value=temp.getValue();
			value=URLDecoder.decode(value, "utf-8");
			response.getWriter().write("<h1>欢迎回来，您上次访问的时间是"+value+"</h1>");
			SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			String s=format.format(new Date());
			s=URLEncoder.encode(s, "utf-8");
			temp.setValue(s);
			temp.setMaxAge(60*60*24*30);
			response.addCookie(temp);
			
			flag=false;
			break;
		}
		
	}
	
}
if(flag) {
	
	response.getWriter().write("<h1>欢迎访问,这是你第一次访问</h1>");
	SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
	String s=format.format(new Date());
	s=URLEncoder.encode(s, "utf-8");
	Cookie temp=new Cookie("lasttime",s);
	temp.setMaxAge(60*60*24*30);
	response.addCookie(temp);
	
}
%>
<h1><font color=red>你好</font></h1>
</body>
</html>