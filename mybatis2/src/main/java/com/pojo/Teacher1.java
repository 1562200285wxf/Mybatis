package com.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/22  15:03
 */
@Data
//这个类是为了设计mybatis中的查询一对多
public class Teacher1 {
    int id;
    String name;
    List<Student> students;
}
