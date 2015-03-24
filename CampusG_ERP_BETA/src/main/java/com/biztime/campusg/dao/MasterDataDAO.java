package com.biztime.campusg.dao;

import java.util.List;

import com.biztime.campusg.model.AcademicYearmodel;

import com.biztime.campusg.model.ApplicantStatusmodel;
import com.biztime.campusg.model.BloodGroupmodel;
import com.biztime.campusg.model.Categorymodel;
import com.biztime.campusg.model.CollegeDetail;
import com.biztime.campusg.model.Paymentmodemodel;
import com.biztime.campusg.model.Programmodel;

public interface MasterDataDAO {

public int saveCollegedetail(CollegeDetail m);

List<CollegeDetail> get_College_detail();

int saveStatusDetail(ApplicantStatusmodel status);

int savePaymentDetail(Paymentmodemodel payment);

void savebloodgroupDetail(BloodGroupmodel blood);

int saveProgramDetail(Programmodel program);

String getCollegeIdlist();



int saveacademicDetail(AcademicYearmodel academic);

String getCoursecodetype(String s);



}
