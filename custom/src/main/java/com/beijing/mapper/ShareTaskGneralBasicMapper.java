package com.beijing.mapper;

import com.beijing.model.ShareTaskGneralBasic;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  21:05
 */
@Mapper
public interface ShareTaskGneralBasicMapper {

    public ShareTaskGneralBasic getGeneralBasicByRowguidMaxCdbatch(String rowguid);
}
