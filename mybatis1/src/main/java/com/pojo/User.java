package com.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/15  23:05
 */
@Data
@Alias("user")
public class User {
    //为每一个类取一个在数据库中的别名，一个是配中的单个配置
    //另一个<package name="com.pojo" />直接扫描包下面的

    private  int id;
    private  String name;
    private  String pwd;
}
