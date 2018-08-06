package com.ssms.models;

public class Subject {
	
	private String subjectCode;
	private String subjectName;
	private String description;
	
	
	public Subject(String subjectCode) {
		this.subjectCode = subjectCode;
	}


	/**
	 * @return the subjectCode
	 */
	public String getSubjectCode() {
		return subjectCode;
	}


	/**
	 * @param subjectCode the subjectCode to set
	 */
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}


	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}


	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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
	
	

}
