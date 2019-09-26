package io.gitlab.and0111.springbootdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.gitlab.and0111.springbootdemo.dto.EmployeeDto;
import io.gitlab.and0111.springbootdemo.entity.Employee;
import io.gitlab.and0111.springbootdemo.repository.EmployeeRepository;
import io.gitlab.and0111.springbootdemo.service.EmployeeService;
import io.gitlab.and0111.springbootdemo.service.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeRepository employeeRepository;
  private EmployeeMapper employeeMapper;

  public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
    this.employeeRepository = employeeRepository;
    this.employeeMapper = employeeMapper;
  }

  @Override
  public List<EmployeeDto> findAll() {
    List<Employee> listEmployeeEntity = employeeRepository.findAll();
    List<EmployeeDto> listEmployeeDTO = new ArrayList<>();
    listEmployeeEntity.forEach(entity -> listEmployeeDTO.add(this.employeeMapper.toDto(entity)));
    return listEmployeeDTO;
  }

}