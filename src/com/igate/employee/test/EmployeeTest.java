package com.igate.employee.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.igate.employee.dao.EmployeeDAO;
import com.igate.employee.dto.Employee;
import com.igate.employee.exception.EmployeeException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("testDao.xml")
@ActiveProfiles("oracle")
public class EmployeeTest {

	@Autowired
	private EmployeeDAO dao;
	
	Employee employee;
	
	@Test
	public void testAllEmployee() {
		System.out.println("in testAllEmployee class"  );
		try {
			Assert.assertNotNull(dao.getAll());
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void searchEmployee(){
		System.out.println("In searchEmployee Class");
		String empfirstName = "Tirumala";
		try {
			Assert.assertNotNull(dao.retrieveEmployeeByfirstName(empfirstName));
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void deleteEmployee(){
		System.out.println("In deleteEmployee class");
		String id = "834444";
		try {
			int rowCount = dao.deleteEmployee(id);
			Assert.assertNotNull("no records Found",rowCount>0);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
