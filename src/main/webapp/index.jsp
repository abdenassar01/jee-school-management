<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add a student</title>
</head>
<style>
    body{
        font-family: "JetBrains Mono", monospace;
        font-size: 18px;
    }
    input{
        margin:  10px 0;
        padding: 2px 5px;
        border:  1px solid #33a8da;
        border-radius: 10px;
    }
</style>
<body>

<h1>
    Add New Student
</h1>
    <form action="${pageContext.request.contextPath}add" method="post">
        CIN: <input type="text" name="cin" ><br>
        Firstname: <input type="text" name="fn" ><br>
        Lastname: <input type="text" name="ln" ><br>
        address: <input type="text" name="adr" ><br>
        <input type="submit" value="add student">
    </form>
<br/>
</body>
</html>