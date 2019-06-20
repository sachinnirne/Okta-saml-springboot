package com.springbootsaml.sample.springbootoktasamlapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsaml.sample.springbootoktasamlapp.entity.Student;
import com.springbootsaml.sample.springbootoktasamlapp.repository.StudentRepository;
import com.springbootsaml.sample.springbootoktasamlapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentByStudentId(Integer studentId) {
		return studentRepository.findOne(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.saveAndFlush(student);
	}

	@Override
	public void deleteByStudentId(Integer studentId) {
		studentRepository.delete(studentId);
	}
}
