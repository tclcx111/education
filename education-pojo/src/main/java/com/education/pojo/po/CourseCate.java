package com.education.pojo.po;

import java.lang.Long;
import java.lang.String;
import java.util.Date;

public class CourseCate {

	   private Long id;
	   private String name;
	   private String status;
	   private Long parentId;
	   private Date createTime;

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
	  public String getStatus() {
		return status;
	  }
	
	  public void setStatus(String status) {
			this.status =status;
	  }
	  public Long getParentId() {
		return parentId;
	  }
	
	  public void setParentId(Long parentId) {
			this.parentId =parentId;
	  }
	  public Date getCreateTime() {
		return createTime;
	  }
	
	  public void setCreateTime(Date createTime) {
			this.createTime =createTime;
	  }
}
