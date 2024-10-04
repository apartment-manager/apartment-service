package com.khaled.rest.webservices.restfulwebservices.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping(path = "view")
    public Student getStudent() {
        return  loadStudent();
    }

    private Student loadStudent() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Student("Hello world");
    }
}
