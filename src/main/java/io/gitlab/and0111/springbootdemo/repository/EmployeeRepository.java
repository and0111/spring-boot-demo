package io.gitlab.and0111.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.gitlab.and0111.springbootdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}