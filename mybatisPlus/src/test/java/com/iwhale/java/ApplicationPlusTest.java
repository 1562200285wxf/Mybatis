package com.iwhale.java;

import com.iwhale.java.mapper.EmployeeMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/11/16  22:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationPlusTest {

//    @Autowired
//    EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    private EmployeeMapper employeeMapper;

    public void testGetAllList(){
//        EmployeeServiceImpl employeeServiceImpl  = new EmployeeServiceImpl();
        System.out.println(employeeMapper.selectById(1));
    }
}
