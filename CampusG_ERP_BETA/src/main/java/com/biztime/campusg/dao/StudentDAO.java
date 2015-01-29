package com.biztime.campusg.dao;

import java.util.List;

import com.biztime.campusg.model.Student;
import com.biztime.campusg.model.StudentContact;
import com.biztime.campusg.model.StudentEducation;
import com.biztime.campusg.model.StudentParent;

public interface StudentDAO {

	public void saveStudent(Student p);
	
	public void saveStudentContact(StudentContact s);
	
	public void saveStudentParent(StudentParent s);
	
	public void saveStudentEducation(StudentEducation s);
	
	public List<Student> getStudentPersonal();
	
}
