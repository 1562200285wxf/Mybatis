package com.iwhale.java.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iwhale.java.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
