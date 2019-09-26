package io.gitlab.and0111.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.gitlab.and0111.springbootdemo.dto.EmployeeDto;
import io.gitlab.and0111.springbootdemo.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")

public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/")
  public ResponseEntity<List<EmployeeDto>> findAll() {
    List<EmployeeDto> employeeDtoList = employeeService.findAll();
    HttpStatus status = employeeDtoList.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).body(employeeDtoList);
  }
}