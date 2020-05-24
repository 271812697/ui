<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<script>			
                 function cha(){
                 var s=	document.getElementById("ima");
               
                 s.src="http://localhost:8080/webtest4/demo12?time="+new Date().getTime();
                 }
		</script>
<body>
<form action="/webtest4/reg" method="post">
<table>
<tr>
<td>用户名</td>
<td>
<input type="text" name="username"/>
</td>

</tr>
<tr>
<td>密码</td>
<td>
<input type="password" name="password"/>
</td>

</tr>
<tr>
<td>验证码</td>
<td>
<input type="text" name="checkcode"/>
</td>

</tr>
<tr>
<td colspan="2">
<img id="ima" src="http://localhost:8080/webtest4/demo12" onclick="cha()">
</td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="登陆">
</td>
</tr>
</table>

</form>
<div>
<%= request.getAttribute("error") %>
</div>
</body>
</html>