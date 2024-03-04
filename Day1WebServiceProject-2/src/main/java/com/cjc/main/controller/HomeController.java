package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String prelogin() {
		
		return "Pravin";
	}
	
	@RequestMapping(value="/getstu",method=RequestMethod.GET)
	public Student getStu() {
		Student s=new Student();
		s.setSid("1");
		s.setSname("Pravin");
		s.setMobno("45678");
		s.setAddr("pune");
		return s;
	}
	
	@PostMapping(value="reg/{un}/{ps}") 
	public String postStu(@PathVariable("un")String uname,@PathVariable("ps")String pass){
		System.out.println("uname"+uname);
		System.out.println("pass"+pass);
		return uname;
	}
}
 