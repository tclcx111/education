package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import java.lang.Long;
import java.util.List;
import java.util.Map;
import com.education.pojo.po.Person;

@Mapper
public interface PersonMapper {

     Person queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(Person Person);

     void insert(Person Person);
     
     void insertSelective(Person Person);
	
	 List<Person> listByParma(Map<String,Object> params);

	 void insertBatch(List<Person> list);
	
}
