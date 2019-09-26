package io.gitlab.and0111.springbootdemo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import io.gitlab.and0111.springbootdemo.entity.Employee;
import io.gitlab.and0111.springbootdemo.repository.EmployeeRepository;

@Component
public class EmployeeDataInit implements ApplicationRunner {

  private EmployeeRepository employeeRepository; // this should be a DAO, which in this case is the Repository

  @Autowired
  public EmployeeDataInit(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Employee newEmployee = new Employee();
    newEmployee.setId((long) 123456789);
    newEmployee.setName("Andrea");
    
    if (employeeRepository.count() == 0)
      employeeRepository.save(newEmployee);
  }

}