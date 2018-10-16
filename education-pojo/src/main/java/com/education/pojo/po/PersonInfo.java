package com.education.pojo.po;

import java.lang.Long;
import java.lang.String;

public class PersonInfo {

	   private Long id;
	   private Long personId;
	   private String group;
	   private String type;
	   private String val;
	   private String description;
	   private Long parentId;

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
	  public String getGroup() {
		return group;
	  }
	
	  public void setGroup(String group) {
			this.group =group;
	  }
	  public String getType() {
		return type;
	  }
	
	  public void setType(String type) {
			this.type =type;
	  }
	  public String getVal() {
		return val;
	  }
	
	  public void setVal(String val) {
			this.val =val;
	  }
	  public String getDescription() {
		return description;
	  }
	
	  public void setDescription(String description) {
			this.description =description;
	  }
	  public Long getParentId() {
		return parentId;
	  }
	
	  public void setParentId(Long parentId) {
			this.parentId =parentId;
	  }
}
