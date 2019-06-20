package com.springbootsaml.sample.springbootoktasamlapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootsaml.sample.springbootoktasamlapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
