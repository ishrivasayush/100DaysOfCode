package org.narainox.Mappings.ManyTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {
    @Id
    private int pid;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public int getPid() {
        return pid;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Project(int pid, String name, List<Employee> employees) {
        this.pid = pid;
        this.name = name;
        this.employees = employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public Project() {
    }
}
