package com.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.entity.Employee;
import com.db.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// show welcome page
		@GetMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	// show register page
	@GetMapping("/reg")
	public String showReg(Model map) {
		// form baking object
		map.addAttribute("employee", new Employee());
		return "register";
	}

	// save employee
	@PostMapping("/save")
	public String saveEmployee(Employee employee, Model map) {
		Integer id = service.saveEmployee(employee);
		map.addAttribute("msg", "employee" + id + "added successfully");

		// clear form baking object
		map.addAttribute("employee", new Employee());

		return "register";
	}

	// get all employees
	@GetMapping("/all")
	public String showEmployee(Model map) {
		List<Employee> list = service.getAllEmployees();
		map.addAttribute("list", list);
		return "data";
	}

	// getOne Employee for view page
	@GetMapping("/view")
	public String getOneEmployee(@RequestParam int id, Model map) {
		Employee emp = service.getOneEmployee(id);
		if (emp != null) {
			map.addAttribute("emp", emp);
		} else {
			map.addAttribute("msg", "No Employee Found");
		}

		return "view";
	}

	// delete employee
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam Integer id, Model map) {
		service.deleteEmployee(id);
		map.addAttribute("msg", "Employee deleted Successfully");
		return "redirect:all";
	}

	// get Update employee
	@GetMapping("/getUpdate")
	public String getUpdateEmployeePage(@RequestParam Integer id, Model map) {
		map.addAttribute("employee", service.getOneEmployee(id));
		map.addAttribute("mode", "edit");
		return "register";
	}

	// update employee
	@PutMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee, Model map) {
		Employee emp = service.updateEmployee(employee);
		map.addAttribute("msg", "Employee updated successfully");

		// clear form baking object 
		map.addAttribute("employee",new Employee());
		return "redirect:view?id=" + emp.getEmpId();
	}
}
