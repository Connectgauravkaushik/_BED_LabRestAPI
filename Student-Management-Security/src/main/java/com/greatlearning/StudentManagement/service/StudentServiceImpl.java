package com.greatlearning.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.StudentManagement.entity.Student;
import com.greatlearning.StudentManagement.repository.StudentRepository;

@Repository
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Transactional
	public Student findById(int theId) {
		Student student = new Student();
		student = studentRepository.findById(theId).get();
		return student;
	}

	@Transactional
	public void save(Student thestudent) {
		studentRepository.save(thestudent);

	}

	@Transactional
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);

	}

}