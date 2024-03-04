package com.ws.main.service;

import java.util.List;

import com.ws.main.model.Shows;

public interface ShowsService {
	
	public void saveShows(Shows s);

//	public List<Shows> getShowsByName(String name);
//
//	public List<Shows> getShowsByNameAndDate(String name, String date);
//
//	public List<Shows> getShowsByNameAndDateAndTime(String name, String date, String time);

	public List<Shows> getShows();
}
