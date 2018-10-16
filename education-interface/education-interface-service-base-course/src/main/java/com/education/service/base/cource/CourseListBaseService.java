package com.education.service.base.cource;

import com.education.pojo.entity.ListResultEntity;
import com.education.pojo.entity.PageEntity;
import com.education.pojo.po.CourseInfo;

/**
 * 课程列表查询接口
 * @author xupengtao
 *
 */
public interface CourseListBaseService {

	/**
	 * 根据请求实体查询课程数据
	 * @param pageEntity
	 * @return
	 */
	ListResultEntity<CourseInfo> listCourseByCate(PageEntity pageEntity);
	
	
}
