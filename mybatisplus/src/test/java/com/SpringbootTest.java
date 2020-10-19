package com;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.mapper.EmployeeMaper;
import com.model.Employee;

import com.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: wxf
 * @Version: 1.0
 * @Date 2020/10/14  21:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {

    @Resource
    private EmployeeMaper employeeMaper;

    @Resource
    EmployeeServiceImpl employeeservice;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        Employee employee = employeeMaper.selectById(1);
        System.out.println(employee.toString());
    }

    @Test
    public void TestAddList(){
        //生成Employee串
        List<Employee> list = new  ArrayList<Employee>();
        for(int i=2;i<100;i++){
            Employee employee = new Employee();
            String name = "王孝峰"+i+"号";
            String card= "201624308"+i;
            Integer sex = 1;
            String email = "156220028"+i+"@qq.com";
            String address = "河南省郑州市"+i+"路";
            String phone = "1780390066"+i;
            String target = "北京市丰台区"+i+"栋";
            employee.setName(name);
            employee.setCard(card);
            employee.setSex(sex);
            employee.setEmail(email);
            employee.setAddress(address);
            employee.setPhone(phone);
            employee.setTarget(target);
            list.add(employee);
        }
        employeeservice.saveBatch(list);
    }

    @Test
    public void TestUpdate(){
        Employee employee = new Employee();
        employee.setId(10);
        employee.setName("史好迎");
        //如果是通过id进行更新，则没有传入的值不会更新。
//        employeeMaper.updateById(employee);
        //如果是通过所有column进行更新，没有传入的值会值为null
        Wrapper<Employee> updateWrapper = new Wrapper<Employee>() {
            @Override
            public Employee getEntity() {
                Employee emmployee = new Employee();
                employee.setEmail("1111");
                emmployee.setId(1);
                return emmployee;
            }

            @Override
            public MergeSegments getExpression() {
                return null;
            }

            @Override
            public void clear() {

            }

            @Override
            public String getSqlSegment() {
                return null;
            }
        };
        employeeMaper.update(employee,updateWrapper);
    }




}
