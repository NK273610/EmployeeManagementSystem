package com.igate.employee.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.igate.employee.dto.Employee;
import com.igate.employee.dto.UserMaster;
import com.igate.employee.exception.EmployeeException;
import com.igate.employee.service.IEmployeeService;
@Controller
public class EmployeeController 
{
	@Autowired
	IEmployeeService eservice;	
	
	@RequestMapping(value="login")
	public String function1(Model model)
	{
		UserMaster user=new UserMaster();
		model.addAttribute("user",user);
		return "login";		
		
	}
	
	@RequestMapping(value="check")
	public String checklogin(@ModelAttribute("user")@Valid UserMaster user1,BindingResult result,Model model)
	{
		String userid = user1.getUserid();
		String uname = user1.getUsername();
		String pass = user1.getPassword();
		String usertype = user1.getUsertype();
		int user;
		if(result.hasErrors())
		{
			return "login";
		}
		else
		{
		try
		{
			if(usertype.equalsIgnoreCase("admin"))
			{
				user = eservice.checkuserpass(userid, uname, pass, usertype);
				if(user==1)
				{
				return "Admin";
				}
				else
				{
					model.addAttribute("errMsg","Please Enter Valid Admin Login Credentials");
					return "error";
				}
			}
			else if(usertype.equalsIgnoreCase("employee"))
			{
				user = eservice.checkuserpass(userid, uname, pass, usertype);
					if(user==1)
					{
					return "Employee";
					}
					else
					{
						model.addAttribute("errMsg","Please Enter Valid Employee Login Credentials");
						return "error";
					}
			}
			else
			{
				model.addAttribute("errMsg","Please Enter Valid Login Details either for Admin or Employee");
				return "error";
			}
			
		} 
		
		catch (EmployeeException e) 
		{
			model.addAttribute("errMsg",e.getMessage());
			return "error";
		}	
		}
		
	
	}
	
		
	@RequestMapping("showAll")
	public String showAllDetails(Model model)
	{
		try
		{
			ArrayList<Employee> empList=eservice.getAll();
			if(empList!=null&& !empList.isEmpty()){
				model.addAttribute("empList", empList);
				return "displayAll";
			}
			else{

				model.addAttribute("Msg", "No Data in Employee table");
				return "error";
			}
		}
		catch(DataAccessException | EmployeeException da)
		{
			model.addAttribute("errMsg",da.getMessage());
			return "error";

		}
	}
	

	@RequestMapping(value="AddEmployee")
	public String AddEmployee(Map<String,Object> model)
	{
		Employee emp=new Employee();
		ArrayList<String> myDep = new ArrayList<String>();
		//myDep.add("Please Select");
		myDep.add("10");
		myDep.add("20");
		myDep.add("30");
		myDep.add("40");
		myDep.add("50");
		myDep.add("60");
		model.put("myDep",myDep);
		ArrayList<String> grade = new ArrayList<String>();
		grade.add("Please Select");
		grade.add("M1");
		grade.add("M2");
		grade.add("M3");
		grade.add("M4");
		grade.add("M5");
		grade.add("M6");
		grade.add("M7");
		model.put("grade",grade);
		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Please Select");
		gender.add("F");
		gender.add("M");
		model.put("gender",gender);
		ArrayList<String> mstatus = new ArrayList<String>();
		mstatus.add("Please Select");
		mstatus.add("S");
		mstatus.add("M");
		mstatus.add("D");
		mstatus.add("W");
		model.put("mstatus",mstatus);
		model.put("emp", emp);
		return "AddEmployee";
	
	}
	
	
	@RequestMapping(value="adddet",method=RequestMethod.POST)
	public String addEmployeeData(@ModelAttribute("emp")@Valid Employee emp,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "error";
		}
		System.out.println("************");
		try
		{
			String rows = eservice.addEmployee(emp);
			model.addAttribute("emp", emp);
			if(rows!=null)
			{
				return "redirect:showAll.htm";
			}
			else
			{
				model.addAttribute("errMsg","Technical Problem..Please Try Later!!");
				return "error";
			}
			
		}
		catch(DataAccessException | EmployeeException da)
		{
			model.addAttribute("errMsg","Technical Problem..Please Try Later!!");
			return "error";
		}
		//return "index";
		
	}
	
	@RequestMapping(value="DeleteEmployee")
	public String delete(Model model)
	{
		Employee employee = new Employee();
		model.addAttribute("emp",employee);
		return "delete";
	}
	
	@RequestMapping(value="deleteemployee")
	public String retrievetoDelete(@RequestParam("employeeId") String empid,Model model)
	{
		try 
		{
			ArrayList<Employee> empList = eservice.retrieveEmployeeById(empid);
			model.addAttribute("emp",empList);	
			return "displayDelete";
		} 
		catch (EmployeeException e) 
		{
			model.addAttribute("errMsg","Technical Problem..Please Try Later!!");
			//da.printStackTrace();
			return "error";
		}
				
	}
	
	
	@RequestMapping(value="delete")
	public String deleteTrainee(@RequestParam("eid")String empId,Model model)
	{
		
		try{
			
			int rows=eservice.deleteEmployee(empId);
			if(rows!=0)
			{

				return "redirect:showAll.htm";

			}
			else
			{
				model.addAttribute("errMsg", "Technical Issues occures");
				return "error";

			}

		}
		catch(DataAccessException | EmployeeException da)
		{
			model.addAttribute("errMsg", da.getMessage());
			return "error";
		}

	}
	
	@RequestMapping(value="UpdateEmployee")
	public String update(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "modify";
	}
	
	@RequestMapping(value="modifyemployee")
	public String retrieveForUpdate(@ModelAttribute("emp") Employee emp,Model model)
	{
		String empid = emp.getEmployeeId();
		try
		{
			Employee emp1 = eservice.retrieve(empid);
			model.addAttribute("emp",emp1);
			return "displayUpdate";
		
		}
		catch(DataAccessException | EmployeeException da)
		{
			model.addAttribute("errMsg", da.getMessage());
			return "error";
		}
		
	}
	
	@RequestMapping(value="update")
	public String updateEmployee(@ModelAttribute("emp") Employee emp,Model model)
	{
		try 
		{

			int rowcount=eservice.modifyEmployee(emp);
			if(rowcount!=0)
			{
				return "redirect:showAll.htm";
			}
			else
			{
				model.addAttribute("errMsg", "Technical Issues occures");
				return "error";

			}
			
	}
		catch (EmployeeException e)
		{
			model.addAttribute("errMsg", e.getMessage());
			return "error";
		}
	
	}
	
	@RequestMapping(value="RetrieveEmployeeById")
	public String search(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchId";
	}
	
	@RequestMapping(value="search")
	public String searchEmployee(@RequestParam("employeeId") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeById(employee);
				model.addAttribute("emp",empList);
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	
	@RequestMapping(value="RetrieveEmployeeByFirstName")
	public String searchFirstName(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchFirstName";
	}
	
	@RequestMapping(value="searchfname")
	public String searchByFirstName(@RequestParam("firstname") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeByfirstName(employee);
				model.addAttribute("emp",empList);
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	

	@RequestMapping(value="RetrieveEmployeeByLastName")
	public String searchLastName(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchLastName";
	}
	
	@RequestMapping(value="searchlname")
	public String searchByLastName(@RequestParam("lastname") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeBylastName(employee);
				model.addAttribute("emp",empList);
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	
	
	@RequestMapping(value="RetrieveEmployeeByDeptId")
	public String searchdeptId(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchdeptId";
	}
	
	@RequestMapping(value="searchdeptid")
	public String searchByDeptID(@RequestParam("empdepid") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeBydeptId(employee);
				model.addAttribute("emp",empList);
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	
	@RequestMapping(value="RetrieveEmployeeByGrade")
	public String searchGrade(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchgrade";
	}
	
	@RequestMapping(value="searchgrade")
	public String searchByGrade(@RequestParam("egrade") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeByGrade(employee);
				model.addAttribute("emp",empList);
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	
	
	@RequestMapping(value="RetrieveEmployeeByMaritalStatus")
	public String searchMaritalStatus(Model model)
	{
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		return "searchmstatus";
	}
	
	@RequestMapping(value="searchmstatus")
	public String searchByMaritalStatus(@RequestParam("maritalStatus") String employee,Model model)
	{	
		try 
			{
				ArrayList<Employee> empList = eservice.retrieveEmployeeByMaritalStatus(employee);
				model.addAttribute("emp",empList);				
				return "display";
			}
			catch (EmployeeException e) 
			{
				model.addAttribute("errMsg", e.getMessage());
				return "error";
			}
			
	}
	
	@RequestMapping(value="about")
	public String about(Model model)
	{
		return "about";
	}
	
	@RequestMapping(value="gallery")
	public String gallery(Model model)
	{
		return "gallery";
	}
	
	@RequestMapping(value="blog")
	public String blog(Model model)
	{
		return "blog";
	}
	
	@RequestMapping(value="contact")
	public String contact(Model model)
	{
		return "contact";
	}
	
}
