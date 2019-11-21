package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.repository.StudentRepo;
import com.example.demo.student.*;
@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	
	@GetMapping("/student")
	public String shoeHomePage(HttpServletRequest req,HttpServletResponse res)
	{
		return "index";
	}
	@PostMapping("/insertAction")
	public String login(Student stu,Model model) {
  		System.out.println(stu.getName());
		System.out.println(stu.getPass());
		model.addAttribute("stu",stu);
		repo.save(stu);
		return "sucess";
	}
	
	@GetMapping("/view")
	public String login(Model model)
	{
		List<Student> studentList=new ArrayList<Student>();
		studentList=repo.findByName("sarath");	//for getting data as per name
		model.addAttribute("studentList",studentList);
		
		for(Student str:studentList) {
			System.out.println(" "+str);
		}
		
		return "view";
	}
	
}
