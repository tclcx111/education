package com.education.pojo.po;

import java.lang.Long;
import java.lang.String;

public class CourseChapter {

	   private Long id;
	   private String name;
	   private String description;
	   private String time;
	   private Long parentId;

	  public Long getId() {
		return id;
	  }
	
	  public void setId(Long id) {
			this.id =id;
	  }
	  public String getName() {
		return name;
	  }
	
	  public void setName(String name) {
			this.name =name;
	  }
	  public String getDescription() {
		return description;
	  }
	
	  public void setDescription(String description) {
			this.description =description;
	  }
	  public String getTime() {
		return time;
	  }
	
	  public void setTime(String time) {
			this.time =time;
	  }
	  public Long getParentId() {
		return parentId;
	  }
	
	  public void setParentId(Long parentId) {
			this.parentId =parentId;
	  }
}
