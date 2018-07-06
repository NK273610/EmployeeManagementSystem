package com.igate.employee.dto;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;


public class UserMaster {
	@NotEmpty(message="User Id should not be empty")
	@Pattern(regexp="^[0-9]+$",message="User id should consists of only digits")
	private String userid;
	@NotEmpty(message="User Name should not be empty")
	@Pattern(regexp="^[a-zA-Z]+$",message="User Name should consists of only alphabets")
	private String username;
	@NotEmpty(message="Password should not be empty")
	private String password;
	@NotEmpty(message="Choose a option")
	private String usertype;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	

}
