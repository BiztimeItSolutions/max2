package com.biztime.campusg.dao;



import java.util.List;

import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.Employee;
import com.biztime.campusg.model.FeeCommand;
import com.biztime.campusg.model.LoginCombined;
import com.biztime.campusg.model.Module;
import com.biztime.campusg.model.Role_module;
import com.biztime.campusg.model.StudentDocument;

import com.biztime.campusg.model.Create_user;
import com.biztime.campusg.model.User_role;
import com.biztime.campusg.model.User_role_module;

import com.biztime.campusg.model.User_temp;
import com.biztime.campusg.model.User_transaction;
import com.biztime.campusg.model.Privalage_mapping;

import com.biztime.campusg.model.FeeType;

import com.biztime.campusg.model.StudentFee;




public interface StudentDAO {


	public Integer Save_Candidate_Basic_GetId(Candidate b);
	
	//public List<Quota> get_quota();
	
	public String get_Course_level();
	public String getProgram(String s);
	public String getDepartment(String s);
	public String getCourse_Name(String s);
	public String get_quota();
	
	public void Save_Candidate_Details(Candidate c);
	
	public List<Candidate> get_Candidate_first_adm();
	
	public List<Candidate> get_Candidate_first_office();
	
	public Candidate getCandidate(int c);
	public void Update_Candidate(Candidate c);
	public void Update_candidate_status_office(int id,String status, String status_rem);
	
	
	//List<Candidate> getCandidate1(String c);
	
	//public Student getCandidatePersonal(int c);//Student personal
	
	//public void updateCandidatePeronal(Student t);

	//public void saveStudentStatus(StudentStatus s);
	
	public List <LoginCombined> Login_Info(); //login
	
	
	/*User Create*/
	
	public String get_User_type();
	public String getUser(String s);
	public String getRole(String r);
	//public String getCourse_Name(String s);
	
	public String get_department();
	public List<Module> get_module();
	public void Create_user(Create_user u);
	public void User_role(User_role u);
	public void User_transaction(User_transaction u);
	
	
	public List<Candidate> get_Student(String user_name);
	public List<Employee> get_Employee(String user_name);
	public List<Candidate> get_Parent(String user_name);
	//get_Employee
	
	public String get_User(); //Employee
	//department -- get_department
	public String get_Role(); //role 
	public String get_Module();
	public String get_privilage();//privilage
	public void Privalage_mapping(Privalage_mapping p);
	
	//
	public void Save_Role_module(Role_module p);
	
	public String getUser_f(String s);
	
	
	public void Save_User_role_module(User_role_module p);
	
	public String get_user_create();
	
	public String getModule(String roleName);
	
	public List <Create_user> Login_Info_priv(); //login
	


//************************************ACCOUNT START*******************************************************************
	/**
	  * @Module     Account Department
	  * @Purpose    Maintain Account Details
	  *
	  */
	
public Integer getStudentAmount(String category, String department, String quota);

public List<FeeType> getFeeTypeList(String s);

public void saveStudentFee(FeeCommand command);

public void saveStudentFeeDateAmount(FeeCommand command);



/**
 * @Module     Account Department
 * @Purpose    Maintain and verify document details
 *
 */

public List<StudentDocument> getStudentDocument();

public Candidate getCandidateAccount(int c);

public void saveStudentDocument(FeeCommand command);


//**********************Dropdown values from database******************************************************

public String getModePayment();

public String getReceiptBook();




//************************************************ACCOUNT END**************************************************************

	

}
