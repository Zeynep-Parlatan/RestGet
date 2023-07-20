package com.springboot.firstproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	//localhost:8090/getEmp
	@GetMapping("/getEmp")
	public Employee getEmployee() {
		return new Employee("1","emp1");
	}
	
	@GetMapping("/getEmps")
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("2","emp2"));
		employees.add(new Employee("3","emp3"));
		employees.add(new Employee("4","emp4"));
		return employees;
	}
}
