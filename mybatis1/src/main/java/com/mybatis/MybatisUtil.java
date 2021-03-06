package com.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/9/15  22:55
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory ;
    static {
        try{
            //SqlSessionFactory中包含所有sql的语句，此步骤是创建mybatis所独有的sqlsession工厂
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //获取SqlSession
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return  sqlSession;
    }
}
