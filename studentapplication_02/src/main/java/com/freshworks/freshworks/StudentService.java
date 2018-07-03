package com.freshworks.freshworks;

public interface StudentService {

    StudentEntity save(StudentEntity student);

    StudentEntity get(long id);

}
