<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1>
    <% 
    
        
    %>
</h1>
<form action="${pageContext.request.contextPath}hey">
    <input type="submit" value="Say Hello">
</form>
<br/>
<a href="${pageContext.request.contextPath}hey">Hello Servlet</a>
</body>
</html>