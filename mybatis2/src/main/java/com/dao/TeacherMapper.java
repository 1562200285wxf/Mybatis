package com.dao;

import com.pojo.Teacher1;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    public Teacher1 getTeacher(@Param("id") int id);
}
