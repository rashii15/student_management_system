package edu.RL.controller;

import edu.RL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentController {
    @Autowired
    StudentService studentService;
}
