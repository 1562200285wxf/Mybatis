package com.beijing.service;

import com.beijing.dao.CustomMatterBaseDao;
import com.beijing.dao.ShareTaskGneralBasicDao;
import com.beijing.model.CustomMatterBase;
import com.beijing.model.ShareTaskGneralBasic;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/26  22:16
 */
@Service
public class CustomMatterBaseService {

    @Autowired
    ShareTaskGneralBasicDao shareTaskGneralBasicDao;

    @Test
    public void notice() {
        CustomMatterBaseDao customMatterBaseDao = new CustomMatterBaseDao();
        ShareTaskGneralBasicDao shareTaskGneralBasicDao = new ShareTaskGneralBasicDao();
//        List<String> list  = customMatterBaseDao.getAllCustomMatterBaseRowguid();
        List<String> ListResult = new ArrayList<>();
        List<CustomMatterBase> list = customMatterBaseDao.getAllCustomMatterBase();
        for (CustomMatterBase customMatterBase : list) {
            ShareTaskGneralBasic shareTaskGneralBasic = shareTaskGneralBasicDao.getGeneralBasicByRowguidMaxCdbatch(customMatterBase.getRowguid());
            if (!shareTaskGneralBasic.getCdBatch().equals(customMatterBase.getCdBatch())) {
                System.out.println("事项:" + shareTaskGneralBasic.getTaskName() + "   发生变更");
            }
        }
    }

}
