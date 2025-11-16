package edu.RL.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StudentDto {
    private String id;
    private String name;
    private String address;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate DOB;
    private String email;
    private String contact;

}
