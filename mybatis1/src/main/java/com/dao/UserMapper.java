package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

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

    //仅仅传入参数是为了防止出现sql注入
    public List<User> getUserListLike(String value);

    //测试resultMap
    public User getUser(int id);

    public int addUser(User user);

    //sql语句进行批量导入数据库
    public int addUserList(List<User> list);

    //字符串的替换，也就是手动传参数:两个参数
    public User getUserByTwoTags(@Param("Pid") int id,@Param("Pname") String name);




}
