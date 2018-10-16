package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import com.education.pojo.po.CourseChapter;
import java.lang.Long;
import java.util.List;
import java.util.Map;

@Mapper
public interface CourseChapterMapper {

     CourseChapter queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(CourseChapter CourseChapter);

     void insert(CourseChapter CourseChapter);
     
     void insertSelective(CourseChapter CourseChapter);
	
	 List<CourseChapter> listByParma(Map<String,Object> params);

	 void insertBatch(List<CourseChapter> list);
	
}
