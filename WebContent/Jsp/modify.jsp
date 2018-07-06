<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<jsp:include page="header.jsp"></jsp:include>
</div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>

<c:url var="myAction" value="modifyemployee.htm" />
<form:form commandName="emp" action="${myAction}">
<center>
<h1>Update Employee</h1><br/>
<table border="2">
<tr><td>Please Enter a Employee Id</td>
<td><form:input path="employeeId"/></td>
<td><input type="submit" value="Modify"></td></tr>
</table>
</center>
</form:form>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>