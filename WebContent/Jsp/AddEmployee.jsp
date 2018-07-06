<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<script>
var x,y,z,p,q,r,a,b,c,d,e,f;
function validate1()
{
	
	 var first_name = document.frm.firstname.value;
	 var ck_name=/^[A-Z][a-z]{3,25}$/;
	var firstName = first_name.match(ck_name);
	if(firstName==null)
	{	
			document.getElementById("s1").innerHTML="Please enter valid first name!";
			
	}
else
{
document.getElementById("s1").innerHTML="<span style='color:green;'>Done</span>";
			x=1;

}
	
}


function validate2()
{
	
	
	var last_name=document.frm.lastname.value;
	var lastname=/^[A-Z][a-z]{3,25}$/;
	var lastName = last_name.match(lastname);
	
	if(lastName==null)
	{	
			document.getElementById("s2").innerHTML="Please enter valid last name!";
			
	}
else
{
document.getElementById("s2").innerHTML="<span style='color:green;'>Done</span>";
			 y=1;

}	
}

var dob;

	var doj;
	function validate3()

	{

		dob = document.frm.dob.value;
		var today=new Date();
		var mon=today.getMonth()+1;
		var year=today.getYear()+1900;
		var date=today.getDate();
		var dateJ=dob.split("-");
		var diff=(year-dateJ[0]);
		
		if (diff<18 || diff>58) {
			document.getElementById("s11").innerHTML = "Date of Birth should be less than today's date";	
		}

		if (dob == "") {
			document.getElementById("s11").innerHTML = "Please enter valid Date of Birth!";

		} else {
			document.getElementById("s11").innerHTML = "<span style='color:green;'>Done</span>";
			z = 1;

		}
	}
	function validate4() {
		doj = frm.doj.value;
		dob = document.frm.dob.value;
		var dateJ = doj.split("-");
		var dateB = dob.split("-");

		var oneYear = 24 * 60 * 60 * 1000 * 365;
		var firstDate = new Date(dateB[0], dateB[1], dateB[2]);
		var secondDate = new Date(dateJ[0], dateJ[1], dateJ[2]);
		var diffDays = Math.round(Math.abs(firstDate.getTime()
				- secondDate.getTime())
				/ oneYear);

		if (doj == "") {
			document.getElementById("s12").innerHTML = "Please enter valid Date of Joining!";

		}
		if (diffDays<18 || diffDays>58) {
			document.getElementById("s12").innerHTML = "Age Limit should be in between 18 and 58";
		} else {
			document.getElementById("s12").innerHTML = "<span style='color:green;'>Done</span>";
			p = 1;

		}
	}


function validate5()
{


	
	
	var depid=frm.empdepid.value;
	var dep_id = /^[0-9]{2}$/;
 	var deptid = depid.match(dep_id);

	 if(depid=="")
	 {
	 document.getElementById("s3").innerHTML="Please enter valid Department Id!";
		
	 }
	 else
{
document.getElementById("s3").innerHTML="<span style='color:green;'>Done</span>";
			 q=1;

}
}

function validate6()
{
	
	
	var grade=frm.egrade.value;
	var empgrade = /^[M]{1}[1-7]{1}$/
	var emp_grade = grade.match(empgrade);
	if(emp_grade==null)
	 {
	 document.getElementById("s4").innerHTML="Please enter Grade value from M1 to M7!";
		
	 }
	 else
{
document.getElementById("s4").innerHTML="<span style='color:green;'>Done</span>";
			 r=1;

}
}

function validate7()
{
	
	
	var desi=frm.designation.value;
	var design=/^[A-z]{1}[a-z]{2,20}$/;
	var designation = desi.match(design);
	if(designation==null)
	 {
	 document.getElementById("s5").innerHTML="Please enter valid Designation";
		
	 }
	 else
{
document.getElementById("s5").innerHTML="<span style='color:green;'>Done</span>";
			 a=1;

}
}

function validate8()

{

	
	
	var basic=frm.empbasic.value;
	var empBasic = /^[1-9]{1}[0-9]{2,6}$/;
	var emp_basic = basic.match(empBasic);
	if(emp_basic==null)
	 {
	 document.getElementById("s6").innerHTML="Please enter valid Basic!";
		
	 }
	 else
{
document.getElementById("s6").innerHTML="<span style='color:green;'>Done</span>";
			b=1;

}
}
function validate9()
{
	
	
	var gen=frm.gender.value;
	var gender = /^[A-Z]{1}$/;
	var emp_gender = gen.match(gender);
	
	 if(emp_gender==null)
	 {
	 document.getElementById("s7").innerHTML="Please enter valid Gender!";
		
	 }
	 else
{
document.getElementById("s7").innerHTML="<span style='color:green;'>Done</span>";
			 c=1;

}
}
function validate10(){

	
	
	var status=frm.maritalStatus.value;
	var mstatus = /^[A-Z]{1}$/;
	var marital_status = status.match(mstatus);
	if(marital_status==null)
	 {
	 document.getElementById("s8").innerHTML="Please enter valid Status!";
		
	 }
	 else
{
document.getElementById("s8").innerHTML="<span style='color:green;'>Done</span>";
			 d=1;

}
}
function validate11()
{

	
	var add=frm.homeaddress.value;
	var address = /^[A-za-z0-9-/,.]{1,100}$/;
	var emp_address = add.match(address);
	if(emp_address==null)
	 {
	 document.getElementById("s9").innerHTML="Please enter valid Address!";
		
	 }
	 else
{
document.getElementById("s9").innerHTML="<span style='color:green;'>Done</span>";
			 e=1;

}
}
function validate12()
{


	
	var con=frm.contact.value;
	var empContact = /^[0-9]{10}$/;
	var employee_contact = con.match(empContact);
	if(employee_contact==null)
	 {
	 document.getElementById("s10").innerHTML="Please enter valid Contact!";
	
	 }
	 else
{
document.getElementById("s10").innerHTML="<span style='color:green;'>Done</span>";
			 f=1;

}
}
function validate()
{
if(a==1 && b==1 && c==1 && d==1 && e==1 && f==1 && p==1 && q==1 && r==1 && x==1 && y==1 && z==1)
	{
	return true;
	}
	else 
	{
	return false;
	}
	}
</script>

</head>
<body>
<div>
<jsp:include page="header.jsp"></jsp:include>
</div>
<div><br/><br/><br/><br/><br/><br/><br/><br/></div>
<center>
<h1>Add Employee Details</h1><br/>
	<form:form action="adddet.htm" commandName="emp" class="form" name="frm" onsubmit="return validate()">
	<table bgcolor="#DCDCDC" class="table" style="text-align:center">
		<tr>
			<td style="text-align:right">Employee First Name:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="firstname" onblur="validate1()"/></td>
			<td><span style="color:red" id="s1"></span></td>
			<td style="color: red;"><form:errors path="firstname"/></td>

		</tr>

		<tr>
			<td style="text-align:right">Employee Last Name:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="lastname"  onblur="validate2()" /></td>
			<td><span style="color:red" id="s2"></span></td>
			<td style="color: red;"><form:errors path="lastname"></form:errors></td>

		</tr>

		<tr>
			<td style="text-align:right">Employee DOB:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="dob" placeholder="yyyy-mm-dd" onblur="validate3()"/></td>
			<td><span style="color:red" id="s11"></span>
			<td style="color: red;"><form:errors path="dob"></form:errors></td>

		</tr>
		
		<tr>
			<td style="text-align:right">Employee DOJ:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="doj" placeholder="yyyy-mm-dd" onblur="validate4()" /></td>
			<td><span style="color:red" id="s12"></span></td>
			<td style="color: red;"><form:errors path="doj"></form:errors></td>

		</tr>
		<tr>
			<td style="text-align:right">Employee DeptId:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:select path="empdepid" items="${myDep}" onblur="validate5()"/></td>
			<td><span style="color:red" id="s3"></span></td>
			<td style="color: red;"><form:errors path="empdepid"></form:errors></td>

		</tr>
		<tr>
			<td style="text-align:right">Employee Grade:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:select path="egrade" items="${grade}" onblur="validate6()"/></td>
			<td><span style="color:red" id="s4"></span></td>
			<td style="color: red;"><form:errors path="egrade"></form:errors></td>

		</tr>
		
		<tr>
			<td style="text-align:right">Employee Designation:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="designation" onblur="validate7()"/></td>
			<td><span style="color:red" id="s5"></span></td>
			<td style="color: red;"><form:errors path="designation"></form:errors></td>

		</tr>
		<tr>
			<td style="text-align:right">Employee Basic:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="empbasic" onblur="validate8()" /></td>
			<td><span style="color:red" id="s6"></span></td>
			<td style="color: red;"><form:errors path="empbasic"></form:errors></td>

		</tr>
		<tr>
			<td style="text-align:right">Employee Gender:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:select path="gender" items="${gender}" onblur="validate9()"/></td>
			<td><span style="color:red" id="s7"></span></td>
			<td style="color: red;"><form:errors path="gender"></form:errors></td>

		</tr>
		
		<tr>
			<td style="text-align:right">Employee MaritalStatus:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:select path="maritalStatus" items="${mstatus}" onblur="validate10()"/></td>
			<td><span style="color:red" id="s8"></span></td>
			<td style="color: red;"><form:errors path="maritalStatus"></form:errors></td>

		</tr>
		
		<tr>
			<td style="text-align:right">Employee HomeAddress:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="homeaddress" onblur="validate11()" /></td>
			<td><span style="color:red" id="s9"></span></td>
			<td style="color: red;"><form:errors path="homeaddress"></form:errors></td>

		</tr>
		<tr>
			<td style="text-align:right">Employee Contact:<span style="color:red;">*</span></td>
			<td style="text-align:left"><form:input path="contact" onblur="validate12()"/></td>
			<td><span style="color:red" id="s10"></span></td>
			<td style="color: red;"><form:errors path="contact"></form:errors></td>

		</tr>
	
		<tr>
			<td colspan="2"><input type="submit" name="addEmployee"
				value="Add Employee"></input></td>
		</tr>
	</table>
</form:form>	
</center>
<div><br/><br/></div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>