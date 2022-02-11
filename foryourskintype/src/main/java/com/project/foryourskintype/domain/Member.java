package com.project.foryourskintype.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private String gender;
    @Column(unique = true)
    private String email;
    private String password;
    private String phoneNumber;

    @OneToMany(mappedBy = "member")
    private List<LikedItem> likedItems = new ArrayList<>();

    public Member(String name, String gender, String email, String password, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Member(Long id, String name, String gender, String email, String password, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static Member createNullMember(){
        return new Member("", "", "",
                "", "");
    }

    protected Member(){}

}
