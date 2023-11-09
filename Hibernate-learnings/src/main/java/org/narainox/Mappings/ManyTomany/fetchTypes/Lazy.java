package org.narainox.Mappings.ManyTomany.fetchTypes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.narainox.Mappings.Answer;
import org.narainox.Mappings.Question;

public class Lazy {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();

        Question q=session.get(Question.class,502);

        System.out.println(q.getQuestion_id());
        System.out.println(q.getQuestion());


//        System.out.println(q.getAnswers());

        //Lazy Loading
//        System.out.println(q.getAnswers()
//                .size());



        sessionFactory.close();
    }
}
