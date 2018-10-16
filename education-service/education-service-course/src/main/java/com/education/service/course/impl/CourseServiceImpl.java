package com.education.service.course.impl;

import com.education.pojo.entity.ListResultEntity;
import com.education.pojo.entity.PageEntity;
import com.education.pojo.po.CourseInfo;
import com.education.service.course.CourseService;

/**
 * 课程服务接口实现
 * @author xupengtao
 *
 */
public class CourseServiceImpl implements CourseService {

	@Override
	public ListResultEntity<CourseInfo> listByCateId(long id, int begin, int size, int page) {
		return null;
	}

	@Override
	public ListResultEntity<CourseInfo> listByCateIdAndUrl(long id, String url) {
		return null;
	}

	@Override
	public ListResultEntity<CourseInfo> listByPageEntity(PageEntity page) {
		return null;
	}

	@Override
	public ListResultEntity<CourseInfo> listByCateKey(String key, int begin, int size, int page) {
		return null;
	}

	@Override
	public ListResultEntity<CourseInfo> listByCateKey(String key, String url) {
		return null;
	}

	
}
