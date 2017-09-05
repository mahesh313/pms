package com.pms.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String status;
    private int numberOfTasks;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy="story", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Task> tasks = new HashSet<Task>();

    public Story() {}

    public Story(String name, String description, String status, int numberOfTasks, Date startDate, Date endDate, Project project, Set<Task> tasks) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.numberOfTasks = numberOfTasks;
        this.startDate = startDate;
        this.endDate = endDate;
        this.project = project;
        this.tasks = tasks;
    }

    public Story(int id, String name, String description, String status, int numberOfTasks, Date startDate, Date endDate, Project project, Set<Task> tasks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.numberOfTasks = numberOfTasks;
        this.startDate = startDate;
        this.endDate = endDate;
        this.project = project;
        this.tasks = tasks;
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

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
