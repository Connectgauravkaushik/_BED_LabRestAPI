package com.greatlearning.StudentManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.StudentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}