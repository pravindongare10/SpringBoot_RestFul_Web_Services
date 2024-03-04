package com.ws.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.main.model.Shows;
import com.ws.main.repo.ShowsRepo;
import com.ws.main.service.ShowsService;
@Service
public class ShowsServiceImpl implements ShowsService {
	@Autowired
	ShowsRepo sr;
	
	@Override
	public void saveShows(Shows s) {
		sr.save(s);
	}

	@Override
	public List<Shows> getShows() {
		return sr.findAll();
	}

//	@Override
//	public List<Shows> getShowsByName(String name) {
//		
//		return sr.findByName(name);
//	}
//
//	@Override
//	public List<Shows> getShowsByNameAndDate(String name, String date) {
//		
//		return sr.findByNameAndDate(name, date);
//	}
//
//	@Override
//	public List<Shows> getShowsByNameAndDateAndTime(String name, String date, String time) {
//		
//		return sr.findByNameAndDateAndTime(name, date, time);
//	}

}
