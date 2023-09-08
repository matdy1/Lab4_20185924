package com.example.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    @Column(nullable = false,length = 45)
    private String first_name;

    @Column(nullable = false,length = 45)
    private String last_name;

    @Column(nullable = false,length = 45)
    private String email;

    @Column(nullable = false,length = 45)
    private String phone_number;

    @Column(nullable = false,length = 45)
    private Integer department_id;

    @Column(nullable = false,length = 45)
    private Double salary;

    @Column(nullable = false,length = 45)
    private String hire_date;

    @Column(nullable = false,length = 45)
    private String job_id;

}
