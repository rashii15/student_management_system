package edu.RL.controller;

import edu.RL.dto.StudentDto;
import edu.RL.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public String getName(){
        return "student";
    }

    @PostMapping("/add")
    public void addStudent( @RequestBody StudentDto studentDto){
        studentService.addStudent(studentDto);
    }

    @GetMapping("/view")
    public List<StudentDto> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public StudentDto searchById(@PathVariable String studentId){
        return studentService.searchById(studentId);
    }

    @PostMapping("/update")
    public void update(@RequestBody StudentDto updateStudent){
        studentService.update(updateStudent);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        studentService.deleteById(id);
    }

}
