package edu.RL.service;

import edu.RL.dto.StudentDto;
import edu.RL.entity.StudentEntity;
import edu.RL.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(StudentDto studentDto) {
        studentRepository.save(new StudentEntity(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getAddress(),
                studentDto.getDOB(),
                studentDto.getEmail(),
                studentDto.getContact()
        ));
    }


    public List<StudentDto> getAll() {
        List<StudentEntity> getAllDetails = studentRepository.findAll();
        List<StudentDto> students = new ArrayList<>();

        for (StudentEntity studentEntity:getAllDetails){
            students.add(new StudentDto(
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getAddress(),
                    studentEntity.getDOB(),
                    studentEntity.getEmail(),
                    studentEntity.getContact()
            ));
        }
        return students;
    }

    public StudentDto searchById(String studentId) {
        Optional<StudentEntity> byId = studentRepository.findById(studentId);
        StudentEntity studentEntity = byId.get();

        return new StudentDto(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getAddress(),
                studentEntity.getDOB(),
                studentEntity.getEmail(),
                studentEntity.getContact()
        );
    }

    public void update(StudentDto updateStudent) {
        studentRepository.save(new StudentEntity(
                updateStudent.getId(),
                updateStudent.getName(),
                updateStudent.getAddress(),
                updateStudent.getDOB(),
                updateStudent.getEmail(),
                updateStudent.getContact()
        ));
    }
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }
}
