package org.narainox;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class  App
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Project Started");
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(sessionFactory);
        
        //creating Student
        Certificate certificate =new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("Three Years");

        Certificate certificate1 =new Certificate();
        certificate1.setCourse("Hibernate");
        certificate1.setDuration("Two Years");


        Student student=new Student();
        student.setId(102);
        student.setName("Ayush Shrivastava");
        student.setCity("Kanpur");
        student.setCertificate(certificate);

        Student student1=new Student();
        student1.setId(103);
        student1.setName("Abhay Shrivastava");
        student1.setCity("Kanpur");
        student1.setCertificate(certificate1);

        //creating Object of Address
        Address address=new Address();
        address.setCity("Kanpur");
        address.setStreet("street1");
        address.setOpen(true);
        address.setAddedDate(new Date());
        address.setX(3.45);

        //Reading File
        FileInputStream fis=new FileInputStream("src/main/java/org/narainox/u.png");

        byte[] data=new byte[fis.available()];
        fis.read(data);
        address.setImage(data);


        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(student);
        currentSession.save(student1);
        transaction.commit();

        currentSession.close();

    }
}
