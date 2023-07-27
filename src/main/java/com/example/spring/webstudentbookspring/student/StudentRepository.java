package com.example.spring.webstudentbookspring.student;

import org.springframework.data.repository.CrudRepository;
public interface StudentRepository  extends CrudRepository <Student,Integer> {
}
