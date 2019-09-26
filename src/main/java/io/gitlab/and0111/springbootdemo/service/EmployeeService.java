package io.gitlab.and0111.springbootdemo.service;

import java.util.List;

import io.gitlab.and0111.springbootdemo.dto.EmployeeDto;

public interface EmployeeService {
  public List<EmployeeDto> findAll();
}