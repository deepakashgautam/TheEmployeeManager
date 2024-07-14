package com.empmanager.TheEmployeeManager.model;

import jakarta.persistence.*;

@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
}
