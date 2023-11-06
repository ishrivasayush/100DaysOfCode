package org.narainox;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= sessionFactory.openSession();
        //Get-student:106
        Student student = session.get(Student.class, 101);
        System.out.println(student);


        session.close();
        sessionFactory.close();
    }
}
