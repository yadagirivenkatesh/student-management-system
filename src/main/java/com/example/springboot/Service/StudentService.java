package com.example.springboot.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.Entity.Student;


public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteById(Long id);
}
