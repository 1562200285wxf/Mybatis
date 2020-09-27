package com.dao;

import com.pojo.Blog;
import com.pojo.Student;
import com.pojo.Teacher;

import java.util.List;

public interface StudentMapper {

    //关于获取学生的都是级联对象
    public List<Student>  getStudentList();

    public Teacher getTeacher(int id);

    public List<Student> getStudentList1();

}
