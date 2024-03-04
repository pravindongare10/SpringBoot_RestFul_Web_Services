package com.cjc.curd.webapp.main.servicei;

import com.cjc.curd.webapp.main.model.Student;

public interface HomeServicei {
	 public void savedata(Student s);
	 public Student getsingleData(String un,String pass);
	 public Iterable<Student> displayAll();
}
