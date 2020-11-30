package com.dao;

import com.pojo.Student;
import com.pojo.Teacher;
import com.pojo.User;

import java.util.List;

public interface StudentMapper {
    //高级结果映射-----------------------------------------------
    // 关联
    //1 嵌套 Select 查询：通过执行另外一个 SQL 映射语句来加载期望的复杂类型。
   //2  嵌套结果映射：使用嵌套的结果映射来处理连接结果的重复子集。


    //嵌套结果映射:N+1 查询问题
    //    property：映射到列结果的字段或属性。用来匹配的 JavaBean 存在给定名字的属性。
    //  column 	数据库中的列名，或者是列的别名。一般情况下，和传递给 resultSet.getString(columnName) 方法的参数一样。
    // id 元素在嵌套结果映射中扮演着非常重要的角色。应该指定一个或多个可以唯一标识结果的属性。 虽然不指定这个属性，MyBatis 仍然可以工作，但是会产生严重的性能问题。
    public List<Student>  getStudentList();

    public Teacher getTeacher(int id);

    //关于获取学生的都是级联对象
    //关联的嵌套结果映射
    public List<Student> getStudentList1();

    //sql循环插入对象
    public Integer addUserList(List<User> list);


    //关联的多结果集（ResultSet）       正在学习中



}
