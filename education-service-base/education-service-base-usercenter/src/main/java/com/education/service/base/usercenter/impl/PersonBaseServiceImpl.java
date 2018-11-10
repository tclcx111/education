package com.education.service.base.usercenter.impl;

import com.education.pojo.po.Person;
import com.education.service.base.usercenter.PersonBaseService;

public class PersonBaseServiceImpl implements PersonBaseService {

	/**
	 * 新增用户 成功返回1，失败返回0
	 * @param person
	 * @return
	 */
	@Override
	public int addPerson(Person person) {
		return 0;
	}

	@Override
	public Person queryPersonByUserName(String username) {
		return null;
	}

	@Override
	public Person queryPersonById(Long id) {
		return null;
	}

	@Override
	public Person updatePerson(Person person) {
		return null;
	}

}
