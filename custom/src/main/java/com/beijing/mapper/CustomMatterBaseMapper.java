package com.beijing.mapper;

import com.beijing.model.CustomMatterBase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  21:00
 */
@Mapper
public interface CustomMatterBaseMapper {

    public List<CustomMatterBase> getAllCustomMatterBase();

    public List<String> getAllCustomMatterBaseRowguid();
}
