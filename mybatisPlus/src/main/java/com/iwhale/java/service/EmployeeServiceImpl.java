package com.iwhale.java.service;

import com.iwhale.java.mapper.EmployeeMapper;
import com.iwhale.java.model.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/11/16  22:21
 */
@Service
public class EmployeeServiceImpl  implements EmployeeService{

    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }
}
