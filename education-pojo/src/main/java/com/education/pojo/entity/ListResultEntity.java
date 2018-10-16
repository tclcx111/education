package com.education.pojo.entity;

import java.io.Serializable;
import java.util.List;

public class ListResultEntity<T> implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = -4676516265129631919L;
	
	//列表数据
	private List<T> allEntity;

	public List<T> getAllEntity() {
		return allEntity;
	}

	public void setAllEntity(List<T> allEntity) {
		this.allEntity = allEntity;
	}
	
	
	
}
