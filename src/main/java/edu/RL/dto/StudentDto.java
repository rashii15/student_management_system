package edu.RL.dto;

import lombok.*;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StudentDto {
    private String studentId;
    private String name;
    private String address;
    private LocalDate DOB;
    private String email;
    private String contact;

}
