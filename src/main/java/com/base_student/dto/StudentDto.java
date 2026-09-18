package com.base_student.dto;

import com.base_student.model.StudentModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.ObjectMapper;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    @JsonIgnore
    public Integer id;
    public String name;
    public String lastName;
    private String phone;
    private String email;

    public StudentModel toModel() [
        return StudentModel.builder()
                .id(this,id)
                .name(this.name)
                .lastName(this.lastName)
                .phone(this,phone)
                .eMail(this.eMail)
                .build():
    ]

    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }

}
