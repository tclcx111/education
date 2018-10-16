package com.education.pojo.po;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

public class Person {

	   private Long id;
	   private String username;
	   private String passowrd;
	   private String status;
	   private Integer online;
	   private Date loginTime;

	  public Long getId() {
		return id;
	  }
	
	  public void setId(Long id) {
			this.id =id;
	  }
	  public String getUsername() {
		return username;
	  }
	
	  public void setUsername(String username) {
			this.username =username;
	  }
	  public String getPassowrd() {
		return passowrd;
	  }
	
	  public void setPassowrd(String passowrd) {
			this.passowrd =passowrd;
	  }
	  public String getStatus() {
		return status;
	  }
	
	  public void setStatus(String status) {
			this.status =status;
	  }
	  public Integer getOnline() {
		return online;
	  }
	
	  public void setOnline(Integer online) {
			this.online =online;
	  }
	  public Date getLoginTime() {
		return loginTime;
	  }
	
	  public void setLoginTime(Date loginTime) {
			this.loginTime =loginTime;
	  }
}
