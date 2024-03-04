package com.cjc.curd.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.curd.webapp.main.model.Student;
import com.cjc.curd.webapp.main.servicei.HomeServicei;
@RestController
public class HomeController {
	
	@Autowired
	HomeServicei hs;
	@PostMapping("/regdata")
	public String regData(@RequestBody Student s)
	{
		hs.savedata(s);
		return "sucess";
	}

	@GetMapping("/getSingleData/{uname}/{password}")
	public Student getSingleData(@PathVariable("uname") String un,@PathVariable("password") String pass)
	{

		Student s=hs.getsingleData(un,pass);
		
		return s;
	}
	
	@GetMapping("/getAllData")
	public Iterable<Student> getAllData()
	{
		Iterable<Student> list=hs.displayAll();
		return list;
	}
	
	@PutMapping("/updatedata/{uid}")
	public String updateData(@PathVariable("uid") int uid,@RequestBody Student s)
	{
		System.out.println("UId is==="+uid);
		System.out.println("Body Id==="+s.getUid());
		hs.savedata(s);
		return "Update Put";
	}
	
	
	
}
