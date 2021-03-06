package com.biztime.campusg.dao;

/**
 * @author     Anuvidhya
 * @Module     EmployeeProfile
 * @Purpose    Maintain Employee Details
 *
 */

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.EmployeeCommand;
import com.biztime.campusg.model.EmployeeDocument;
import com.biztime.campusg.model.EmployeeLeave;
import com.biztime.campusg.model.EmployeeOtherDetail;
import com.biztime.campusg.model.EmployeeSubjectAssociation;
import com.biztime.campusg.model.FeeType;
import com.biztime.campusg.model.StudentDocument;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
@Override
public int saveEmployee(Employee e)
{
		
		Session session = this.sessionFactory.getCurrentSession();
		session.save(e);
		logger.info("Student saved successfully, Employee Details="+e);
		return 1;
		
	}


@Override
public void saveEmployeeSubjectAssociation(EmployeeSubjectAssociation s) {
	// TODO Auto-generated method stub
	  String bn=s.getBatchName().trim();
	  String sn=s.getSemesterName().trim();
	  String sub=s.getSubjectName().trim();
	 int eid=s.getEmployeeId();
	 
	  Session session = this.sessionFactory.getCurrentSession();
			
     // String hql = "INSERT INTO EmployeeSubjectAssociation(batchId,subjectId,semesterId) SELECT b.batchId,s.subjectId,c.semesterId FROM Batchmodel b, Semester c,Subjectmodel s WHERE b.batchName='"+bn+"' AND c.semesterName='"+sn+"' AND s.subjectName='"+sub+"'";

      String hql = "INSERT INTO EmployeeSubjectAssociation(batchId,subjectId,semesterId,employeeId) SELECT b.batchId,s.subjectId,c.semesterId,e.employeeId FROM Batchmodel b, Semester c,Subjectmodel s,Employee e WHERE b.batchName='"+bn+"' AND c.semesterName='"+sn+"' AND s.subjectName='"+sub+"' AND e.employeeId='"+eid+"'";
    
	  Query query = session.createQuery(hql);
	  int result = query.executeUpdate();
		  
	  System.out.println("Rows affected: " + result);
		  
}

@Override
public int saveEmployeeSubjectAssociationName(EmployeeSubjectAssociation s) {
	// TODO Auto-generated method stub
	 int eid=s.getEmployeeId();
	Session session = this.sessionFactory.getCurrentSession();
	String hql=("UPDATE EmployeeSubjectAssociation set batchName ='"+s.getBatchName()+"'," +
			    "departmentName='"+s.getDepartmentName()+"'," +
			    "semesterName='"+s.getSemesterName()+"'," +
				"subjectName='"+s.getSubjectName()+"' WHERE employeeId="+eid);
			   

    Query query = session.createQuery(hql);
    int name = query.executeUpdate();
  
    System.out.println("Rows affected: " + name);
	return name;
}


@Override
@SuppressWarnings("unchecked")
public List<Employee> getEmployee() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM Employee";
	Query query=session.createQuery(hql);
	List<Employee> Employee= query.list();	
	return Employee;
}

@Override
public Employee getEmployeeViewDetail(int employeeId) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	return (Employee) session.get(Employee.class, employeeId);
}


@Override
public int saveEmployeeLeave(EmployeeLeave leave) {
		// TODO Auto-generated method stub
		
		int eid=leave.getEmployeeId();
		Session session = this.sessionFactory.getCurrentSession();
		String hql=("UPDATE EmployeeLeave set leaveStatus ='"+leave.getLeaveStatus()+"'," +
				    "leaveName='"+leave.getLeaveName()+"'," +
				    "leaveCode='"+leave.getLeaveCode()+"'," +
					"leaveCount='"+leave.getLeaveCount()+"'," +
					"status='"+leave.getStatus()+"'," +
				    "startDate='"+leave.getStartDate()+"'," +
					"endDate='"+leave.getEndDate()+"'," +
					"daysRequest='"+leave.getDaysRequest()+"'," +
					"appliedMonth='"+leave.getAppliedMonth()+"',"+
					"appliedDate='"+leave.getAppliedDate()+"' WHERE employeeId="+eid);

	    Query query = session.createQuery(hql);
	    int result = query.executeUpdate();
	  
	    System.out.println("Rows affected: " + result);
		return result;
		
	}

@Override
public void saveEmployeeLeaveId(EmployeeLeave leave) {
		// TODO Auto-generated method stub
		  String pn=leave.getLeaveName().trim();
			 
		     int eid=leave.getEmployeeId();
			
			  Session session = this.sessionFactory.getCurrentSession();
				
			  String hql = "INSERT INTO EmployeeLeave(leaveTypeId,employeeId) SELECT m.leaveTypeId,c.employeeId FROM LeaveType m, Employee c WHERE m.leaveName='"+pn+"'  AND c.employeeId='"+eid+"'";
		         
		      Query query = session.createQuery(hql);
			  int result = query.executeUpdate();
			  
			  System.out.println("Rows affected: " + result);
			  
		   
	}
	
@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeLeave> getEmployeeLeave() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM EmployeeLeave";
		Query query=session.createQuery(hql);
		List<EmployeeLeave> EmployeeLeave= query.list();	
		return EmployeeLeave;
	}
	
@Override
	public EmployeeLeave getEmployeeLeaveDetail(int employee_leave_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (EmployeeLeave) session.get(EmployeeLeave.class, employee_leave_id);
	}

@Override
	public void saveEmployeeLeaveDetail(EmployeeLeave leave) {
		// TODO Auto-generated method stub
		int eid=leave.getEmployee_leave_id();
		Session session = this.sessionFactory.getCurrentSession();
		String hql=("UPDATE EmployeeLeave set leaveStatus ='"+leave.getLeaveStatus()+"',reason='"+leave.getReason()+"' WHERE employee_leave_id="+eid);

	    Query query = session.createQuery(hql);
	    int result = query.executeUpdate();
	  
	    System.out.println("Rows affected: " + result);
		
	}

@Override	
@SuppressWarnings("unchecked")
public List<EmployeeDocument> getEmployeeDocument() {
	// TODO Auto-generated method stub
	 Session session = this.sessionFactory.getCurrentSession();
	   List<EmployeeDocument> employeeDocument = session.createQuery("FROM EmployeeDocument").list();
		
	   System.out.println("Inside Dao document");
	   return employeeDocument;
}

@Override
public void saveEmployeeDocument(EmployeeCommand command) {
	// TODO Auto-generated method stub
	
		 String doc=command.getEmployeeOtherDetail().getDocumentName().trim();
	   int eid=command.getEmployee().getEmployeeId();
			
	     String[] temp = doc.split(",");
	     for (int i = 0; i < temp.length; i++)
	    {
	     
		  Session session = this.sessionFactory.getCurrentSession();
			
		  String hql = "INSERT INTO EmployeeOtherDetail(documentId,employeeId) SELECT d.documentId, e.employeeId FROM EmployeeDocument d, Employee e WHERE d.documentName='"+temp[i]+"' AND e.employeeId='"+eid+"'";
	         
	      Query query = session.createQuery(hql);
		  int result = query.executeUpdate();
		  
		  System.out.println("Rows affected: " + result);
		  
	    }
}

@Override
public void saveEmployeeDocumentName(EmployeeCommand command) {
	// TODO Auto-generated method stub
    
	Session session = this.sessionFactory.getCurrentSession();
	String hql=("UPDATE EmployeeOtherDetail set documentName='"+command.getEmployeeOtherDetail().getDocumentName()+"' WHERE employeeId = "+command.getEmployee().getEmployeeId());

    Query query = session.createQuery(hql);
    int result = query.executeUpdate();
  
    System.out.println("Rows affected: " + result);

}
	
	//**********************Dropdown values from database******************************************************	
	
	@Override
	public String getLeaveType()
	 {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT leaveName FROM LeaveType";
		
		Query query=session.createQuery(hql);
		String leavetype=query.list().toString();
		
		System.out.println("query returned:  "+leavetype);
		return leavetype;
	 }

	@Override
	public String getLeaveStatus(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT l.status FROM LeaveType l WHERE l.leaveName=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String status=query.list().toString();
		System.out.println("query returned:  "+status);
		return status;
	}

	@Override
	public String getLeaveCode(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT l.leaveCode FROM LeaveType l WHERE l.leaveName=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String code=query.list().toString();
		System.out.println("query returned:  "+code);
		return code;
	}

	@Override
	public String getLeaveCount(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT l.leaveCount FROM LeaveType l WHERE l.leaveName=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String count=query.list().toString();
		System.out.println("query returned:  "+count);
		return count;
	}

	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT departmentName FROM Departmentmodel";
		
		Query query=session.createQuery(hql);
		String department=query.list().toString();
		
		System.out.println("query returned:  "+department);
		return department;
	}

	@Override
	public List<Employee> getEmployeeDetail(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		System.out.println("received from controller: "+p);
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Employee f WHERE f.department=:p";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		@SuppressWarnings("unchecked")
		List<Employee> employeeList=(List<Employee>)query.list();
		
		return employeeList;
	}

	@Override
	public String getBatch() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT batchName FROM Batchmodel";
		
		Query query=session.createQuery(hql);
		String batch_name=query.list().toString();
		
		System.out.println("query returned:  "+batch_name);
		return batch_name;
	}

	@Override
	public String getSemester() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT semesterName FROM Semester";
		
		Query query=session.createQuery(hql);
		String semester_name=query.list().toString();
		
		System.out.println("query returned:  "+semester_name);
		return semester_name;
	}

	@Override
	public String getSubject(String s, String b) {
		// TODO Auto-generated method stub
		String p=s.trim();
		String q=b.trim();
		System.out.println("batch name received from controller"+q);
		
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT s.subjectName FROM Subjectmodel s WHERE s.mapId=(SELECT m.mapId FROM SemesterSubjectMap m WHERE m.semesterId=(SELECT r.semesterId FROM Semester r WHERE r.semesterName=?)AND m.courseId=(SELECT c.courseId FROM Batchmodel c WHERE c.batchName=:q))";
		
		Query query=session.createQuery(hql);
		
		query.setString(0, p);
		query.setString("q", q);
		
		String subject=query.list().toString();
		System.out.println("query returned:  "+subject);
		return subject;
	}

	
	@Override
	public String getEmployeeid(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.employeeId FROM Employee e WHERE e.department=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String id=query.list().toString();
		System.out.println("query id returned:  "+id);
		return id;
	}

	
	@Override
	public String getEmployeename(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.firstName FROM Employee e WHERE e.employeeId=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String name=query.list().toString();
		System.out.println("query name returned:  "+name);
		return name;
	}

	@Override
	public String getEmployeedesignation(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.designation FROM Employee e WHERE e.employeeId=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String designation=query.list().toString();
		System.out.println("query designation returned:  "+designation);
		return designation;
	}
	
	public String getEmployeeCtc(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("check ctc dao ");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.ctc FROM Employee e WHERE e.employeeId=:p";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		String ctc=query.list().toString();
		System.out.println("query ctc returned:  "+ctc);
		return ctc;
	}
	
	public String getEmployeeAllowance(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("check ctc dao ");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.allowance FROM Employee e WHERE e.employeeId=:p";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		String ctc=query.list().toString();
		System.out.println("query ctc returned:  "+ctc);
		return ctc;
	}

	public String getEmployeeTds(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("check ctc dao ");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.tds FROM Employee e WHERE e.employeeId=:p";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		String ctc=query.list().toString();
		System.out.println("query ctc returned:  "+ctc);
		return ctc;
	}

	public String getEmployeePf(String e) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("check ctc dao ");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.pf FROM Employee e WHERE e.employeeId=:p";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		String ctc=query.list().toString();
		System.out.println("query ctc returned:  "+ctc);
		return ctc;
	}

	@Override
	public String getMonth() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT month FROM CollegeCalendar";
		
		Query query=session.createQuery(hql);
		String month=query.list().toString();
		
		System.out.println("query month returned:  "+month);
		return month;
	}
	
	@Override
public String getTotalDays(String m) {
		// TODO Auto-generated method stub
		String p=m.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT c.totalDays FROM CollegeCalendar c WHERE c.month=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String totaldays=query.list().toString();
		System.out.println("query totaldays returned:  "+totaldays);
		return totaldays;
	}

	@Override
	public String getHolidays(String m) {
		// TODO Auto-generated method stub
		String p=m.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT c.holidays FROM CollegeCalendar c WHERE c.month=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String holidays=query.list().toString();
		System.out.println("query holidays returned:  "+holidays);
		return holidays;
	}

	@Override
	public String getWorkingDays(String m) {
		// TODO Auto-generated method stub
		String p=m.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT c.workingDays FROM CollegeCalendar c WHERE c.month=?";
		
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String workingdays=query.list().toString();
		System.out.println("query working days returned:  "+workingdays);
		return workingdays;
	}

	@Override
	public String getTotalWorkingDays(String e, String m) {
		// TODO Auto-generated method stub
		String p=e.trim();
		String q=m.trim();
		System.out.println("month received from controller="+q);
		System.out.println("employee id received from controller"+p);
		
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT e.totalWorkingDays FROM EmployeeAttendance e WHERE e.employeeId=:p AND e.month=:q";
		
		Query query=session.createQuery(hql);
		
		query.setString("p", p);
		query.setString("q", q);
		
		String totalworkingdays=query.list().toString();
		System.out.println("query totalworkingdays returned:  "+totalworkingdays);
		return totalworkingdays;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeLeave> getAbsentDays(String e,String m) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("employee id for absent days"+p);
		String q=m.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM EmployeeLeave e WHERE e.employeeId=:p AND e.leaveStatus='Approved' AND e.appliedMonth=:q AND e.leaveCode != 'PL'";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		query.setString("q", q);
		List<EmployeeLeave> absentdays=(List<EmployeeLeave>)query.list();
		System.out.println("printing absent days: "+absentdays.toString());
	
		return absentdays;
	
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeLeave> getPayableDays(String e,String m) {
		// TODO Auto-generated method stub
		String p=e.trim();
		System.out.println("employee id for absent days"+p);
		String q=m.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM EmployeeLeave e WHERE e.employeeId=:p AND e.appliedMonth=:q AND e.leaveStatus='Approved' AND e.leaveCode= 'PL'";
		
		Query query=session.createQuery(hql);
		query.setString("p", p);
		query.setString("q", q);
		List<EmployeeLeave> payableDays=(List<EmployeeLeave>)query.list();
		System.out.println("printing absent days: "+payableDays.toString());
	
		return payableDays;
	}


	

	

	
	
	}//end of DAO





