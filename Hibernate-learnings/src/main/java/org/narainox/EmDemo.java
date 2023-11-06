package org.narainox;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Certificate certificate =new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("Three Years");

        Certificate certificate1 =new Certificate();
        certificate1.setCourse("Hibernate");
        certificate1.setDuration("Two Years");


        Student student=new Student();
        student.setId(104);
        student.setName("Ayush Shrivastava");
        student.setCity("Kanpur");
        student.setCertificate(certificate);

        Student student1=new Student();
        student1.setId(105);
        student1.setName("Abhay Shrivastava");
        student1.setCity("Kanpur");
        student1.setCertificate(certificate1);


        session.save(student);
        session.save(student1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
