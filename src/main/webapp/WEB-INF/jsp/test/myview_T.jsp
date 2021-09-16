<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= request.getAttribute("value") %> <!-- 각각 다른 방법의 Model 불러오는 방법 이 값은 MyController_T에서 model.attribute로 만들어줬음 -->
	"${value}"
	${value}
</body>
</html>