package com.ssms.models;

public class Course {
	
	private String courseName;
	private String description;
	private String courseCode;
	private Double minimumAttendancePercentage;
	private int totalWorkingDays;
	
	
	public Course(String courseCode) {
		this.courseCode = courseCode;
	}


	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}


	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}


	/**
	 * @return the minimumAttendancePercentage
	 */
	public Double getMinimumAttendancePercentage() {
		return minimumAttendancePercentage;
	}


	/**
	 * @param minimumAttendancePercentage the minimumAttendancePercentage to set
	 */
	public void setMinimumAttendancePercentage(Double minimumAttendancePercentage) {
		this.minimumAttendancePercentage = minimumAttendancePercentage;
	}


	/**
	 * @return the totalWorkingDays
	 */
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}


	/**
	 * @param totalWorkingDays the totalWorkingDays to set
	 */
	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	
	

}
