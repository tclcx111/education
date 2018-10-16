package com.education.service.course;

import com.education.pojo.entity.ListResultEntity;
import com.education.pojo.entity.PageEntity;
import com.education.pojo.po.CourseInfo;

/**
 * 课程服务接口
 * 改层接口封装需求变化 调用底层服务
 * @author xupengtao
 *
 */
public interface CourseService {

	/**
	 * 根据课程 cate id 获取分页数据
	 * @param id
	 * @param begin
	 * @param size
	 * @param page
	 * @return
	 */
	ListResultEntity<CourseInfo> listByCateId(long id,int begin,int size,int page);
	
	/**
	 * 根据 cate id,请求url路径获取分页数据
	 * 
	 * @param id
	 * @param url
	 * @return
	 */
	ListResultEntity<CourseInfo> listByCateIdAndUrl(long id,String url);
	
	/**
	 * 根据 请求entity 获取 分页数据
	 * @param page
	 * @return
	 */
	ListResultEntity<CourseInfo> listByPageEntity(PageEntity page);
	
	/**
	 * 根据课程 类型关键字获取分页数据
	 * @param key
	 * @param begin
	 * @param size
	 * @param page
	 * @return
	 */
	ListResultEntity<CourseInfo> listByCateKey(String key,int begin,int size,int page);
	
	/**
	 * 根据类型关键字和请求url 获取分页数据
	 * @param key
	 * @param url
	 * @return
	 */
	ListResultEntity<CourseInfo> listByCateKey(String key,String url);
}
