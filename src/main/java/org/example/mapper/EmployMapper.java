package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployMapper extends BaseMapper<Employee> {

}
