package org.mybatis.example.dao;

import org.apache.ibatis.annotations.Select;
import org.mybatis.example.entity.Activitytype;

public interface ActivitytypeMapper {
	@Select("select * from Activitytype where Activitytypeid = #{id}")  
    public Activitytype getUserById(int id);  
}
