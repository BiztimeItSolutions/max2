package com.biztime.campusg.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.FeeCommand;
import com.biztime.campusg.model.FeeType;
import com.biztime.campusg.model.LoginCombined;
import com.biztime.campusg.model.ModeOfPayment;
import com.biztime.campusg.model.Module;
import com.biztime.campusg.model.Privilege;
import com.biztime.campusg.model.ReceiptBook;
import com.biztime.campusg.model.Role_module;
import com.biztime.campusg.model.StudentDocument;
import com.biztime.campusg.model.StudentFee;
import com.biztime.campusg.model.Create_user;
import com.biztime.campusg.model.User_role;
import com.biztime.campusg.model.User_role_module;

import com.biztime.campusg.model.User_temp;
import com.biztime.campusg.model.User_transaction;
import com.biztime.campusg.model.Privalage_mapping;




@Repository
public class StudentDAOImpl implements StudentDAO {
	

	
	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public String get_Course_level() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT course_level_name FROM course_level";//
		Query query=session.createQuery(hql);
		String course_level=query.list().toString();
		System.out.println("query returned:  "+course_level);
		return course_level;
		
	}
	
	@Override
	public String get_quota() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT quota_name FROM Quota";//
		Query query=session.createQuery(hql);
		String quota=query.list().toString();
		System.out.println("query returned:  "+quota);
		return quota;

	}



	@Override
	public String getProgram(String s) {
		// TODO Auto-generated method stub
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT p.program_name FROM program p, course_level c WHERE c.course_level_id=p.course_level_id AND c.course_level_name=?";
		//String hql="SELECT program_name FROM program WHERE course_level_id=?";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String program=query.list().toString();
		System.out.println("query returned:  "+program);
		return program;
	}


	@Override
	public String getDepartment(String s) {
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		//String hql="SELECT d.department_name FROM department d, program p, course_level c, course_department_map_course_hierarchy m WHERE c.course_level_id=p.course_level_id AND p.program_name=? AND p.program_id=m.program_id AND m.department_id=d.department_id";
		String hql="SELECT d.department_name FROM department d, course_level c, program p, course e, course_department_map m WHERE c.course_level_id=p.course_level_id AND p.program_name=? AND p.program_id=e.program_id AND e.course_id=m.course_id AND m.department_id=d.department_id";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String department=query.list().toString();
		System.out.println("query returned:  "+department);
		return department;
		
	}


	@Override
	public String getCourse_Name(String s) {
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		//String hql="SELECT d.department_name FROM department d, program p, course_level c, course_department_map_cpf_department m WHERE c.course_level_id=p.course_level_id AND p.program_name=? AND p.program_id=m.program_id AND m.department_id=d.department_id";
		//String hql="SELECT c.course_name FROM course c, course_level l, program p, department d, course_department_map_course_hierarchy m WHERE l.course_level_id=p.course_level_id AND p.program_id=m.program_id AND m.department_id=d.department_id AND m.course_id=c.course_id AND c.course_name=?";
		String hql="SELECT e.course_name FROM course e, course_level c, program p, department d, course_department_map m WHERE " +
				"c.course_level_id=p.course_level_id AND p.program_id=e.program_id AND e.course_id=" +
				"m.course_id AND m.department_id=d.department_id AND d.department_name=?";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String course=query.list().toString();
		System.out.println("query returned:  "+course);
		return course;	
		}

	
	/*@Override
	public void saveStudent(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("Student saved successfully, Student Details="+s);
	}
*/
	



	public Integer Save_Candidate_Basic_GetId(Candidate b) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(b);
		Integer i=b.getCandidate_id();
		System.out.println("ID BEFORE SAVE:"+i);
		
		session.save(b);	
		logger.info("Candidate basic info saved successfully, Student basic Details="+b);
		return i;
	}
	
	@Override
	public void Save_Candidate_Details(Candidate c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		session.flush();
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Candidate> get_Candidate_first_adm() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Candidate";
		Query query=session.createQuery(hql);
		List<Candidate> Candidate= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Candidate;
		
	}
	
	@Override
	public void Update_Candidate(Candidate c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		session.flush();
		
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Candidate> get_Candidate_first_office() {
		// TODO Auto-generated method stub
		String A="Accept";
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Candidate WHERE admission_status=:A";
		Query query=session.createQuery(hql);
		query.setParameter("A", A);
		System.out.println("Fetched in dao impl");
		//query.setInteger(0, Integer.parseInt(A));
		List<Candidate> Candidate= query.list();
		System.out.println("returned: " +Candidate.toString() );
		return Candidate;
		
	}


	
	@Override
	public Candidate getCandidate(int c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Candidate) session.get(Candidate.class, c);
		
	}

	@Override
	public void Update_candidate_status_office(int id, String status,
			String status_rem) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Candidate b = (Candidate)session.get(Candidate.class, id);
		b.setOffice_status(status);
		b.setOffice_status_remark(status_rem);
	}
	

	
	/*@Override
	@SuppressWarnings("unchecked")
	public List<Candidate> getCandidate1(String c) {
		System.out.println("ID in dao impl c:"+c);
		String r=c.trim();
		Integer A=Integer.valueOf(r);
		System.out.println("ID in dao impl A:"+A);
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Candidate WHERE candidate_id=:A";
		Query query=session.createQuery(hql);
		query.setParameter("A", A);
		System.out.println("Fetched in dao impl");
		//query.setInteger(0, Integer.parseInt(A));
		List<Candidate> Candidate= query.list();
		System.out.println("returned: " +Candidate.toString() );
		return Candidate;
		
	}
	*/
	
	
	
	
	
/*
	@Override
	public Student getCandidatePersonal(int c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Student) session.get(Student.class, c);
		
	}


	@Override
	public void updateCandidatePeronal(Student t) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(t);
		session.flush();
		
	}

	
	@Override
	public void saveStudentStatus(StudentStatus s) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(s);
		logger.info("Student saved successfully, Student Details="+s);
		
	}
*/
	@Override
	@SuppressWarnings("unchecked")
	public List<LoginCombined> Login_Info() {
		// TODO Auto-generated method stub
		System.out.println("Inside dao for login");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT c.user_name, c.password, c.user_type, r.user_role, t.user_department " +
					"FROM Create_user c, User_role r, User_transaction t " +
					"WHERE c.user_name=r.user_name AND r.user_name=t.user_name";
		Query query=session.createQuery(hql);
		List<LoginCombined> LoginCombined=(List<LoginCombined>)query.list();	
		return LoginCombined;
	}
	

	
	
/*User create*/
	@Override
	public String get_User_type() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT user_type_name FROM User_type";//
	Query query=session.createQuery(hql);
	String User_type=query.list().toString();
	System.out.println("query returned:  "+User_type);
	return User_type;
	}

	@Override
	public String getUser(String t) {
	// TODO Auto-generated method stub
	String p=t.trim();
	System.out.println(p);
	String s="Student";
	String e="Employee";
	String pa="Parent";
	//namedb.equals(namejsp)
	
	Session session = this.sessionFactory.getCurrentSession();
	//if(p=="Student")
	if(p.equals(s))
	{
		String hql="SELECT firstname from Candidate";
		Query query=session.createQuery(hql);
		//query.setString(0, p);
		String students=query.list().toString();
		System.out.println("query returned:  "+students);
		return students;
	}
	else if(p.equals(e))
	{
		String hql="SELECT firstName from Employee";
		Query query=session.createQuery(hql);
		//query.setString(0, p);
		String Employee=query.list().toString();
		System.out.println("query returned:  "+Employee);
		return Employee;
	}
	else if(p.equals(pa))
	{
		String hql="SELECT fatherfirstname from Candidate";
		Query query=session.createQuery(hql);
		//query.setString(0, p);
		String parent=query.list().toString();
		System.out.println("query returned:  "+parent);
		return parent;
	}
	else
	{
		return null;
	}
	}
	/*
	
	
	
	if(p=="a")
	{
		String hql="SELECT u.user_name FROM User u, User_type e WHERE e.user_type_name=? AND e.user_type_Id=u.user_type_Id";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String users=query.list().toString();
		System.out.println("query returned:  "+users);
		return users;
	}
	else
	{
		String hql="SELECT u.user_name FROM User u, User_type e WHERE e.user_type_name=? AND e.user_type_Id=u.user_type_Id";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String users=query.list().toString();
		System.out.println("query returned:  "+users);
		return users;
		
	}*/
	/*
	
	String hql="SELECT u.user_name FROM User u, User_type e WHERE e.user_type_name=? AND e.user_type_Id=u.user_type_Id";
	Query query=session.createQuery(hql);
	query.setString(0, p);
	String users=query.list().toString();
	System.out.println("query returned:  "+users);*/
	//return users;

	@Override
	public String getRole(String r) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String p=r.trim();
	String hql="SELECT r.role_name FROM Role r, User_type u WHERE u.user_type_name=? AND u.user_type_Id=r.user_type_Id";
	Query query=session.createQuery(hql);
	query.setString(0, p);
	String role=query.list().toString();
	System.out.println("query returned:  "+role);
	return role;
}


	@Override
	public String get_department() {
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT DISTINCT department FROM Employee";
	Query query=session.createQuery(hql);
	String department=query.list().toString();
	System.out.println("query returned:  "+department);
	return department;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Module> get_module() {
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM Module";
	Query query=session.createQuery(hql);
	List<Module> m=query.list();
	//System.out.println("query returned:  "+module);
	return m;
	}



	@Override
	public void Create_user(Create_user u) {
	Session session = this.sessionFactory.getCurrentSession();
	session.save(u);	
	logger.info("Candidate basic info saved successfully, Student basic Details="+u);
	}

	@Override
	public void User_role(User_role u) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	session.save(u);	
	logger.info("Candidate basic info saved successfully, Student basic Details="+u);
	}

	@Override
	public void User_transaction(User_transaction u) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	session.save(u);	
	logger.info("Candidate basic info saved successfully, Student basic Details="+u);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Candidate> get_Student(String user_name) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String p=user_name.trim();
	System.out.println("User name in dao : " + p);
	String hql="FROM Candidate WHERE firstname=?";
	Query query=session.createQuery(hql);
	query.setString(0, p);
	//Candidate c=(Candidate) query;
	List<Candidate> c=(List<Candidate>) query.list();
	return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> get_Employee(String user_name) {
	// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String p=user_name.trim();
		System.out.println("User name in dao : " + p);
		String hql="FROM Employee WHERE firstName=?";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		//Candidate c=(Candidate) query;
		List<Employee> c=(List<Employee>) query.list();
		return c;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Candidate> get_Parent(String user_name) {
	
		Session session = this.sessionFactory.getCurrentSession();
		String p=user_name.trim();
		System.out.println("User name in dao : " + p);
		String hql="FROM Candidate WHERE fatherfirstname=?";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		//Candidate c=(Candidate) query;
		List<Candidate> c=(List<Candidate>) query.list();
		return c;
	}

	@Override
	public String get_User() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT firstName FROM Employee";
		Query query=session.createQuery(hql);
		String employee=query.list().toString();
		System.out.println("query returned:  "+employee);
		return employee;
	}

	@Override
	public String get_Role() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT role_name FROM Role";//
		Query query=session.createQuery(hql);
		String Role=query.list().toString();
		System.out.println("query returned:  "+Role);
		return Role;
	}

	@Override
	public String get_privilage() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT privilages_name FROM Privilages";//
		Query query=session.createQuery(hql);
		String Privilage=query.list().toString();
		System.out.println("query returned:  "+Privilage);
		return Privilage;	}

	@Override
	public String get_Module() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT moduleName FROM Module";//
		Query query=session.createQuery(hql);
		String Module=query.list().toString();
		System.out.println("query returned:  "+Module);
		return Module;
	}

	@Override
	public void Privalage_mapping(Privalage_mapping p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);	
		logger.info("Candidate basic info saved successfully, Student basic Details="+p);
		
		
	}

	@Override
	public void Save_Role_module(Role_module p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);
		logger.info("Student saved successfully, Student Details="+p);
		
	}

	@Override
	public String getUser_f(String s) {
		String p=s.trim();
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT firstName FROM Employee WHERE department=?";
		//String hql="SELECT e.firstName FROM Employee e, Create_user c WHERE e.firstName=c.user_name AND e.department=?";
		Query query=session.createQuery(hql);
		query.setString(0, p);
		String user=query.list().toString();
		System.out.println("query returned:  "+user);
		return user;
	}

	@Override
	public void Save_User_role_module(User_role_module p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);
		//String hql="INSERT INTO Create_user(privilege) values('"+priv+"') WHERE user_name='"+name+"'";
		
		//String hql1="INSERT INTO User_role_module(user_name,role_name,privilege) " +
		//		"('"+p.getUser_name().trim()+"','"+p.getRole_name().trim()+"','"+p.getPrivilege().trim()+"')";
		
		//String hql1="INSERT INTO User_role_module('"+p.getUser_name().trim()+"','"+p.getRole_name().trim()+"','"+p.getPrivilege().trim()+"')";
		
		/*Query query1 = session.createQuery(hql1);
		int result1 = query1.executeUpdate();
		System.out.println("Rows affected: " + result1);*/
		
		//logger.info("Student saved successfully, Student Details="+p);
		
		String hql=("UPDATE Create_user set privilege ='"+p.getPrivilege()+"' WHERE user_name='"+p.getUser_name()+"'");
		//String hql="INSERT INTO Create_user(privilege) values('"+priv+"') WHERE user_name='"+name+"'";
		Query query = session.createQuery(hql);
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		//session.close();
		
		
		
	}

	@Override
	public String get_user_create() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT firstName FROM Employee";
		Query query=session.createQuery(hql);
		String Employee=query.list().toString();
		System.out.println("query returned:  "+Employee);
		return Employee;
	}
	
	public String getModule(String roleName) {
		//String role=roleName.trim();
		System.out.println("in DAO IMPL, value got: "+roleName);
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT privilege FROM Role_module WHERE role_name=:roleName";
		Query query=session.createQuery(hql);
		query.setParameter("roleName", roleName);
		String module=query.list().toString();
		System.out.println("module query returned:  "+module);
		return module;
	}

	@Override
	public List<Create_user> Login_Info_priv() {
		System.out.println("Inside dao for login");
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Create_user";
		
		/*String hql="SELECT c.user_name, c.password, c.user_type, r.user_role, t.user_department " +
					"FROM Create_user c, User_role r, User_transaction t " +
					"WHERE c.user_name=r.user_name AND r.user_name=t.user_name";*/
		Query query=session.createQuery(hql);
		List<Create_user> Create_user=(List<Create_user>)query.list();	
		return Create_user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Privilege> get_privilege() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Privilege";
		Query query=session.createQuery(hql);
		List<Privilege> m=query.list();
		//System.out.println("query returned:  "+module);
		return m;
	}


	
//************************************ACCOUNT START*******************************************************************
  /**
    * @Module     Account Department
	* @Purpose    Maintain Account Details
	*
	*/
	
	
@Override
@SuppressWarnings("unchecked")
public  Integer getStudentAmount(String category, String department, String quota)
 {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT m.amount FROM MasterFee m,Category c,department d,Quota q WHERE c.category_name='"+category+"' AND c.category_id=m.category_id AND d.department_name='"+department+"' AND d.department_id=m.department_id AND q.name='"+quota+"' AND q.quota_id=m.quota_id";
	System.out.println("hql="+hql);
	
	Query query=session.createQuery(hql);
    Integer amount=((Integer) query.uniqueResult()).intValue();
		
    System.out.println("amount="+amount);
    return amount;
		
 }	


@Override
public void saveStudentFee(FeeCommand command) 
 {
		// TODO Auto-generated method stub
     String pn=command.getStudentFee().getPaymentName().trim();
	 String fn=command.getStudentFee().getFeeName().trim();
	 String rn=command.getStudentFee().getReceiptName().trim();
     int sid=command.getCandidate().getCandidate_id();
		
     String[] temp = fn.split(",");
     for (int i = 0; i < temp.length; i++)
    {
     
	  Session session = this.sessionFactory.getCurrentSession();
		
	  String hql = "INSERT INTO StudentFee(mode_of_payment_id,receipt_book_id,fee_type_id,candidate_id) SELECT m.mode_of_payment_id, r.receipt_book_id, f.fee_type_id, c.candidate_id FROM ModeOfPayment m, ReceiptBook r, FeeType f, Candidate c WHERE m.paymentName='"+pn+"' AND f.feeName='"+temp[i]+"' AND r.receiptName='"+rn+"'  AND c.candidate_id='"+sid+"'";
         
      Query query = session.createQuery(hql);
	  int result = query.executeUpdate();
	  
	  System.out.println("Rows affected: " + result);
	  
    }
 }

@Override
public void saveStudentFeeDateAmount(FeeCommand command)
 {
	// TODO Auto-generated method stub
	int sid=command.getCandidate().getCandidate_id();
	
	Session session = this.sessionFactory.getCurrentSession();
	String hql=("UPDATE StudentFee set date ='"+command.getStudentFee().getDate()+"'," +
			    "amount='"+command.getStudentFee().getAmount()+"'," +
				 "accountNumber='"+command.getStudentFee().getAccountNumber()+"'," +
				 "bankName='"+command.getStudentFee().getBankName()+"'," +
				 "chequeStatus='"+command.getStudentFee().getChequeStatus()+"'," +
				 "chequeNo='"+command.getStudentFee().getChequeNo()+"'," +
				 "ddIssueDate='"+command.getStudentFee().getDdIssueDate()+"'," +
				 "ddBank='"+command.getStudentFee().getDdBank()+"'," +
				 "ddNumber='"+command.getStudentFee().getDdNumber()+"' ," +
				 "paymentName='"+command.getStudentFee().getPaymentName()+"'," +
				 "receiptName='"+command.getStudentFee().getReceiptName()+"'," +
				 "feeName='"+command.getStudentFee().getFeeName()+"' WHERE candidate_id = "+sid);

    Query query = session.createQuery(hql);
    int result = query.executeUpdate();
  
    System.out.println("Rows affected: " + result);

 }




/**
 * @Module     Account Department
 * @Purpose    Maintain and verify document details
 *
 */

@Override
@SuppressWarnings("unchecked")
public List<StudentDocument> getStudentDocument() 
 {
	// TODO Auto-generated method stub
	
   Session session = this.sessionFactory.getCurrentSession();
   List<StudentDocument> student = session.createQuery("FROM StudentDocument").list();
	
   System.out.println("Inside Dao document");
   return student;

 }

@Override
public Candidate getCandidateAccount(int c) 
 {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	return (Candidate) session.get(Candidate.class, c);
	
 }

public StudentFee getStudentFeePdf(int id) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	return (StudentFee) session.get(StudentFee.class, id);
}

@Override
public void saveStudentDocument(FeeCommand command)
 {
		// TODO Auto-generated method stub
     int sid=command.getCandidate().getCandidate_id();
     
     String doc=command.getStudentFee().getDocumentName();
     
     System.out.println("doc"+doc);
    
      Session session = this.sessionFactory.getCurrentSession();
	 String hql=("UPDATE StudentFee set documentName ='"+doc+"' WHERE candidate_id = "+sid);

     Query query = session.createQuery(hql);
	 int result = query.executeUpdate();
	 System.out.println("Rows affected: " + result);
    
     

 }


@SuppressWarnings("unchecked")
public List<StudentFee> getStudentFee(int candidate_id) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	   List<StudentFee> student = session.createQuery("FROM StudentFee WHERE candidate_id='"+candidate_id+"'").list();
		
	   System.out.println("Inside Dao document");
	   return student;
}

//**********************Dropdown values from database******************************************************	
	
@Override
public String getReceiptBook()
 {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT receiptName FROM ReceiptBook";
	
	Query query=session.createQuery(hql);
	String receipt=query.list().toString();
	
	System.out.println("query returned:  "+receipt);
	return receipt;
 }
	
@Override
public String getModePayment() 
 {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT paymentName FROM ModeOfPayment";
		
	Query query=session.createQuery(hql);
	String payment=query.list().toString();
		
	System.out.println("query returned:  "+payment);
	return payment;
	
 }

@SuppressWarnings("unchecked")
public List<FeeType> getfeeType() 
 {
		// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	List<FeeType> feetype = session.createQuery("FROM FeeType ").list();
	System.out.println("Inside Dao Feetype");
	return feetype;
 }



public String getFeeType(String s) {
	// TODO Auto-generated method stub
	String p=s.trim();
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT f.feeName FROM FeeType f WHERE f.receiptName=?";
	
	Query query=session.createQuery(hql);
	query.setString(0, p);
	String feetype=query.list().toString();
	System.out.println("query returned:  "+feetype);
	return feetype;
}




public List<FeeType> getFeeTypeList(String s) {
	// TODO Auto-generated method stub
	String p=s.trim();
	System.out.println("received from controller: "+p);
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM FeeType f WHERE f.receiptName=:p";
	
	Query query=session.createQuery(hql);
	query.setString("p", p);
	@SuppressWarnings("unchecked")
	List<FeeType> feeTypeList=(List<FeeType>)query.list();
	/*System.out.println("in DAO Layer: "+feeTypeList.toString());*/
	return feeTypeList;
}


@SuppressWarnings("unchecked")
public List<Candidate> get_Candidate_first() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM Candidate";
	Query query=session.createQuery(hql);
	List<Candidate> Candidate= query.list();	
	//List<Student> student= session.createCriteria(Student.class).list();
	return Candidate;
	
}






//************************************************ACCOUNT END**************************************************************
		
}
