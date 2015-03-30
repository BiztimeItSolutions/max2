package com.biztime.campusg.dao;

/**
 * @author     Anuvidhya
 * @Module     EmployeeProfile
 * @Purpose    Maintain Employee Details
 *
 */

import java.util.List;

import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.EmployeeCommand;
import com.biztime.campusg.model.EmployeeDocument;
import com.biztime.campusg.model.EmployeeLeave;
import com.biztime.campusg.model.EmployeeSubjectAssociation;
public interface EmployeeDAO {

public int saveEmployee(Employee e);

public int saveEmployeeLeave(EmployeeLeave leave);

public void saveEmployeeLeaveDetail(EmployeeLeave leave);

public EmployeeLeave getEmployeeLeaveDetail(int employee_leave_id);

public List<EmployeeLeave> getEmployeeLeave();

public void saveEmployeeLeaveId(EmployeeLeave leave);

public void saveEmployeeSubjectAssociation(EmployeeSubjectAssociation s);

public int saveEmployeeSubjectAssociationName(EmployeeSubjectAssociation s);

public List<Employee> getEmployee();

public Employee getEmployeeViewDetail(int employeeId);

public List<EmployeeDocument> getEmployeeDocument();

public void saveEmployeeDocument(EmployeeCommand command);

public void saveEmployeeDocumentName(EmployeeCommand command);

//**********************Dropdown values from database******************************************************	

public String getLeaveType();

public String getLeaveCount(String s);

public String getLeaveCode(String s);

public String getLeaveStatus(String s);

public List<Employee> getEmployeeDetail(String s);

public String getDetail();

public String getBatch();

public String getSemester();

public String getSubject(String s, String b);

public String getEmployeeid(String s);

public String getEmployeename(String e);

public String getEmployeedesignation(String e);

public String getMonth();

public String getTotalDays(String m);

public String getHolidays(String m);

public String getWorkingDays(String m);

public String getTotalWorkingDays(String e, String m);

public List<EmployeeLeave> getAbsentDays(String e, String m);

public List<EmployeeLeave> getPayableDays(String e, String m);






	
}
