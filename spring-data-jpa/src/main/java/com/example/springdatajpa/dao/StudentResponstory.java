package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentResponstory extends JpaRepository<Student,Integer> {
}
