package com.mypackage.demoMysql.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.FieldError;
// import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mypackage.demoMysql.model.User;
import com.mypackage.demoMysql.repo.UserRepository;

// import com.mypackage.demoApp.exception.ResourceNotFoundException;
// import com.mypackage.demoApp.model.Employee;
// import com.mypackage.demoApp.repository.repository;

// import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class UserController {
    @Autowired
	private UserRepository employeeRepository;

    @GetMapping("")
    public String findAll(){
     return "Just Boot is cool";
    }

	// get all employees
	@GetMapping("/employees")
	public List<User> getAllEmployees(){
		return employeeRepository.findAll();
	}		
	
	// create employee rest api
	// @PostMapping("/employees")
	// public Employee createEmployee(@Valid @RequestBody Employee employee) {
	// 	return employeeRepository.save(employee);
	// }
	
    
}
