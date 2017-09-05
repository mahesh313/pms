package com.pms.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String technologies;
    private String status;
    private int numberOfStories;
    private Date startDate;
    private Date endDate;

    @OneToOne
    private Employee employee;

    @OneToMany(mappedBy="project", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Story> stories = new HashSet<Story>();

    public Project() {}

    public Project(String name, String technologies, String status, int numberOfStories, Date startDate, Date endDate, Employee employee, Set<Story> stories) {
        this.name = name;
        this.technologies = technologies;
        this.status = status;
        this.numberOfStories = numberOfStories;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.stories = stories;
    }

    public Project(int id, String name, String technologies, String status, int numberOfStories, Date startDate, Date endDate, Employee employee, Set<Story> stories) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
        this.status = status;
        this.numberOfStories = numberOfStories;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
        this.stories = stories;
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

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public void setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<Story> getStories() {
        return stories;
    }

    public void setStories(Set<Story> stories) {
        this.stories = stories;
    }
}
