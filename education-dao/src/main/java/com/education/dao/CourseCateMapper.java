package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import java.lang.Long;
import java.util.List;
import com.education.pojo.po.CourseCate;
import java.util.Map;

@Mapper
public interface CourseCateMapper {

     CourseCate queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(CourseCate CourseCate);

     void insert(CourseCate CourseCate);
     
     void insertSelective(CourseCate CourseCate);
	
	 List<CourseCate> listByParma(Map<String,Object> params);

	 void insertBatch(List<CourseCate> list);
	
}
