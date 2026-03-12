
package com.example.ems.controller;

import com.example.ems.model.Employee;
import com.example.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

 @Autowired
 private EmployeeService service;

 @GetMapping
 public List<Employee> getEmployees(){
  return service.getAllEmployees();
 }

 @PostMapping
 public Employee addEmployee(@RequestBody Employee employee){
  return service.saveEmployee(employee);
 }

 @DeleteMapping("/{id}")
 public void deleteEmployee(@PathVariable Long id){
  service.deleteEmployee(id);
 }
}
