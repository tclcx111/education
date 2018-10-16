package com.education.pojo.po;

import java.lang.Long;
import java.lang.String;
import java.util.Date;

public class PersonCourse {

	   private Long id;
	   private Long personId;
	   private Long courseId;
	   private String rate;
	   private String status;
	   private Date endTime;
	   private Date buyTime;

	  public Long getId() {
		return id;
	  }
	
	  public void setId(Long id) {
			this.id =id;
	  }
	  public Long getPersonId() {
		return personId;
	  }
	
	  public void setPersonId(Long personId) {
			this.personId =personId;
	  }
	  public Long getCourseId() {
		return courseId;
	  }
	
	  public void setCourseId(Long courseId) {
			this.courseId =courseId;
	  }
	  public String getRate() {
		return rate;
	  }
	
	  public void setRate(String rate) {
			this.rate =rate;
	  }
	  public String getStatus() {
		return status;
	  }
	
	  public void setStatus(String status) {
			this.status =status;
	  }
	  public Date getEndTime() {
		return endTime;
	  }
	
	  public void setEndTime(Date endTime) {
			this.endTime =endTime;
	  }
	  public Date getBuyTime() {
		return buyTime;
	  }
	
	  public void setBuyTime(Date buyTime) {
			this.buyTime =buyTime;
	  }
}
