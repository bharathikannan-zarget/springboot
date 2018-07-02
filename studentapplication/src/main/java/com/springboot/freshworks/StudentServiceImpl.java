package com.springboot.freshworks;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override public Student get(int id) {
        Student student = new Student();
        student.setEmail("bharathi.kannan@freshworks.com");
        student.setName("kannan");
        student.setAge("23");
        return student;
    }
}
