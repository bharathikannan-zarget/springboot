package com.freshworks.freshworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired StudentRepository repository;

    @Override public StudentEntity save(StudentEntity student) {
        return repository.save(student);
    }

    @Override public StudentEntity get(long id) {
        Optional<StudentEntity> r = repository.findById(id);
        return r.isPresent() ? r.get() : null;
    }
}
