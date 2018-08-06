 package com.ssms.models;

public class Student extends SchoolUser {

	private String rollNo;
	private String admissionNo;
	private String admissionDate;
	private String course;
	private String batch;
	
	

	public Student(String id) {
		super(id);
	}



	public Student(String id, String rollNo) {
		super(id);
		this.rollNo = rollNo;
	}



	/**
	 * @return the rollNo
	 */
	public String getRollNo() {
		return rollNo;
	}



	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}



	/**
	 * @return the admissionNo
	 */
	public String getAdmissionNo() {
		return admissionNo;
	}



	/**
	 * @param admissionNo the admissionNo to set
	 */
	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}



	/**
	 * @return the admissionDate
	 */
	public String getAdmissionDate() {
		return admissionDate;
	}



	/**
	 * @param admissionDate the admissionDate to set
	 */
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}



	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}



	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}



	/**
	 * @return the batch
	 */
	public String getBatch() {
		return batch;
	}



	/**
	 * @param batch the batch to set
	 */
	public void setBatch(String batch) {
		this.batch = batch;
	}
	

}
