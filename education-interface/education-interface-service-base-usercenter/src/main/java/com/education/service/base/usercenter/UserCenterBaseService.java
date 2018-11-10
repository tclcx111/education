package com.education.service.base.usercenter;

import com.education.pojo.po.Person;

public interface UserCenterBaseService{

	/**
	 * 新增人员
	 * @param person
	 * @return
	 */
	int addPerson(Person person);
	
	/**
	 * 根据 用户名
	 * @param username
	 * @return
	 */
	Person queryPersonByUserName(String username);
	
	/**
	 * 根据id 查询 person 
	 * @param id
	 * @return
	 */
	Person queryPersonById(Long id);
	
	/**
	 * 更新person
	 * @param person
	 * @return
	 */
	Person updatePerson(Person person);
	
}
