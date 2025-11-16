package edu.RL.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class StudentEntity {
    @Id
    private String studentId;
    private String name;
    private String address;
    private LocalDate DOB;
    private String email;
    private String contact;
}
