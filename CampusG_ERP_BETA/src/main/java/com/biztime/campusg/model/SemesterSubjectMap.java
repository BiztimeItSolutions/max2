package com.biztime.campusg.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="semester_subject_map")
public class SemesterSubjectMap implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "semester_subject_map_id")  
		private Integer mapId;
		

	 
		@Column(name = "semester_id")
		private Integer semesterId;
		
		@Column(name = "course_id")
		private Integer courseId;

		public Integer getMapId() {
			return mapId;
		}

		public void setMapId(Integer mapId) {
			this.mapId = mapId;
		}

		public Integer getSemesterId() {
			return semesterId;
		}

		public void setSemesterId(Integer semesterId) {
			this.semesterId = semesterId;
		}

		

		public Integer getCourseId() {
			return courseId;
		}

		public void setCourseId(Integer courseId) {
			this.courseId = courseId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
}
