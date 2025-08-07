<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	h2>Enter Student Details</h2>
    <form action="checkResult.jsp" method="post">
        <p>Student Name: <input type="text" name="studentName" required /></p>
        <p>Marks: <input type="number" name="marks" required /></p>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>