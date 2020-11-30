package com.beijing.dao;

import com.beijing.Utils.BjAlsxUtil;
import com.beijing.mapper.ShareTaskGneralBasicMapper;
import com.beijing.model.ShareTaskGneralBasic;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  23:11
 */
@Component
public class ShareTaskGneralBasicDao {

    public ShareTaskGneralBasic getGeneralBasicByRowguidMaxCdbatch(String rowguid){
        SqlSession sqlSession = BjAlsxUtil.getSqlSession();
        ShareTaskGneralBasicMapper shareTaskGneralBasicMapper = sqlSession.getMapper(ShareTaskGneralBasicMapper.class);
        ShareTaskGneralBasic shareTaskGneralBasic = shareTaskGneralBasicMapper.getGeneralBasicByRowguidMaxCdbatch(rowguid);
        return  shareTaskGneralBasic;
    }
}
