package edu.RL.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String id;
    private String name;
    private String address;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate DOB;

    private String email;
    private String contact;
}
