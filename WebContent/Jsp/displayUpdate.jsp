<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
</div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<form:form action="update.htm" commandName="emp">
<%-- <form:hidden path="empId"/> --%>

<table border="1" align="center" class="table" style="text-align:center">
<tr>
<td>Employee Id: </td><td><form:input path="employeeId" readonly="true"/></td></tr>
<tr><td>Employee FirstName: </td><td><form:input path="firstname"/></td></tr>
<tr><td>Employee LastName: </td><td><form:input path="lastname"/></td></tr>
<tr><td>Employee DOB: </td><td><form:input path="dob"/></td></tr>
<tr><td>Employee DOJ: </td><td><form:input path="doj"/></td></tr>
<tr><td>Employee DeptId: </td><td><form:input path="empdepid"/></td></tr>
<tr><td>Employee Grade: </td><td><form:input path="egrade"/></td></tr>
<tr><td>Employee Designation: </td><td><form:input path="designation"/></td></tr>
<tr><td>Employee Basic: </td><td><form:input path="empbasic"/></td></tr>
<tr><td>Employee Gender: </td><td><form:input path="gender"/></td></tr>
<tr><td>Employee MaritalStatus: </td><td><form:input path="maritalStatus"/></td></tr>
<tr><td>Employee HomeAddress: </td><td><form:input path="homeaddress"/></td></tr>
<tr><td>Employee Contact: </td><td><form:input path="contact"/></td></tr>
<tr><td><input type="submit" value="Update"/></td></tr>
</table>

</form:form>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>