package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/22  17:55
 */
@Data
public class Blog {

    private  String  id;
    private  String title;
    private  String author;
    private  Date createTime;//属性名和字段名不一致
    private  int views;


}
