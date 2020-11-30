package com.test;

import com.dao.UserMapper;
import com.mybatis.MybatisUtil;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/15  23:22
 */
public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        List<User> list =  userdao.getUserList();
        for(User user : list){
            System.out.println(user.toString());
        }
        //这只是一个示例，需要明白的是sqlsession这个东西是每次都需要关闭的，最好的是放到final中
        sqlSession.close();
    }

    @Test
    public void  TestGetUser(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        User user = userdao.getUser(1);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void TestGetUserByTwoTags(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        User user = userdao.getUserByTwoTags(1,"王孝峰");
        System.out.println(user.toString());
    }
    //mybatis的插入成功接口返回值是成功的行数
    //增删改需要提交事务
    @Test
    public void TestAdd(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(5);
        user.setName("王某人");
        user.setPwd("123456789");
        System.out.println(userdao.addUser(user));
        //输出成功安行数需要，就代表插入成功。
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void TestLike(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        List<User> list = userdao.getUserListLike("孝");
        for(User user : list){
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

    @Test
    public void TestAddUserList(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        User userA = new User();
        userA.setPwd("123456");
        userA.setName("userA");
        User userB = new User();
        userB.setPwd("123456789");
        userB.setName("userB");
        List<User> list = new ArrayList<>();
        list.add(userB);
        list.add(userA);
        int flag;
        flag = userdao.addUserList(list);
        System.out.println(flag);
        sqlSession.commit();
        sqlSession.close();
    }

    public void  test111(){

    }
}
