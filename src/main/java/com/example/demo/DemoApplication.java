package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "kk") String name) {
	return String.format("Hello %s!", name);
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("karthik");
		emp.setDesignation("softwareEngineer");
		emp.setEmpId("1");
		emp.setSalary(120000);

		return emp;
	}
	
	@RequestMapping(value = "/Travelling", method = RequestMethod.GET)
	public Travelling SecondPage() {

		Travelling Tra = new Travelling();
		Tra.setName("karthik");
		Tra.setTicket("0000ASPRT");
		Tra.setBusName("MyBus");
		Tra.setAmount(120);

		return Tra;
	}
	
}
