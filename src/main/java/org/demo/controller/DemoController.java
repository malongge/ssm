package org.demo.controller;

import org.demo.bean.Student;
import org.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@PathVariable(value = "id") int id) {
        return Optional.ofNullable(studentService.getStudentById(id)).map(Student::getName).orElse("not found: " + String.valueOf(id));
    }
}
