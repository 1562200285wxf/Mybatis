package com.beijing.dao;

import com.beijing.Utils.CustomUtil;
import com.beijing.mapper.CustomMatterBaseMapper;
import com.beijing.model.CustomMatterBase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  21:36
 */

@Component
public class CustomMatterBaseDao {

    public  List<CustomMatterBase> getAllCustomMatterBase(){
        SqlSession sqlSession  = CustomUtil.getSqlSession();
        CustomMatterBaseMapper customMatterBaseMapper = sqlSession.getMapper(CustomMatterBaseMapper.class);
        List<CustomMatterBase> list = customMatterBaseMapper.getAllCustomMatterBase();
        sqlSession.close();
       return  list;
    }

    public  List<String> getAllCustomMatterBaseRowguid(){
        SqlSession sqlSession  = CustomUtil.getSqlSession();
        CustomMatterBaseMapper customMatterBaseMapper = sqlSession.getMapper(CustomMatterBaseMapper.class);
        List<String> list = customMatterBaseMapper.getAllCustomMatterBaseRowguid();
        sqlSession.close();
        return  list;
    }

    @Test
    public void testtttt(){
        SqlSession sqlSession  = CustomUtil.getSqlSession();
        CustomMatterBaseMapper customMatterBaseMapper = sqlSession.getMapper(CustomMatterBaseMapper.class);
        List<CustomMatterBase> list = customMatterBaseMapper.getAllCustomMatterBase();
        sqlSession.close();
        System.out.println(list);
    }

}
