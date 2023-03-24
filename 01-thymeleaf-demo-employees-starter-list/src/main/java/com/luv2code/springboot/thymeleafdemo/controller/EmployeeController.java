package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data

	private List<Employee> theEmployees;

private EmployeeService employeeService;
public EmployeeController(EmployeeService theEmployeeService) {
	employeeService = theEmployeeService;

}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {

	//get the employees from DB
		List<Employee> theEmployees = employeeService.findAll();


		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}

	@GetMapping("/showFormAdd")
	public String showFormForAdd(Model theModel) {
	   Employee theEmployee = new Employee();
	   theModel.addAttribute("employee", theEmployee);

	   return "employees/employee-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		Employee theEmployee = employeeService.findById(theId);

		theModel.addAttribute("employee", theEmployee);
		return "employees/employee-form";
	}

	@GetMapping("/delete")
	public String showForForDelete(@RequestParam("employeeId") int theId) {

	//delete the employee
		employeeService.deleteById(theId);
		//redirect to /employee
		return "redirect:/employees-list";
	}




	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
	  //save the employee
		employeeService.save(theEmployee);
		//use a redirect to prevent duplicate submissins
		return "redirect:/employees/list";

	}

}









