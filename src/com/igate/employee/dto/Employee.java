package com.igate.employee.dto;

import java.sql.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Employee extends GradeMaster
{
	
	private String employeeId;
	@NotEmpty(message="User Name should not be empty")
	@Pattern(regexp="^[a-zA-Z]+$",message="User Name should consists of only alphabets")
	private String firstname;
	private String lastname;
	private Date dob;
	private Date doj;
	private int empdepid;
	private String egrade;
	private String designation;
	private int empbasic;
	private String gender;
	private String maritalStatus;
	private String homeaddress;
	private String contact;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String firstname, String lastname, Date dob,
			Date doj, int empdepid, String egrade, String designation,
			int empbasic, String gender, String maritalStatus,
			String homeaddress, String contact) {
		super();
		this.employeeId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.doj = doj;
		this.empdepid = empdepid;
		this.egrade = egrade;
		this.designation = designation;
		this.empbasic = empbasic;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.homeaddress = homeaddress;
		this.contact = contact;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getEmpdepid() {
		return empdepid;
	}

	public void setEmpdepid(int empdepid) {
		this.empdepid = empdepid;
	}

	public String getEgrade() {
		return egrade;
	}

	public void setEgrade(String egrade) {
		this.egrade = egrade;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getEmpbasic() {
		return empbasic;
	}

	public void setEmpbasic(int empbasic) {
		this.empbasic = empbasic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + employeeId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", dob=" + dob + ", doj=" + doj
				+ ", empdepid=" + empdepid + ", egrade=" + egrade
				+ ", designation=" + designation + ", empbasic=" + empbasic
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", homeaddress=" + homeaddress + ", contact=" + contact + "]";
	}
	
	
	
}
