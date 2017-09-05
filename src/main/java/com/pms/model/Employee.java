package com.pms.model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String designation;
    private long contact;
    private String email;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Project project;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Task task;


    public Employee() {}

    public Employee(String name, String designation, long contact, String email, Project project, Task task) {
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.email = email;
        this.project = project;
        this.task = task;
    }

    public Employee(int id, String name, String designation, long contact, String email, Project project, Task task) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.contact = contact;
        this.email = email;
        this.project = project;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}

