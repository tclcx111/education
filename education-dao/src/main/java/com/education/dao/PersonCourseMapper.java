package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import java.lang.Long;
import com.education.pojo.po.PersonCourse;
import java.util.List;
import java.util.Map;

@Mapper
public interface PersonCourseMapper {

     PersonCourse queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(PersonCourse PersonCourse);

     void insert(PersonCourse PersonCourse);
     
     void insertSelective(PersonCourse PersonCourse);
	
	 List<PersonCourse> listByParma(Map<String,Object> params);

	 void insertBatch(List<PersonCourse> list);
	
}
