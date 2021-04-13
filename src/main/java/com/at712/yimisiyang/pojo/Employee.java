package com.at712.yimisiyang.pojo;

import lombok.Data;

import java.util.Date;

@Data

public class Employee {
    private Integer id;
    private String lastname;
    private String email;
    private Integer gender;

    private Deportment deportment;
    private Date birth;
}
