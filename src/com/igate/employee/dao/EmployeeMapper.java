package com.igate.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.employee.dto.Employee;

public class EmployeeMapper implements RowMapper<Employee> 
{

	@Override
	public Employee mapRow(ResultSet rs, int num) throws SQLException
	{
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getString(1));
		emp.setFirstname(rs.getString(2));
		emp.setLastname(rs.getString(3));
		emp.setDob(rs.getDate(4));
		emp.setDoj(rs.getDate(5));
		emp.setEmpdepid(rs.getInt(6));
		emp.setEgrade(rs.getString(7));
		emp.setDesignation(rs.getString(8));
		emp.setEmpbasic(rs.getInt(9));
		emp.setGender(rs.getString(10));
		emp.setMaritalStatus(rs.getString(11));
		emp.setHomeaddress(rs.getString(12));
		emp.setContact(rs.getString(13));
		System.out.println(emp);	
		return emp;
	}

}
