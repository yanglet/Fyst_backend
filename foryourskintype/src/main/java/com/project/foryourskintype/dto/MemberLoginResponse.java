package com.project.foryourskintype.dto;

import com.project.foryourskintype.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberLoginResponse {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;

    public MemberLoginResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
        this.gender = member.getGender();
        this.email = member.getEmail();
        this.password = member.getPassword();
        this.phoneNumber = member.getPhoneNumber();
    }
}
