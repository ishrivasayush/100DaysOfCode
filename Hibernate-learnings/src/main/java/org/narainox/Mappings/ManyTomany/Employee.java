package org.narainox.Mappings.ManyTomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    private int eid;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "employee_Learning",
            joinColumns = {@JoinColumn(name ="eid")},
            inverseJoinColumns = {@JoinColumn(name = "pid")}
    )
    private List<Project> projects;

    public Employee() {
    }

    public Employee(int eid, String name, List<Project> projects) {
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }

    public List<Project> getProjects() {

        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
