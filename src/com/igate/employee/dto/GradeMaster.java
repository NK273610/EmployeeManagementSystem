package com.igate.employee.dto;

public class GradeMaster extends Department
{
	private String gradeCode;
	private String description;
	private String minSal;
	private String maxSal;
	public String getGradeCode() {
		return gradeCode;
	}
	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMinSal() {
		return minSal;
	}
	public void setMinSal(String string) {
		this.minSal = string;
	}
	public String getMaxSal() {
		return maxSal;
	}
	public void setMaxSal(String maxSal) {
		this.maxSal = maxSal;
	}
	

}
