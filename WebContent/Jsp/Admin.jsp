<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<div><br/><br/><br/><br/><br/><br/><br/><br/></div>
<center>
<h1>Employee Maintenance System</h1><br/>
<table border=1 class="table" style="text-align:center">
 <tr>
 <td>Click Here to <a href="AddEmployee.htm">Add a Employee</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="DeleteEmployee.htm">Delete a Employee</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="UpdateEmployee.htm">Modify a Employee</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="RetrieveEmployeeById.htm">Retrieve a Employee By Id</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="RetrieveEmployeeByFirstName.htm">Retrieve a Employee By First Name</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="RetrieveEmployeeByLastName.htm">Retrieve a Employee By Last Name</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="RetrieveEmployeeByDeptId.htm">Retrieve a Employee By DeptId</a></td>
 </tr>
  <tr>
 <td>Click Here to <a href="RetrieveEmployeeByGrade.htm">Retrieve a Employee By Grade</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="RetrieveEmployeeByMaritalStatus.htm">Retrieve a Employee By Marital Status</a></td>
 </tr>
 <tr>
 <td>Click Here to <a href="showAll.htm">Retrieve all Employee</a></td>
 </tr>
 </table> 
 </center>
 <div><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
 <jsp:include page="footer.jsp"></jsp:include> 
</body>
</html>