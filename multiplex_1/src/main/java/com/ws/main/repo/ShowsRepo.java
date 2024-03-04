package com.ws.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.main.model.Shows;
@Repository
public interface ShowsRepo extends JpaRepository<Shows,Integer>{
//	public List<Shows> findByName(String name);
//	public List<Shows> findByNameAndDate(String name,String date);
//	public List<Shows> findByNameAndDateAndTime(String name,String date,String time);
}
