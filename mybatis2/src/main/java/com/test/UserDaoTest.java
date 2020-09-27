package com.test;

import com.dao.BlogMapper;
import com.dao.StudentMapper;
import com.dao.TeacherMapper;
import com.dao.UserMapper;
import com.mybatis.MybatisUtil;
import com.pojo.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/15  23:22
 */
public class UserDaoTest {
    @Test
    public void testAll(){
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
    public void TestLimit(){
        SqlSession sqlSession  = MybatisUtil.getSqlSession();
        //映射接口用来绑定映射语句，实例在方法中获取。
        UserMapper userdao =  sqlSession.getMapper(UserMapper.class);
        //为什么是map类型，
        //我需要传进去两个参数，就是用mybatis自己的map自带
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",2);
        map.put("endIndex",2);
        List<User> list =  userdao.getUserListLimit(map);
        for(User user : list){
            System.out.println(user.toString());
        }
        sqlSession.close();
    }

    @Test
    public void TestCollction(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentdao = sqlSession.getMapper(StudentMapper.class);
        List<Student> list =studentdao.getStudentList();
        for(Student  student : list){
            System.out.println(student.toString());
        }
    }

    @Test
    public void TestCollction1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentdao = sqlSession.getMapper(StudentMapper.class);
        List<Student> list =studentdao.getStudentList1();
        for(Student  student : list){
            System.out.println(student.toString());
        }
    }

    @Test
    public void TestCollctionTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher1 teacher =teacherMapper.getTeacher(1);
        System.out.println(teacher.toString());
    }

    @Test
    public void TestBolg(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog =blogMapper.getBlog(1);
        System.out.println(blog.toString());
    }

    @Test
    public void TestBlogIfMap(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> list =blogMapper.queryBlogIf(map);
        for(Blog blog:list){
            System.out.println(blog.toString());
        }
    }

    @Test
    public  void testUpdateBlog(){
        SqlSession session = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        HashMap<String,String> map = new HashMap();
        map.put("title","测试title");
        map.put("author","测试author");
        map.put("id","1");
        blogMapper.updateBlog(map);
        session.commit();
        session.close();
    }

    @Test
    public  void testQueryBlog(){
        SqlSession session = MybatisUtil.getSqlSession();
        BlogMapper blogMapper = session.getMapper(BlogMapper.class);
        HashMap<String,String> map = new HashMap();
        map.put("title","测试");
        map.put("author","测试author");
        map.put("id","1");
        System.out.println(blogMapper.queryBlog(map));


        HashMap<String,String> map1 = new HashMap();
        map1.put("title","测试");
        map1.put("author","测试author");
        map1.put("id","1");
        System.out.println(blogMapper.queryBlog(map1));

        session.commit();
        session.close();
    }
}
