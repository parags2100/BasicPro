package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.StudentEntity;
import com.Service.StudentServiceImpl;

@RestController
public class StudentController {
	 
	@Autowired
	StudentServiceImpl serv;
	
	@GetMapping("/Stuget")
	private List<StudentEntity> getAllStud() {
			
		return serv.getAllStu();
		
	}
	
	
}
