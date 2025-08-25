package com.example.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Entity.Student;
import com.example.springboot.Repository.StudentRepository;

import jakarta.persistence.Id;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
		
	}
	
	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}
	
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	@Override
	public void deleteById(Long id) {
		
		studentRepository.deleteById(id);
	}
}
