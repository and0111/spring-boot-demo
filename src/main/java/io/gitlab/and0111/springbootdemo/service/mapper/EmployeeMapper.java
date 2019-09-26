package io.gitlab.and0111.springbootdemo.service.mapper;

import org.mapstruct.Mapper;

import io.gitlab.and0111.springbootdemo.dto.EmployeeDto;
import io.gitlab.and0111.springbootdemo.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDto, Employee> {
}