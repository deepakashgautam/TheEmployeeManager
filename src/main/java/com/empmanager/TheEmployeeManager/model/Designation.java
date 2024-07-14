package com.empmanager.TheEmployeeManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Designation {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;
      private String name;

}
