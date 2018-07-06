<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
</head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<body>
<div>
<jsp:include page="header.jsp"></jsp:include>
</div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>

<c:url var="myAction" value="deleteemployee.htm" />
<form:form modelAttribute="emp" action="${myAction}" class="form">
<center>
<h1>Delete Employee</h1><br/>
<table border="2" style="text-align:center">
<tr><td style="text-align:right">Please Enter a Employee Id</td>
<td style="text-align:left"><form:input path="employeeId"value="id"/></td>
<td style="color:red"><form:errors path="employeeId"></form:errors></td>
<td style="text-align:right"><input type="submit" value="Delete"></td></tr> 
</table>
</center>
</form:form>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>