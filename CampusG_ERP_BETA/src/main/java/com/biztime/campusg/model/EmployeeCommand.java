package com.biztime.campusg.model;

public class EmployeeCommand {
	
	Employee employee;
	EmployeeDocument employeeDocument;
	EmployeeOtherDetail employeeOtherDetail;
	CollegeCalendar collegeCalendar;
	EmployeeAttendance employeeAttendance; 
	Departmentmodel departmentmodel;
	EmployeeLeave employeeLeave;

	
	
	public Departmentmodel getDepartmentmodel() {
		return departmentmodel;
	}
	public void setDepartmentmodel(Departmentmodel departmentmodel) {
		this.departmentmodel = departmentmodel;
	}
	public EmployeeLeave getEmployeeLeave() {
		return employeeLeave;
	}
	public void setEmployeeLeave(EmployeeLeave employeeLeave) {
		this.employeeLeave = employeeLeave;
	}
	public CollegeCalendar getCollegeCalendar() {
		return collegeCalendar;
	}
	public void setCollegeCalendar(CollegeCalendar collegeCalendar) {
		this.collegeCalendar = collegeCalendar;
	}
	public EmployeeAttendance getEmployeeAttendance() {
		return employeeAttendance;
	}
	public void setEmployeeAttendance(EmployeeAttendance employeeAttendance) {
		this.employeeAttendance = employeeAttendance;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeDocument getEmployeeDocument() {
		return employeeDocument;
	}
	public void setEmployeeDocument(EmployeeDocument employeeDocument) {
		this.employeeDocument = employeeDocument;
	}
	public EmployeeOtherDetail getEmployeeOtherDetail() {
		return employeeOtherDetail;
	}
	public void setEmployeeOtherDetail(EmployeeOtherDetail employeeOtherDetail) {
		this.employeeOtherDetail = employeeOtherDetail;
	}
	
	
	

}
