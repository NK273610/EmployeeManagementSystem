<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
</head>
<body>
<div>
<jsp:include page="header.jsp"></jsp:include>
</div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<table border="1" class="table" style="text-align:center">
		<tr>
			<td>Employee ID</td>
			<td>Employee First Name</td>
			<td>Employee Last Name</td>
			<td>Employee DOB</td>
			<td>Employee DOJ</td>
			<td>Employee DeptId</td>
			<td>Employee DeptName</td>
			<td>Employee GradeCode</td>
			<td>Employee Designation</td>
			<td>Employee Basic</td>
			<td>Employee Gender</td>
			<td>Employee MaritalStatus</td>
			<td>Employee HomeAddress</td>
			<td>Employee Contact</td>
			<td>Grade Description</td>
			<td>Grade MinSal</td>
			<td>Grade MaxSal</td>
		
		</tr>

		<c:forEach var="obj" items="${emp}">
			<tr>
				<td>${obj.employeeId}</td>
				<td>${obj.firstname}</td>
				<td>${obj.lastname}</td>
				<td>${obj.dob}</td>
				<td>${obj.doj}</td>
				<td>${obj.empdepid}</td>
				<td>${obj.deptname}</td>
				<td>${obj.egrade}</td>
				<td>${obj.designation}</td>
				<td>${obj.empbasic}</td>
				<td>${obj.gender}</td>
				<td>${obj.maritalStatus}</td>
				<td>${obj.homeaddress}</td>
				<td>${obj.contact}</td>
				<td>${obj.description}</td>
				<td>${obj.minSal}</td>
				<td>${obj.maxSal}</td>
			</tr>
		</c:forEach>

	</table>
	<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>