package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/15  23:13
 */
//接口和mapper文件必须重名
    //接口和mappper配置文件再同一个包下面
public interface UserMapper {

    public List<User> getUserList();

    public List<User> getUserListLimit(HashMap<String,Integer> map);

}
