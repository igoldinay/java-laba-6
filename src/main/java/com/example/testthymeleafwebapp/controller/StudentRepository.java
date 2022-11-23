package com.example.testthymeleafwebapp.controller;

import com.example.testthymeleafwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
