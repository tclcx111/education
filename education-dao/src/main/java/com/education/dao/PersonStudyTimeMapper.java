package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import com.education.pojo.po.PersonStudyTime;
import java.lang.Long;
import java.util.List;
import java.util.Map;

@Mapper
public interface PersonStudyTimeMapper {

     PersonStudyTime queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(PersonStudyTime PersonStudyTime);

     void insert(PersonStudyTime PersonStudyTime);
     
     void insertSelective(PersonStudyTime PersonStudyTime);
	
	 List<PersonStudyTime> listByParma(Map<String,Object> params);

	 void insertBatch(List<PersonStudyTime> list);
	
}
