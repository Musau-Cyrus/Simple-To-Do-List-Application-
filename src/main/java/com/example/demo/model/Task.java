package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean completed;

    //Constructor
    public Task(){}

    public Task(String name, boolean completed){
        this.name = name;
        this.completed = completed;
    }

    //Getters and setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean isCompleted(){
        return completed;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
