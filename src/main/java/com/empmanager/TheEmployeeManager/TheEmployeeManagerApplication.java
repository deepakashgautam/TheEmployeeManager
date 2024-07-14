package com.empmanager.TheEmployeeManager;

import com.empmanager.TheEmployeeManager.service.EmployeeService;
import com.empmanager.TheEmployeeManager.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TheEmployeeManagerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TheEmployeeManagerApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		employeeService.createEmployee();;
	}

}
