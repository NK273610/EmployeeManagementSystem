<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<jsp:include page="header.jsp"></jsp:include>
<!--header-->
<div class="header">
		<div class="container">
			 <div class="banner-info">
				 <h2>Manage Your Employees with Ease!!</h2>
				 <p>EmpSys is an interface where you can register with us and we help you to manage your employees
					at your comfort with many functionalities.We provide an easy GUI to maintain your employees 
					from anywhere across the globe.</p>
			 </div>
			 <div class="clearfix"></div>
		</div>
</div>


<!--Service-->
<div id="service" class="service">
	 <div class="container">
	
		 <h3 style="text-align:left">Login</h3>	
		 <div class="service-grids">
		 <div class="icon-grids">
			 <div class="col-md-6 futr-grid futr1"></div>
			 <div class="touch-top">
			 <div class="col-md-8 touch-left">
	
					<form:form modelAttribute="user" action="check.htm">
					<table class="table" style="text-align:center">
					<tr><td><form:input path="userid" placeholder="User ID"/><form:errors path="userid" /></td></tr>
					<tr><td><form:input path="username" placeholder="User Name"/><form:errors path="username" /></td></tr>
					<tr><td><form:input path="password" placeholder="Password"/><form:errors path="password" /></td></tr>
					<tr><td><form:radiobutton path="usertype" value="admin" label="Admin" /><form:errors path="usertype"/>
					<form:radiobutton path="usertype" value="employee" label="Employee"/><form:errors path="usertype"/></td></tr>
					<tr><td><input type="submit" value="LOGIN"></td></tr>
					</table>
					</form:form>
			 </div>
			 </div>
				<div class="clearfix"></div>
		  </div>
		 </div>  
		 </div>
	 </div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>	
