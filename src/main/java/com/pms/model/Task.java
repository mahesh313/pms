package com.pms.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String status;
    private String comments;
    private String issues;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Story story;

    @OneToOne
    private Employee employee;

    public Task() {}

    public Task(String name, String description, String status, String comments, String issues, Date startDate, Date endDate, Story story, Employee employee) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.comments = comments;
        this.issues = issues;
        this.startDate = startDate;
        this.endDate = endDate;
        this.story = story;
        this.employee = employee;
    }

    public Task(int id, String name, String description, String status, String comments, String issues, Date startDate, Date endDate, Story story, Employee employee) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.comments = comments;
        this.issues = issues;
        this.startDate = startDate;
        this.endDate = endDate;
        this.story = story;
        this.employee = employee;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
