<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<center>
<h1>Search By Employee Grade</h1></center><br/>
<form:form commandName="emp" action="searchgrade.htm" class="form">
  <table align="center">
  <tr>
  <td style="text-align:right">Enter Employee Grade:</td>
  <td style="text-align:left"><form:input path="egrade"value="grade"/></td>
  </tr>
  <tr>
	<td style="text-align:right"><input type="submit" value="Search"></td>
  </tr>
  </table>
  </form:form>
    <div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
<div><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/></div>
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>