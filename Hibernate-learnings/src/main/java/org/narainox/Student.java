package org.narainox;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String city;

    @Embedded
    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public Student(int id, String name, String city, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certificate = certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student() {
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
}
