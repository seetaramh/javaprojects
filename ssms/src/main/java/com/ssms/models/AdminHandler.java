package com.ssms.models;

public interface AdminHandler extends StudentHandler{
	
	public void addEmployee(Employee emp);
	public void addClass(String classId);
	public void deleteClass(String classId);
	public void addSection(String sectionId);
	public void deleteSection(String sectionId);
	public void addSubject(Subject subject);
	public void deleteSubject(String subjectId);

}
