package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.student.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{  //bean class name and type of primary key

	List<Student> findByName(String name);
	
	
}
