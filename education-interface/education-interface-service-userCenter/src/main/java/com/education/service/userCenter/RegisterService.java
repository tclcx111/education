package com.education.service.userCenter;

import com.education.pojo.po.Person;

/**
 * 注册服务
 * @author xupengtao
 *
 */
public interface RegisterService {

	/**
	 * 注册，如果注册失败返回null
	 * @param person
	 * @return
	 */
	Person register(Person person);
	
	/**
	 * 检查用户是否注册
	 * @param username
	 * @return
	 */
	boolean checkPersonHasRegistered(String username);
	
}
