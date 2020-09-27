package com.pojo;

import lombok.Data;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/21  21:16
 */
@Data
public class Student {
    int id;
    String name;
    Teacher teacher;

}
