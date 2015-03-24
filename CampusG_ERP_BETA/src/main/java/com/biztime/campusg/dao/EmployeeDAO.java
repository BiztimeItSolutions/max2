package com.biztime.campusg.dao;

/**
 * @author     Anuvidhya
 * @Module     EmployeeProfile
 * @Purpose    Maintain Employee Details
 *
 */

import java.util.List;

import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.EmployeeLeave;
public interface EmployeeDAO {

public void saveEmployee(Employee e);

public int saveEmployeeLeave(EmployeeLeave leave);

public void saveEmployeeLeaveDetail(EmployeeLeave leave);

public EmployeeLeave getEmployeeLeaveDetail(int employee_leave_id);

public List<EmployeeLeave> getEmployeeLeave();

public void saveEmployeeLeaveId(EmployeeLeave leave);

//**********************Dropdown values from database******************************************************	

public String getLeaveType();

public String getLeaveCount(String s);

public String getLeaveCode(String s);

public String getLeaveStatus(String s);

public List<Employee> getEmployeeDetail(String s);
	
}
