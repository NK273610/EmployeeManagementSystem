package com.igate.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igate.employee.dao.IEmployeeDAO;
import com.igate.employee.dto.Employee;
import com.igate.employee.exception.EmployeeException;

@Service("eservice")
public class EmployeeService implements IEmployeeService 
{
	@Autowired
	IEmployeeDAO dao;
	
	@Override
	public String addEmployee(Employee employee) throws EmployeeException
	{
		return dao.addEmployee(employee);
	}
	@Override
	public ArrayList<Employee> getAll() throws EmployeeException
	{
		return dao.getAll();		
	}

	@Override
	public ArrayList<Employee> retrieveEmployeeById(String empid) throws EmployeeException
	{
		return dao.retrieveEmployeeById(empid);
	}
	@Override
	public ArrayList<Employee> retrieveEmployeeByfirstName(String empfirstName) throws EmployeeException
	{
		return dao.retrieveEmployeeByfirstName(empfirstName);
	}
	@Override
	public ArrayList<Employee> retrieveEmployeeBylastName(String emplastName) throws EmployeeException
	{
		return dao.retrieveEmployeeBylastName(emplastName);
	}
	@Override
	public ArrayList<Employee> retrieveEmployeeBydeptId(String deptId) throws EmployeeException
	{
		return dao.retrieveEmployeeBydeptId(deptId);
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeByGrade(String empGrade) throws EmployeeException
	{
		return dao.retrieveEmployeeByGrade(empGrade);
	}

	@Override
	public ArrayList<Employee> retrieveEmployeeByMaritalStatus(String empMaritalStatus) throws EmployeeException
	{
		return dao.retrieveEmployeeByMaritalStatus(empMaritalStatus);
	}
	
	@Override
	public int modifyEmployee(Employee employee) throws EmployeeException
	{
		return dao.modifyEmployee(employee);
	}
	
	@Override
	public int deleteEmployee(String empId) throws EmployeeException
	{
		return dao.deleteEmployee(empId);
	}
	
	public int checkuserpass(String userid,String uname,String pass,String usertype) throws EmployeeException
	{
		return dao.checkuserpass(userid, uname, pass, usertype);
	}
	public Employee retrieve(String empid) throws EmployeeException
	{
		return dao.retrieve(empid);
	}
}
