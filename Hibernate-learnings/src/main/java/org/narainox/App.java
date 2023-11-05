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
        Student student=new Student();
        student.setId(101);
        student.setCity("Delhi");
        student.setName("Ayush");
        System.out.println(student);

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
        currentSession.save(address);
        transaction.commit();

        currentSession.close();

    }
}
