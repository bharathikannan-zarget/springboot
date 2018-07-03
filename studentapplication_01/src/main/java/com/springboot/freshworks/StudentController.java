package com.springboot.freshworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    @Autowired StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.get(id);
    }

}
