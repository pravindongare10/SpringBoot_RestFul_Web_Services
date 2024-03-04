package com.ws.main.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ws.main.model.Shows;
import com.ws.main.service.ShowsService;

@RestController
public class ShowsController {
	@Autowired
	ShowsService ss;
	
	@PostMapping("/save")
	public String saveData(@RequestBody Shows s) {
		ss.saveShows(s);
		return "save";
	}
	@GetMapping("/get3/{name}")
	public List<Shows> getData(@PathVariable String name){
		List<Shows> list = ss.getShows().stream()
				.filter(show->show.getName().equals(name))
				.collect(Collectors.toList())
				;
		return list;
	}
	
	@GetMapping("/get3/{name}/{date}")
	public List<Shows> getData(@PathVariable String name,@PathVariable String date){
		List<Shows> list = ss.getShows().stream()
				.filter(show->show.getName().equals(name))
				.filter(show->show.getDate().equals(date))
				.collect(Collectors.toList());		
		return list;
	}
	
	@GetMapping("/get3/{name}/{date}/{time}")
	public List<Shows> getData(@PathVariable String name,@PathVariable String date,@PathVariable String time){
		List<Shows> list = ss.getShows().stream()
				.filter(show->show.getName().equals(name))
				.filter(show->show.getDate().equals(date))
				.filter(show->show.getTime().equals(time))
				.collect(Collectors.toList());
		return list;
	}
	
	

}
