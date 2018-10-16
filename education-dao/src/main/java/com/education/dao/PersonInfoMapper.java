package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import com.education.pojo.po.PersonInfo;
import java.lang.Long;
import java.util.List;
import java.util.Map;

@Mapper
public interface PersonInfoMapper {

     PersonInfo queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(PersonInfo PersonInfo);

     void insert(PersonInfo PersonInfo);
     
     void insertSelective(PersonInfo PersonInfo);
	
	 List<PersonInfo> listByParma(Map<String,Object> params);

	 void insertBatch(List<PersonInfo> list);
	
}
