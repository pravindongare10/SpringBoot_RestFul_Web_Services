package com.cjc.curd.webapp.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.curd.webapp.main.model.Student;
import com.cjc.curd.webapp.main.repository.HomeRepository;
import com.cjc.curd.webapp.main.servicei.HomeServicei;
@Service
public class HomeServiceimpl implements HomeServicei {
 @Autowired	
 HomeRepository hr;

@Override
public void savedata(Student s) {
	hr.save(s);
	
}

@Override
public Student getsingleData(String un, String pass) {
	
	return hr.findAllByUnameAndPassword(un, pass);
}

@Override
public Iterable<Student> displayAll() {
	
	return hr.findAll();
}



}
