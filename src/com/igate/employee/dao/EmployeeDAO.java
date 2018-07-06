package com.igate.employee.dao;

import java.sql.Date;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.igate.employee.dto.Employee;
import com.igate.employee.exception.EmployeeException;

@Repository("dao")
public class EmployeeDAO extends JdbcDaoSupport implements IEmployeeDAO
{
	@Autowired
	private DataSource dataSource;	
	@PostConstruct
	public void initialize(){

		setDataSource(dataSource);
	}
	
	@Override
	public ArrayList<Employee> getAll() throws EmployeeException
	{
		String isql ="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining,"
				+ "emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address,"
				+ "emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d,"
				+ "grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code";
		//String sql = "select * from employee_detail";
		
		ArrayList<Employee> empList = (ArrayList<Employee>) getJdbcTemplate().query(isql, new EmployeeRowMapper());
		return empList;
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeById(String empid) throws EmployeeException
	{
		String str = empid.replace("*", "%");
		String or = str.replace("?", "_");
		
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining,"
				+ "emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address,"
				+ "emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d,"
				+ "grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code"
				+ " and emp_id LIKE '"+or+"'";
		
		ArrayList<Employee> emp = (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;
		
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeByfirstName(String empfirstName) throws EmployeeException
	{
		String str = empfirstName.replace("*", "%");
		String or = str.replace("?", "_");
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining,"
				+ "emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address,"
				+ "emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d,"
				+ "grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code"
				+ " and emp_first_name LIKE '"+or+"'";
		ArrayList<Employee> emp =  (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;
		
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeBylastName(String emplastName) throws EmployeeException
	{
		String str = emplastName.replace("*", "%");
		String or = str.replace("?", "_");		
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining"
				+ ",emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address"
				+ ",emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d"
				+ ",grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code "
				+ "and emp_last_name LIKE '"+or+"'";
		ArrayList<Employee> emp =  (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;
		
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeBydeptId(String deptId) throws EmployeeException
	{
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining"
				+ ",emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address"
				+ ",emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d"
				+ ",grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code "
				+ "and emp_dept_id="+deptId;
		ArrayList<Employee> emp =  (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;		
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeByGrade(String empGrade) throws EmployeeException
	{
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining"
				+ ",emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address"
				+ ",emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d"
				+ ",grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code "
				+ "and emp_grade='"+empGrade+"'";
		ArrayList<Employee> emp =  (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;		
	}
	
	@Override
	public ArrayList<Employee> retrieveEmployeeByMaritalStatus(String empMaritalStatus) throws EmployeeException
	{
		String sql="select emp_id,emp_first_name,emp_last_name,emp_date_of_birth,emp_date_of_joining"
				+ ",emp_dept_id,dept_name,emp_grade,emp_designation,emp_basic,emp_gender,emp_marital_status,emp_home_address"
				+ ",emp_contact_num,description,min_salary,"
				+ "max_salary from employee_detail e,department_masters d"
				+ ",grade_master g where e.emp_dept_id=d.dept_code and e.emp_grade=g.grade_code "
				+ "and emp_marital_status='"+empMaritalStatus+"'";
		ArrayList<Employee> emp =  (ArrayList<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
		return emp;		
	}
	
	//Update The Employee Details based on Employee ID;
	
	@Override
	public int modifyEmployee(Employee employee) throws EmployeeException
	{
		String updatesql=null;
		int count=0;
		try {
			 updatesql = "update employee_detail set emp_first_name=?,emp_last_name=?,emp_date_of_birth=?,emp_date_of_joining=?"
					+ ",emp_dept_id=?,emp_grade=?,emp_designation=?,emp_basic=?,emp_gender=?,emp_marital_status=?,emp_home_address=?"
					+ ",emp_contact_num=? where emp_id=?";
			 String fname = employee.getFirstname();
			 String lname = employee.getLastname();
			 Date dob = employee.getDob();
			 Date doj = employee.getDoj();
			 System.out.println(doj);
			 int dept = employee.getEmpdepid();
			 String grade = employee.getEgrade();
			 String design = employee.getDesignation();
			 int basic = employee.getEmpbasic();
			 String gender = employee.getGender();
			 String mstatus = employee.getMaritalStatus();
			 String haddress = employee.getHomeaddress();
			 String contact = employee.getContact();
			 String id = employee.getEmployeeId();
			 
			 Object[] params={fname,lname,dob,doj,dept,grade,design,basic,gender,mstatus,haddress,contact,id};
			 count = getJdbcTemplate().update(updatesql,params);
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		return count;	
		
	}
	
	//Delete The Employee Detail Based On EmployeeId
	@Override
	public int deleteEmployee(String empId) throws EmployeeException
	{		
		String sql="Delete from employee_detail Where emp_id=?";
		Object[] params={empId};

		return getJdbcTemplate().update(sql,params);
	}
	
	//Add Employee Details
	
	public String addEmployee(Employee emp) throws EmployeeException
	{
		String sql = "select employee_seq.nextval from dual";
		String isql = "insert into employee_detail values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
		String eid=null;
		try
		{
			eid = getJdbcTemplate().queryForObject(sql,String.class);
			emp.setEmployeeId(eid);
			Object[] params = new Object[]
				{
					emp.getEmployeeId(),
					emp.getFirstname(),
					emp.getLastname(),
					emp.getDob(),
					emp.getDoj(),
					emp.getEmpdepid(),
					emp.getEgrade(),
					emp.getDesignation(),
					emp.getEmpbasic(),
					emp.getGender(),
					emp.getMaritalStatus(),
					emp.getHomeaddress(),
					emp.getContact()
				};
		int inserted =  getJdbcTemplate().update(isql,params);
		System.out.println(inserted);
		}
		catch(DataAccessException da)
		{
			throw new EmployeeException(da.getMessage());			
		}
		
		return eid;	
	}
	
	public int checkuserpass(String userid,String uname,String pass,String usertype) throws EmployeeException
	{
			String query = "select * from user_master where userid='"+userid+"' AND username='"+uname+"' AND userpassword='"+pass+"' AND usertype='"+usertype+"'";
			return getJdbcTemplate().update(query);
	}
	
	public Employee retrieve(String empid) throws EmployeeException
	{		
		Employee emp = null;
		try
		{
			System.out.println(empid);
		String sql = "select * from employee_detail where emp_id='"+empid+"'";
		emp = getJdbcTemplate().queryForObject(sql,new EmployeeMapper());
		
		}
		catch(DataAccessException da)
		{
			da.printStackTrace();			
		}
		return emp;
	}
	
}
