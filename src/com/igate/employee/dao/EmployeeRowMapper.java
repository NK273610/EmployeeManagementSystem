package com.igate.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.employee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int num) throws SQLException 
	{
		
		Employee emp = new Employee();
		emp.setEmployeeId(rs.getString("emp_id"));
		emp.setFirstname(rs.getString("emp_first_name"));
		emp.setLastname(rs.getString("emp_last_name"));
		emp.setDob(rs.getDate("emp_date_of_birth"));
		emp.setDoj(rs.getDate("emp_date_of_joining"));
		emp.setEmpdepid(rs.getInt("emp_dept_id"));
		emp.setDeptname(rs.getString("dept_name"));
		emp.setEgrade(rs.getString("emp_grade"));
		emp.setDesignation(rs.getString("emp_designation"));
		emp.setEmpbasic(rs.getInt("emp_basic"));
		emp.setGender(rs.getString("emp_gender"));
		emp.setMaritalStatus(rs.getString("emp_marital_status"));
		emp.setHomeaddress(rs.getString("emp_home_address"));
		emp.setContact(rs.getString("emp_contact_num"));
		emp.setDescription(rs.getString("description"));
		emp.setMinSal(rs.getString("min_salary"));
		emp.setMaxSal(rs.getString("max_salary"));
		
		return emp;
	}

}
