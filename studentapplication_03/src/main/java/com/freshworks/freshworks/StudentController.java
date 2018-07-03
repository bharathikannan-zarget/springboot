package com.freshworks.freshworks;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api(value = "student")
@RestController
@RequestMapping(value = "/student", produces = MediaType.APPLICATION_JSON_VALUE, name="student")
public class StudentController {

    @Autowired StudentService studentService;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public StudentEntity save(@Valid @RequestBody StudentEntity studentEntity) {
        return studentService.save(studentEntity);
    }

    @GetMapping("/{id}")
    public StudentEntity get(@PathVariable("id") int id) {
        return studentService.get(id);
    }

}
