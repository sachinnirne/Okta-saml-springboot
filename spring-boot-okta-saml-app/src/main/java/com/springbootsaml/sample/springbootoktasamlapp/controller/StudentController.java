package com.springbootsaml.sample.springbootoktasamlapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsaml.sample.springbootoktasamlapp.entity.Student;
import com.springbootsaml.sample.springbootoktasamlapp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	
	@GetMapping("/")
	public String studentTest() {
		return "Hello Pong";
	}
	
	@GetMapping("student/{studentId}")
	public Student getStudentByStudentId(@PathVariable("studentId") Integer studentId) {
		return studentService.getStudentByStudentId(studentId);
	}

	@GetMapping("students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("student/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PostMapping("student/update/{studentId}")
	public Student saveStudent(@PathVariable() Integer stduentId, @RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@DeleteMapping("/{studentId}")
	public void deleteStudent(@PathVariable("studentId") Integer studentId) {
		studentService.deleteByStudentId(studentId);
	}

}
