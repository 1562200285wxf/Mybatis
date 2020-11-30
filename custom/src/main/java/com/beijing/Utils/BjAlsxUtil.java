package com.beijing.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  21:06
 */
public class BjAlsxUtil {
    private static SqlSessionFactory sqlSessionFactory ;
    static {
        try{
            //SqlSessionFactory中包含所有sql的语句，此步骤是创建mybatis所独有的sqlsession工厂
            String resource = "bjalsx-config.xml";
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
