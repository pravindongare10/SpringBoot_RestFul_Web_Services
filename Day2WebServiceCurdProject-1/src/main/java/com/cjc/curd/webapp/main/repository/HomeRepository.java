package com.cjc.curd.webapp.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.curd.webapp.main.model.Student;
@Repository
public interface HomeRepository  extends CrudRepository<Student, Integer> {
	
	public Student findAllByUnameAndPassword(String un,String pass);
}
