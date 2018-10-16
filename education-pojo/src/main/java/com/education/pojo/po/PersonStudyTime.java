package com.education.pojo.po;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;

public class PersonStudyTime {

	   private Long id;
	   private Long personId;
	   private Long courseId;
	   private Long chapterId;
	   private Integer studyTime;
	   private Integer time;
	   private String timeDesc;

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
	  public Long getChapterId() {
		return chapterId;
	  }
	
	  public void setChapterId(Long chapterId) {
			this.chapterId =chapterId;
	  }
	  public Integer getStudyTime() {
		return studyTime;
	  }
	
	  public void setStudyTime(Integer studyTime) {
			this.studyTime =studyTime;
	  }
	  public Integer getTime() {
		return time;
	  }
	
	  public void setTime(Integer time) {
			this.time =time;
	  }
	  public String getTimeDesc() {
		return timeDesc;
	  }
	
	  public void setTimeDesc(String timeDesc) {
			this.timeDesc =timeDesc;
	  }
}
