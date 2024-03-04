package com.cjc.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
@RestController
public class HomeController {
	

	@GetMapping("/")
	public String Prelogin() {
		
		return "Nk";
	}
	
	@GetMapping("/getSt")
	public Student getStudent() {
		Student s=new Student();
		s.setSid("1");
		s.setSname("Pravin");
		s.setMobno("45678");
		s.setAddr("pune");
		return s;
	}
	
	@PostMapping("/save")
	public String saveSt(@RequestBody Student st) {
	
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getMobno());
		System.out.println(st.getAddr());
		return "saved";
}
	@PostMapping("/listst")
	public String listStudent(@RequestBody List<Student> s) {
		
		for (Student stu : s) {
			System.out.println(stu.getSid());
			System.out.println(stu.getSname());
			System.out.println(stu.getMobno());
			System.out.println(stu.getAddr());
		}
		return "saved list";
	}

}