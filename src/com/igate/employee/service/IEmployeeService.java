package com.igate.employee.service;

import java.util.ArrayList;

import com.igate.employee.dto.Employee;
import com.igate.employee.exception.EmployeeException;

public interface IEmployeeService {

	public abstract String addEmployee(Employee employee) throws EmployeeException;

	public abstract ArrayList<Employee> getAll() throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeById(String empid)
			throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeByfirstName(
			String empfirstName) throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeBylastName(
			String emplastName) throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeBydeptId(String deptId)
			throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeByGrade(String empGrade)
			throws EmployeeException;

	public abstract ArrayList<Employee> retrieveEmployeeByMaritalStatus(
			String empMaritalStatus) throws EmployeeException;

	public int modifyEmployee(Employee employee) throws EmployeeException;

	public abstract int deleteEmployee(String empId) throws EmployeeException;
	
	public int checkuserpass(String userid,String uname,String pass,String usertype) throws EmployeeException;
	
	public Employee retrieve(String empid) throws EmployeeException;

}