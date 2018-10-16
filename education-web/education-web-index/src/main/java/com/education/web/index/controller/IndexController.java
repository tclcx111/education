package com.education.web.index.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.pojo.entity.ListResultEntity;
import com.education.pojo.po.CourseInfo;
import com.education.service.course.CourseService;

/**
 * 首页
 * @author xupengtao
 *
 */
public class IndexController {

	@Autowired
	CourseService courseService ;
	
	/**
	 * 测试首页数据
	 */
	public void index() {
		ListResultEntity<CourseInfo> list = courseService.listByCateId(1L, 0, 10, 0);
		System.out.println(list.getAllEntity().size());
	}
	
}
