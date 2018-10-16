package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import java.lang.Long;
import java.util.List;
import java.util.Map;
import com.education.pojo.po.CourseInfo;

@Mapper
public interface CourseInfoMapper {

     CourseInfo queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(CourseInfo CourseInfo);

     void insert(CourseInfo CourseInfo);
     
     void insertSelective(CourseInfo CourseInfo);
	
	 List<CourseInfo> listByParma(Map<String,Object> params);

	 void insertBatch(List<CourseInfo> list);
	
}
