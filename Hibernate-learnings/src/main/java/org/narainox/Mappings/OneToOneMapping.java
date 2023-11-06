package org.narainox.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMapping {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //creating Question
        Question question=new Question();
        question.setQuestion_id(502);
        question.setQuestion("What is Java");

        //creating Answer
        Answer answer=new Answer();
        answer.setAnswer_id(34);
        answer.setAnswer("Java is a programming language.");
        answer.setQuestion(question);

        question.setAnswer(answer);

        //Session
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(answer);
        session.save(question);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
