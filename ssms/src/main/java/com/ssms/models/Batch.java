package com.ssms.models;

import java.util.Date;

public class Batch {
	
	private Course course;
	private String batchName;
	private Date startDate;
	private Date endDate;
	private int maxNoOfStudents;
	
	public Batch(String batchName) {
		this.batchName = batchName;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the batchName
	 */
	public String getBatchName() {
		return batchName;
	}

	/**
	 * @param batchName the batchName to set
	 */
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the maxNoOfStudents
	 */
	public int getMaxNoOfStudents() {
		return maxNoOfStudents;
	}

	/**
	 * @param maxNoOfStudents the maxNoOfStudents to set
	 */
	public void setMaxNoOfStudents(int maxNoOfStudents) {
		this.maxNoOfStudents = maxNoOfStudents;
	}
	
	
	
	

}
