package com.ws.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ws.main.model.Shows;
@CrossOrigin
@RestController
public class ShowsComtroller {
	@Autowired
	RestTemplate rt;

	@GetMapping("/getconsume/{name}")
	public List<List<Shows>> getData(@PathVariable String name){
		List<List<Shows>> mainlist=new ArrayList<>();
  
		String url="http://localhost:9999/get/"+name;
		List<Shows> list = rt.getForObject(url,List.class);
		
		String url2="http://localhost:9998/get2/"+name;
		List<Shows> list2 = rt.getForObject(url2,List.class);
		
		String url3="http://localhost:9997/get3/"+name;
		List<Shows> list3 = rt.getForObject(url3,List.class);
		mainlist.add(list);
		mainlist.add(list2);
		mainlist.add(list3);
		
		
		return mainlist;
	}
	
	@GetMapping("/getconsume/{name}/{date}")
	public List<List<Shows>> getData(@PathVariable String name,@PathVariable String date){
		List<List<Shows>> mainlist=new ArrayList<>();
		String url="http://localhost:9999/get/"+name+"/"+date;
		List<Shows> list = rt.getForObject(url,List.class);
		
		String url2="http://localhost:9998/get/"+name+"/"+date;
		List<Shows> list2 = rt.getForObject(url2,List.class);
		
		String url3="http://localhost:9997/get/"+name+"/"+date;
		List<Shows> list3 = rt.getForObject(url3,List.class);
		
		mainlist.add(list);
		mainlist.add(list2);
		mainlist.add(list3);
		
		
		return mainlist;
	}
	
	@GetMapping("/getconsume/{name}/{date}/{time}")
	public List<List<Shows>> getData(@PathVariable String name,@PathVariable String date,@PathVariable String time){
		List<List<Shows>> mainlist=new ArrayList<>();
		String url="http://localhost:9999/get/"+name+"/"+date+"/"+time;
		List<Shows> list = rt.getForObject(url,List.class);
		
		String url2="http://localhost:9998/get/"+name+"/"+date+"/"+time;
		List<Shows> list2 = rt.getForObject(url2,List.class);
		
		String url3="http://localhost:9997/get/"+name+"/"+date+"/"+time;
		List<Shows> list3 = rt.getForObject(url3,List.class);
		
		return mainlist;
	}
	
	

}
