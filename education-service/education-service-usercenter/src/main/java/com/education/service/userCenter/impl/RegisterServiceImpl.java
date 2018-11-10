package com.education.service.userCenter.impl;

import com.education.pojo.po.Person;
import com.education.service.base.usercenter.PersonBaseService;
import com.education.service.userCenter.RegisterService;

public class RegisterServiceImpl implements RegisterService{

	private PersonBaseService personBaseService;
	
	@Override
	public Person register(Person person) {
		//检查条件检查
		personBaseService.addPerson(person);
		return person;
	}

	@Override
	public boolean checkPersonHasRegistered(String username) {
		return false;
	}

}
