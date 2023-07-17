package com.springboot.firstproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	//localhost:8090/getEmp
	@GetMapping("/getEmp")
	public employee getEmployee() {
		return new employee("1","emp1");
	}
	
	@GetMapping("/getEmps")
	public List<employee> getEmployees(){
		List<employee> employees = new ArrayList<>();
		employees.add(new employee("2","emp2"));
		employees.add(new employee("3","emp3"));
		employees.add(new employee("4","emp4"));
		return employees;
	}
}
