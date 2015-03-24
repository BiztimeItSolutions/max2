package com.biztime.campusg.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity  
@Table(name="candidate_previous_educational_details") 
public class StudentEducation implements Serializable{
	

	private static final long serialVersionUID = -723583058586873479L;


	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "candidate_previous_educational_details_id")  
	private Integer candidatepreviouseducationaldetailid;
	
	@Column(name = "candidate_id")
 	private Integer candidateid;
	
	
	
	public Integer getCandidateid() {
		return candidateid;
	}

	public void setCandidateid(Integer candidateid) {
		this.candidateid = candidateid;
	}

	@Column(name = "college_name")
	private String collegename;
	
	@Column(name = "date_of_entry")
	@Temporal(TemporalType.DATE)
	private Date dateofentry;
	
	@Column(name = "date_of_leaving")
	@Temporal(TemporalType.DATE)
	private Date dateofleaving;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "date_of_entry_university")
	@Temporal(TemporalType.DATE)
	private Date dateofentryuniversity;
	
	@Column(name = "date_of_leaving_university")
	@Temporal(TemporalType.DATE)
	private Date dateofleavinguniversity;
	
	@Column(name = "qualifying_examination")
	private String qualifyingexamination;
	
	@Column(name = "number_of_attempts")
	private String numberofattempts;
	
	@Column(name = "yop")
	private String yop;
	
	@Column(name = "register_number")
	private String registernumber;
	
	@Column(name = "optional_subject_physics")
	private String optionalsubjectphysics;
		
	@Column(name = "optional_subject_physics_avg_marks")
	private String optionalsubjectphysicsavgmarks;
	
	@Column(name = "optional_subject_maths")
	private String optionalsubjectmaths;
	
	
	@Column(name = "optional_subject_maths_avg_marks")
	private String optionalsubjectmathsavgmarks;
	
	@Column(name = "optional_subject_opt")
	private String optionalsubjectopt;
	
	@Column(name = "optional_subject_opt_avg_marks")
	private String optionalsubjectoptavgmarks;
	
	@Column(name = "avg_percentage")
	private String avgpercentage;
	
	/*@Column(name = "year")
	private String year;
	
	@Column(name = "institution")
	private String institution;
	
	@Column(name = "clas")
	private String clas;
	
	@Column(name = "remarks")
	private String remarks;
*/
	public Integer getCandidatepreviouseducationaldetailid() {
		return candidatepreviouseducationaldetailid;
	}

	public void setCandidatepreviouseducationaldetailid(
			Integer candidatepreviouseducationaldetailid) {
		this.candidatepreviouseducationaldetailid = candidatepreviouseducationaldetailid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	
	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	

	public Date getDateofentry() {
		return dateofentry;
	}

	public void setDateofentry(Date dateofentry) {
		this.dateofentry = dateofentry;
	}

	public Date getDateofleaving() {
		return dateofleaving;
	}

	public void setDateofleaving(Date dateofleaving) {
		this.dateofleaving = dateofleaving;
	}

	public Date getDateofentryuniversity() {
		return dateofentryuniversity;
	}

	public void setDateofentryuniversity(Date dateofentryuniversity) {
		this.dateofentryuniversity = dateofentryuniversity;
	}

	public Date getDateofleavinguniversity() {
		return dateofleavinguniversity;
	}

	public void setDateofleavinguniversity(Date dateofleavinguniversity) {
		this.dateofleavinguniversity = dateofleavinguniversity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getQualifyingexamination() {
		return qualifyingexamination;
	}

	public void setQualifyingexamination(String qualifyingexamination) {
		this.qualifyingexamination = qualifyingexamination;
	}

	public String getNumberofattempts() {
		return numberofattempts;
	}

	public void setNumberofattempts(String numberofattempts) {
		this.numberofattempts = numberofattempts;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public String getRegisternumber() {
		return registernumber;
	}

	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}

	public String getOptionalsubjectphysics() {
		return optionalsubjectphysics;
	}

	public void setOptionalsubjectphysics(String optionalsubjectphysics) {
		this.optionalsubjectphysics = optionalsubjectphysics;
	}

	
	public String getOptionalsubjectphysicsavgmarks() {
		return optionalsubjectphysicsavgmarks;
	}

	public void setOptionalsubjectphysicsavgmarks(
			String optionalsubjectphysicsavgmarks) {
		this.optionalsubjectphysicsavgmarks = optionalsubjectphysicsavgmarks;
	}

	public String getOptionalsubjectmaths() {
		return optionalsubjectmaths;
	}

	public void setOptionalsubjectmaths(String optionalsubjectmaths) {
		this.optionalsubjectmaths = optionalsubjectmaths;
	}

	
	public String getOptionalsubjectmathsavgmarks() {
		return optionalsubjectmathsavgmarks;
	}

	public void setOptionalsubjectmathsavgmarks(String optionalsubjectmathsavgmarks) {
		this.optionalsubjectmathsavgmarks = optionalsubjectmathsavgmarks;
	}

	public String getOptionalsubjectopt() {
		return optionalsubjectopt;
	}

	public void setOptionalsubjectopt(String optionalsubjectopt) {
		this.optionalsubjectopt = optionalsubjectopt;
	}

	
	public String getOptionalsubjectoptavgmarks() {
		return optionalsubjectoptavgmarks;
	}

	public void setOptionalsubjectoptavgmarks(String optionalsubjectoptavgmarks) {
		this.optionalsubjectoptavgmarks = optionalsubjectoptavgmarks;
	}

	public String getAvgpercentage() {
		return avgpercentage;
	}

	public void setAvgpercentage(String avgpercentage) {
		this.avgpercentage = avgpercentage;
	}
/*
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
*/
}
