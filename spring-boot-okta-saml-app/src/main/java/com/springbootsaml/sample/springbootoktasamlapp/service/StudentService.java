package com.springbootsaml.sample.springbootoktasamlapp.service;

import java.util.List;

import com.springbootsaml.sample.springbootoktasamlapp.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudentByStudentId(Integer studentId);

	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteByStudentId(Integer studentId);
}
