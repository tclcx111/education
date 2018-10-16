package com.education.service.base.course.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.dao.CourseInfoMapper;
import com.education.pojo.entity.ListResultEntity;
import com.education.pojo.entity.PageEntity;
import com.education.pojo.po.CourseInfo;
import com.education.service.base.cource.CourseListBaseService;

/**
 * 基础服务数据都是从数据库中查出来
 * @author xupengtao
 *
 */
public class CourseListBaseServiceImpl implements CourseListBaseService {

	@Autowired
	private CourseInfoMapper courseInfoMapper;
	
	@Override
	public ListResultEntity<CourseInfo> listCourseByCate(PageEntity pageEntity) {
		
		courseInfoMapper.queryByPrimaryKey(1L);
		return null;
	}

}
