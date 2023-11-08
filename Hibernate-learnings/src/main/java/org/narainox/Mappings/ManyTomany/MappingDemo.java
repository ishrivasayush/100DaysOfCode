package org.narainox.Mappings.ManyTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();

        Employee employee1=new Employee();
        Employee employee2=new Employee();

        employee1.setEid(101);
        employee1.setName("Ayush");
        employee2.setEid(102);
        employee2.setName("Abhay");

        Project project1=new Project();
        project1.setPid(501);
        project1.setName("ChatBot");

        Project project2=new Project();
        project2.setPid(502);
        project2.setName("LMS");

        List<Employee> employees=new ArrayList<>();
        List<Project> projects=new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);

        projects.add(project1);
        projects.add(project2);

        employee1.setProjects(projects);
        project2.setEmployees(employees);

        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(employee1);
        session.save(employee2);
        session.save(project1);
        session.save(project2);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }

}
