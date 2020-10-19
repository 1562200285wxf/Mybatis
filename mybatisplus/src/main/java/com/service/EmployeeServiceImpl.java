package com.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mapper.EmployeeMaper;
import com.model.Employee;
import org.springframework.stereotype.Service;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/15  11:08
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMaper, Employee> implements EmployeeService{
}
