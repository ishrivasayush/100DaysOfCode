package org.narainox.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMapping {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //creating Question
        Question question=new Question();
        question.setQuestion_id(502);
        question.setQuestion("What is Java");

        //creating Answer
        Answer answer1=new Answer();
        answer1.setAnswer_id(34);
        answer1.setAnswer("Java is a programming language.");
        answer1.setQuestion(question);

        Answer answer2=new Answer();
        answer2.setAnswer_id(35);
        answer2.setAnswer("Java is a programming language.");
        answer2.setQuestion(question);

        Answer answer3=new Answer();
        answer3.setAnswer_id(36);
        answer3.setAnswer("Java is a programming language.");
        answer3.setQuestion(question);

        Answer answer4=new Answer();
        answer4.setAnswer_id(37);
        answer4.setAnswer("Java is a programming language.");
        answer4.setQuestion(question);

        List<Answer> list=new ArrayList<>();
        list.add(answer1);
        list.add(answer2);
        list.add(answer3);
        list.add(answer4);


        question.setAnswers(list);


        //Session
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(question);
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);
        session.save(answer4);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
