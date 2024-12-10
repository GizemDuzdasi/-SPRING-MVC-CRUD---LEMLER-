package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lname;
    private int stnumber;
    private String bolum;
    public Student()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(Long id,String name,String lname,int stnumber,String bolum)
    {
        super();
        this.id = id;
        this.name = name;
        this.lname= lname;
        this.stnumber = stnumber;
        this.bolum = bolum;
    }
    public Long getId() {
      return id; 
    }
    public void setId(Long id) {
      this.id = id; 
    }
    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getStnumber() {
        return stnumber;
    }

    public void setStnumber(int stnumber) {
        this.stnumber = stnumber;
    }

    public String getBolum()
    {
        return bolum;
    }
    public void setBolum(String bolum)
    {
        this.bolum = bolum;
    }
}