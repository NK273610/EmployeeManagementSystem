<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
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
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>

<form:form commandName="emp" action="searchdeptid.htm" class="form">
<center>
<h1>Search By Department Id</h1><br/>
  <table align="center" class="table" style="text-align:center">
  <tr>
  <td style="text-align:right">Enter Employee ID:</td>
  <td style="text-align:left"><form:input path="empdepid"value="depid"/></td>
  </tr>
  <tr>
		
		<td style="text-align:right"><input type="submit" value="Search"></td>
		
		</tr>
  </table>
  </center>
  </form:form>
  <div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>