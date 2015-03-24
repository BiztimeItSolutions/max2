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

/**
 * @author     Anuvidhya
 * @Module     College Calendar
 * @Purpose    Maintain holiday details and other details 
 *
 */
@Entity  
@Table(name="college_calendar")
public class CollegeCalendar implements Serializable {

	private static final long serialVersionUID = -723583058586873479L;  
	   
	 @Id  
		@GeneratedValue(strategy=GenerationType.AUTO)  
		@Column(name = "calendar_id")  
		private Integer calendarId;
		

	    @Column(name = "month")
		private String month;
		
	    @Column(name = "holidays")
		private String holidays;
	    
	    @Column(name = "working_days")
		private String workingDays;
	    
	    @Column(name = "total_days")
		private String totalDays;

		public Integer getCalendarId() {
			return calendarId;
		}

		public void setCalenderId(Integer calendarId) {
			this.calendarId = calendarId;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getHolidays() {
			return holidays;
		}

		public void setHolidays(String holidays) {
			this.holidays = holidays;
		}

		public String getWorkingDays() {
			return workingDays;
		}

		public void setWorkingDays(String workingDays) {
			this.workingDays = workingDays;
		}

		public String getTotalDays() {
			return totalDays;
		}

		public void setTotalDays(String totalDays) {
			this.totalDays = totalDays;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    
}
