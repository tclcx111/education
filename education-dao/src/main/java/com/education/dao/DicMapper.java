package com.education.dao;

import org.apache.ibatis.annotations.Mapper;
import java.lang.Long;
import java.util.List;
import java.util.Map;
import com.education.pojo.po.Dic;

@Mapper
public interface DicMapper {

     Dic queryByPrimaryKey(Long id);
    
     void updateByPrimaryKey(Dic Dic);

     void insert(Dic Dic);
     
     void insertSelective(Dic Dic);
	
	 List<Dic> listByParma(Map<String,Object> params);

	 void insertBatch(List<Dic> list);
	
}
