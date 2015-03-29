package com.biztime.campusg.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.biztime.campusg.model.ApplicantStatusmodel;
import com.biztime.campusg.model.BloodGroupmodel;
import com.biztime.campusg.model.Categorymodel;
import com.biztime.campusg.model.CollegeDetail;
import com.biztime.campusg.model.CourseLevelmodel;
import com.biztime.campusg.model.Coursemodel;
import com.biztime.campusg.model.Departmentmodel;
import com.biztime.campusg.model.Documentmodel;

import com.biztime.campusg.model.AcademicYearmodel;
import com.biztime.campusg.model.Batchmodel;
import com.biztime.campusg.model.Gradingmodel;
import com.biztime.campusg.model.LeaveTypemodel;
import com.biztime.campusg.model.Mapmodel;
import com.biztime.campusg.model.Modulemodel;
import com.biztime.campusg.model.Optionalmodel;
import com.biztime.campusg.model.Paymentmodemodel;
import com.biztime.campusg.model.Permissionmodel;
import com.biztime.campusg.model.Programmodel;
import com.biztime.campusg.model.Receiptmodel;
import com.biztime.campusg.model.Rolemodel;
import com.biztime.campusg.model.Subjectmodel;
import com.biztime.campusg.model.Usertypemodel;


@Repository
public class MasterDataDAOImpl implements MasterDataDAO{


	private static final Logger logger = LoggerFactory.getLogger(MasterDataDAOImpl.class);
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	

@Override
	public int saveCollegedetail(CollegeDetail m) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returncollege=(Integer) session.save(m);
		
		return returncollege;
		
	}
	 
	
	@Override
	
	
	public List<CollegeDetail> get_College_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql=" FROM CollegeDetail";
		Query query=session.createQuery(hql);
		List<CollegeDetail> CollegeDetail= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return CollegeDetail;
		
	}

	

	public CollegeDetail get_College_detailedit(int c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (CollegeDetail) session.get(CollegeDetail.class, c);
	}

	public void Update_College_view(CollegeDetail c) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(c);
		session.flush();
		
	}

	public void Delete_College_view(CollegeDetail c) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(c);
		session.flush();
	}

	@SuppressWarnings("unchecked")
	public Object get_College_detail_complete(int collegeId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM CollegeDetail";
		Query query=session.createQuery(hql);
		List<CollegeDetail> CollegeDetail= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return CollegeDetail;
	}

	public int saveCategoryDetail(Categorymodel category) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returncategory=(Integer) session.save(category);
		logger.info("Student saved successfully, college Details="+category);
		return returncategory;
		
	}

	@SuppressWarnings("unchecked")
	public Object get_Category_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Categorymodel";
		Query query=session.createQuery(hql);
		List<Categorymodel> Categorymodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Categorymodel;
	}

	public Object get_Category_detailedit(int categoryId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Categorymodel) session.get(Categorymodel.class, categoryId);
	}

	public void Update_Category_view(Categorymodel category) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(category);
		session.flush();
	}

	public void Delete_Category_view(Categorymodel category) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(category);
		session.flush();
		
	}
	
	public Object get_Category_detail_complete(int categoryId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Categorymodel";
		Query query=session.createQuery(hql);
		List<Categorymodel> Categorymodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Categorymodel;
	}

	
	

	public Object get_Payment_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Paymentmodemodel";
		Query query=session.createQuery(hql);
		List<Paymentmodemodel> Paymentmodemodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Paymentmodemodel;
	}

	public Object get_Paymentmode_detailedit(int paymentmodeId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Paymentmodemodel) session.get(Paymentmodemodel.class, paymentmodeId);
	}

	public void Update_Paymentmode_view(Paymentmodemodel payment) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(payment);
		session.flush();
		
	}

	@Override
	public int savePaymentDetail(Paymentmodemodel payment) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnpay=(Integer) session.save(payment);
		logger.info("Student saved successfully, college Details="+payment);
		return returnpay;
		
	}

	@Override
	public int saveStatusDetail(ApplicantStatusmodel status) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returnstatus=(Integer) session.save(status);
		logger.info("Student saved successfully, college Details="+status);
		return returnstatus;
		
	}

	public Object get_Status_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM ApplicantStatusmodel";
		Query query=session.createQuery(hql);
		List<ApplicantStatusmodel> ApplicantStatusmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return ApplicantStatusmodel;
	}

	public Object get_Status_detailedit(int statusId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (ApplicantStatusmodel) session.get(ApplicantStatusmodel.class, statusId);
	}

	public void Update_Status_view(ApplicantStatusmodel status) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(status);
		session.flush();
		
	}

	public void Delete_Status_view(ApplicantStatusmodel status) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(status);
		session.flush();
		
	}

	@Override
	
	public void savebloodgroupDetail(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(blood);
		logger.info("Student saved successfully, college Details="+blood);
		
	}

	public Object get_Blood_Group_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM BloodGroupmodel";
		Query query=session.createQuery(hql);
		List<BloodGroupmodel> BloodGroupmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return BloodGroupmodel;
	}

	public Object get_Blood_Group_detailedit(int groupId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (BloodGroupmodel) session.get(BloodGroupmodel.class, groupId);
	}

	public void Update_Blood_Group_view(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(blood);
		session.flush();
		
	}

	public void Delete_Blood_Group_view(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(blood);
		session.flush();
		
	}

	
	@Override
	public int saveProgramDetail(Programmodel program) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnprogram=(Integer) session.save(program);
		logger.info("Student saved successfully, college Details="+program);
		return returnprogram;
		
	}

	public Object get_Program_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Programmodel";
		Query query=session.createQuery(hql);
		List<Programmodel> Programmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Programmodel;
	}

	public Object get_Program_detailedit(int programId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Programmodel) session.get(Programmodel.class, programId);
	}

	public void Update_Program_view(Programmodel program) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(program);
		session.flush();
		
	}

	public void Delete_Program_view(Programmodel program) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(program);
		session.flush();
		
	}

	public Object get_Course_detail() {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Coursemodel";
		Query query=session.createQuery(hql);
		List<Coursemodel> Coursemodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Coursemodel;
		
	}

	public int saveCourseDetails(Coursemodel course) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				Session session = this.sessionFactory.getCurrentSession();
				/*String name=course.getProgramNamefk();
				String hql="INSERT INTO Coursemodel(programId) SELECT p.programId FROM Programmodel p WHERE p.programName='"+name+"'";
				Query query=session.createQuery(hql);
				int result=query.executeUpdate();*/
				int returncourse=(Integer) session.save(course);
				logger.info("Student saved successfully, college Details="+course);
				return returncourse;		
	}
	
	

/*public void saveCourseOtherDetails(Coursemodel course) {
	// TODO Auto-generated method stub
	
}*/

	public Object get_Course_detailedit(int courseId) {
		
			// TODO Auto-generated method stub
			Session session = this.sessionFactory.getCurrentSession();
			return (Coursemodel) session.get(Coursemodel.class, courseId);
		}

	public void Update_Course_view(Coursemodel course) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(course);
		session.flush();
		
	}

	public void Delete_Course_view(Coursemodel course) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(course);
		session.flush();
		
	}

	public int saveCourselevelDetail(CourseLevelmodel courselevel) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returncourselevel=(Integer) session.save(courselevel);
		logger.info("Student saved successfully, college Details="+courselevel);
		return returncourselevel;
	}

	public Object get_Courselevel_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM CourseLevelmodel";
		Query query=session.createQuery(hql);
		List<Programmodel> CourseLevelmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return CourseLevelmodel;
	}

	public Object get_Courselevel_detailedit(int courselevelId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (CourseLevelmodel) session.get(CourseLevelmodel.class, courselevelId);
	}

	public void Update_Courselevel_view(CourseLevelmodel courselevel) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(courselevel);
		session.flush();
	}

	public void Delete_Courselevel_view(CourseLevelmodel courselevel) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(courselevel);
		session.flush();
		
	}

	public int savePermissionDetail(Permissionmodel permission) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returnpermission=(Integer) session.save(permission);
		logger.info("Student saved successfully, college Details="+permission);
		return returnpermission;
		
	}

	
	public int savedepartmentDetail(Departmentmodel department) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returndepartment=(Integer) session.save(department);
		logger.info("Student saved successfully, college Details="+department);
		return returndepartment;
		
	}

	public Object get_Permission_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Permissionmodel";
		Query query=session.createQuery(hql);
		List<Permissionmodel> Permissionmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Permissionmodel;
	}

	public Object get_Department_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Departmentmodel";
		Query query=session.createQuery(hql);
		List<Departmentmodel> Departmentmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Departmentmodel;
	}

	public Object get_Department_detailedit(int departmentId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Departmentmodel) session.get(Departmentmodel.class, departmentId);
	}

	public Object get_Permission_detailedit(int permissionId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Permissionmodel) session.get(Permissionmodel.class, permissionId);
	}

	public void Update_Permission_view(Permissionmodel permission) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(permission);
		session.flush();
		
	}

	public void Update_Department_view(Departmentmodel department) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(department);
		session.flush();
		
	}

	public void Delete_Department_view(Departmentmodel department) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(department);
		session.flush();
		
	}

	public void Delete_Permission_view(Permissionmodel permission) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(permission);
		session.flush();
		
	}

	public int savereceiptDetail(Receiptmodel receipt) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnreceipt=(Integer) session.save(receipt);
		logger.info("Student saved successfully, college Details="+receipt);
		return returnreceipt;
		
	}

	public int saveOptionalDetail(Optionalmodel optional) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnoptional=(Integer) session.save(optional);
		logger.info("Student saved successfully, college Details="+optional);
		return returnoptional;
		
	}

	public Object get_Optional_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Optionalmodel";
		Query query=session.createQuery(hql);
		List<Optionalmodel> Optionalmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Optionalmodel;
	}

	public Object get_Receipt_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Receiptmodel";
		Query query=session.createQuery(hql);
		List<Receiptmodel> Receiptmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Receiptmodel;
	}

	public Object get_Receipt_detailedit(int receiptId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Receiptmodel) session.get(Receiptmodel.class, receiptId);
	}

	public Object get_Optional_detailedit(int optionalId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Optionalmodel) session.get(Optionalmodel.class, optionalId);
	}

	

	public void Delete_Receipt_view(Receiptmodel receipt) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(receipt);
		session.flush();
	}

	public void Delete_Optional_view(Optionalmodel optional) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(optional);
		session.flush();
	}

	public void Update_Receipt_view(Receiptmodel receipt) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(receipt);
		session.flush();
		
	}

	public void Update_Optional_view(Optionalmodel optional) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(optional);
		session.flush();
		
	}

	public int saveroleDetail(Rolemodel role) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnrole=(Integer) session.save(role);
		logger.info("Student saved successfully, college Details="+role);
		return returnrole;
		
	}

	public Object get_Role_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Rolemodel";
		Query query=session.createQuery(hql);
		List<Rolemodel> Rolemodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Rolemodel;
	}

	public Object get_Role_detailedit(int roleId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Rolemodel) session.get(Rolemodel.class, roleId);
	}

	public void Update_Role_view(Rolemodel role) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(role);
		session.flush();

		
	}

	public void Delete_Role_view(Rolemodel role) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(role);
		session.flush();
		
	}

	public int savedocumentDetail(Documentmodel document) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returndocument=(Integer) session.save(document);
		logger.info("Student saved successfully, college Details="+document);
		return returndocument;
		
	}

	public Object get_Document_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Documentmodel";
		Query query=session.createQuery(hql);
		List<Documentmodel> Documentmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Documentmodel;
	}

	public Object get_Document_detailedit(int documentId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Documentmodel) session.get(Documentmodel.class, documentId);
	}

	public void Update_Document_view(Documentmodel document) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(document);
		session.flush();
		
	}

	public void Delete_Document_view(Documentmodel document) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(document);
		session.flush();
		
	}

	public int savesubjectDetail(Subjectmodel subject) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnsubject=(Integer) session.save(subject);
		logger.info("Student saved successfully, college Details="+subject);
		return returnsubject;
		
	}

	public Object get_Subject_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Subjectmodel";
		Query query=session.createQuery(hql);
		List<Subjectmodel> Subjectmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Subjectmodel;
	}

	public Object get_Subject_detailedit(int subjectId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Subjectmodel) session.get(Subjectmodel.class, subjectId);
	}

	public void Update_Subject_view(Subjectmodel subject) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(subject);
		session.flush();
		
	}

	public void Delete_Subject_view(Subjectmodel subject) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(subject);
		session.flush();
		
	}

	
	public Object get_Usertype_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Usertypemodel";
		Query query=session.createQuery(hql);
		List<Usertypemodel> Usertypemodel= query.list();	
		
		return Usertypemodel;
	}

	public Object get_Usertype_detailedit(int usertypeId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Usertypemodel) session.get(Usertypemodel.class, usertypeId);
	}

	public void Update_Usertype_view(Usertypemodel usertype) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(usertype);
		session.flush();
		
	}

	public void Delete_Usertype_view(Usertypemodel usertype) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(usertype);
		session.flush();
		
	}

	public int saveusertypeDetail(Usertypemodel usertype) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnuser=(Integer) session.save(usertype);
		logger.info("Student saved successfully, college Details="+usertype);
		return returnuser;
		
	}
	
	public int savebatchDetail(Batchmodel batch) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returnuser=(Integer) session.save(batch);
		logger.info("Student saved successfully, college Details="+batch);
		return returnuser;
	}



	public int savebloodDetail(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		int returnblood=(Integer) session.save(blood);
		logger.info("Student saved successfully, college Details="+blood);
		return returnblood;
	}

	public Object get_Blood_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM BloodGroupmodel";
		Query query=session.createQuery(hql);
		List<BloodGroupmodel> BloodGroupmodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return BloodGroupmodel;
	}

	public Object get_Bloodgroup_detailedit(int groupId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (BloodGroupmodel) session.get(BloodGroupmodel.class, groupId);
	}

	public void Update_Bloodgroup_view(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(blood);
		session.flush();
		
	}

	public void Delete_Bloodgroup_view(BloodGroupmodel blood) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(blood);
		session.flush();
		
	}

	
	public int savemoduleDetail(Modulemodel module) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnmodule=(Integer) session.save(module);
		logger.info("Student saved successfully, college Details="+module);
		return returnmodule;
		
	}


	public Object get_module_detail() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM Modulemodel";
		Query query=session.createQuery(hql);
		List<Modulemodel> Modulemodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return Modulemodel;
	}


	public Object get_Module_detailedit(int moduleId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return (Modulemodel) session.get(Modulemodel.class, moduleId);
	}


	public void Update_Module_view(Modulemodel module) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.update(module);
		session.flush();
		
	}


	public void Delete_Module_view(Modulemodel module) {
		// TODO Auto-generated method stub

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(module);
		session.flush();
	}
	
	public void Delete_Payment_view(Paymentmodemodel payment) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(payment);
		session.flush();
		
	}
	
	
	public void savegradingDetail(Gradingmodel grading) {
		// TODO Auto-generated method stub
		 Session session = this.sessionFactory.getCurrentSession();
			 session.save(grading);
			logger.info("Student saved successfully, college Details="+grading);
			
	}




   public int saveLeaveDetail(LeaveTypemodel leave) {
	// TODO Auto-generated method stub
	   
	   Session session = this.sessionFactory.getCurrentSession();
		int returnleave=(Integer) session.save(leave);
		logger.info("Student saved successfully, college Details="+leave);
		return returnleave;
	
    }
   
   
   
   public Object get_Leave_detail() {
		// TODO Auto-generated method stub
	   Session session = this.sessionFactory.getCurrentSession();
		String hql="FROM LeaveTypemodel";
		Query query=session.createQuery(hql);
		List<LeaveTypemodel> LeaveTypemodel= query.list();	
		//List<Student> student= session.createCriteria(Student.class).list();
		return LeaveTypemodel;
	}


   public Object get_Leave_detailedit(int leaveTypeId) {
		// TODO Auto-generated method stub
	   Session session = this.sessionFactory.getCurrentSession();
		return (LeaveTypemodel) session.get(LeaveTypemodel.class, leaveTypeId);
	}

   
   
   public void Update_Leave_view(LeaveTypemodel leave) {
		// TODO Auto-generated method stub
	   
	   Session session = this.sessionFactory.getCurrentSession();
		session.update(leave);
		session.flush();
		
	}


	public void Delete_Leave_view(LeaveTypemodel leave) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(leave);
		session.flush();
		
	}

   @Override
	public int saveacademicDetail(AcademicYearmodel academic) {
		// TODO Auto-generated method stub
		
		
		Session session = this.sessionFactory.getCurrentSession();
		int returnstatement=(Integer) session.save(academic);
		System.out.println("returning: "+returnstatement);
		logger.info("Student saved successfully, college Details="+academic);
		return returnstatement;
		
	}




public Object get_academic_detail() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM AcademicYearmodel";
	Query query=session.createQuery(hql);
	List<AcademicYearmodel> AcademicYearmodel= query.list();	
	//List<Student> student= session.createCriteria(Student.class).list();
	return AcademicYearmodel;
}


public Object get_Academic_detailedit(int academicyearId) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	return (AcademicYearmodel) session.get(AcademicYearmodel.class, academicyearId);
}


public void Update_Academic_view(AcademicYearmodel academic) {
	// TODO Auto-generated method stub
	
	Session session = this.sessionFactory.getCurrentSession();
	session.update(academic);
	session.flush();
	
}


public void Delete_Academic_view(AcademicYearmodel academic) {
	// TODO Auto-generated method stub
	
	
	Session session = this.sessionFactory.getCurrentSession();
	session.delete(academic);
	session.flush();
	
}



public Object get_Batch_detail() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM Batchmodel";
	Query query=session.createQuery(hql);
	List<Batchmodel> Batchmodel= query.list();	
	//List<Student> student= session.createCriteria(Student.class).list();
	return Batchmodel;
}


public Object get_Batch_detailedit(int batchId) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	return (Batchmodel) session.get(Batchmodel.class, batchId);
}



public void Update_Batch_view(Batchmodel batch) {
	// TODO Auto-generated method stub
	
	Session session = this.sessionFactory.getCurrentSession();
	session.update(batch);
	session.flush();
	
	
}

public void Delete_Batch_view(Batchmodel batch) {
	// TODO Auto-generated method stub
	
	Session session = this.sessionFactory.getCurrentSession();
	session.delete(batch);
	session.flush();
	
}

	
public int savemapDetail(Mapmodel map) {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	int returnstatement=(Integer) session.save(map);
	System.out.println("returning: "+returnstatement);
	logger.info("Student saved successfully, college Details="+map);
	return returnstatement;
}

public Object get_map_detail() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="FROM Mapmodel";
	Query query=session.createQuery(hql);
	List<Mapmodel> Mapmodel= query.list();	
	//List<Student> student= session.createCriteria(Student.class).list();
	return Mapmodel;
}

  		


	
	
	/******************************************************Dropdown***********************************************************************************/
	
	@Override
	public String getCollegeIdlist() {
		
		
			// TODO Auto-generated method stub
			Session session = this.sessionFactory.getCurrentSession();
			String hql="SELECT collegeName FROM CollegeDetail";
			
			Query query=session.createQuery(hql);
			String collegeIdlist=query.list().toString();
			
			System.out.println("query returned college list:  "+collegeIdlist);
			return collegeIdlist;
		 
	}



public String getCourselevelnamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT courselevelName FROM CourseLevelmodel";
	
	Query query=session.createQuery(hql);
	String courselevelnamelist=query.list().toString();
	
	System.out.println("query returned course level list:  "+courselevelnamelist);
	return courselevelnamelist;
}




public String getProgramnamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT programName FROM Programmodel";
	
	Query query=session.createQuery(hql);
	String programnamelist=query.list().toString();
	
	System.out.println("query returned program list:  "+programnamelist);
	return programnamelist;
}


public String getModulelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT moduleName FROM Modulemodel";
	
	Query query=session.createQuery(hql);
	String modulenamelist=query.list().toString();
	
	System.out.println("query returned module list:  "+modulenamelist);
	return modulenamelist;
}





public String getCoursecodelist() {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String hql="SELECT courseCodefk FROM Batchmodel";
		
		Query query=session.createQuery(hql);
		String coursecodelist=query.list().toString();
		
		System.out.println("query returned coursecode list:  "+coursecodelist);
		return coursecodelist;
}

@Override
public String getCoursecodetype(String s) {
	// TODO Auto-generated method stub
	
	Session session = this.sessionFactory.getCurrentSession();
	String p=s.trim();
	System.out.println("p="+p);
	String hql="SELECT b.batchName FROM Batchmodel b WHERE b.courseCodefk=p";/**/
	Query query=session.createQuery(hql);
	query.setString(0, p);
	String batchname=query.list().toString();
	System.out.println("query batchname:"+batchname);
	return batchname;
}


public String getBatchNamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
	String hql="SELECT batchName FROM Batchmodel";
	
	Query query=session.createQuery(hql);
	String batchnamelist=query.list().toString();
	
	System.out.println("query returned batchidlist:  "+batchnamelist);
	return batchnamelist;
}


public String getSubjectNamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
    String hql="SELECT subjectName FROM Subjectmodel";
	
	Query query=session.createQuery(hql);
	String subjectnamelist=query.list().toString();
	
	System.out.println("query returned subjectid list:  "+subjectnamelist);
	return subjectnamelist;
}


public String getEmployeeNamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
    String hql="SELECT firstName FROM Employeemodel";
	
	Query query=session.createQuery(hql);
	String employeenamelist=query.list().toString();
	
	System.out.println("query returned employee list:  "+employeenamelist);
	return employeenamelist;

}






/*public String getStudentNamelist() {
	// TODO Auto-generated method stub
	Session session = this.sessionFactory.getCurrentSession();
    String hql="SELECT studentId FROM Studentmodel";
	
	Query query=session.createQuery(hql);
	String studentnamelist=query.list().toString();
	
	System.out.println("query returned subjectid list:  "+studentnamelist);
	return studentnamelist;
}
*/








	}

	
		
	

	
	
		

