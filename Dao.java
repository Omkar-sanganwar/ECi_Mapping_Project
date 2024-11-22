package com.tka.ECIDao;

import com.tka.ECIEntity.Candidate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Dao {

    public List<Candidate> getAllCandidates() {
        System.out.println("Inside Dao: Fetching candidates from database...");
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Candidate.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        Query<Candidate> query = session.createQuery("FROM Candidate", Candidate.class);
        List<Candidate> candidates = query.getResultList();
        session.getTransaction().commit();
        session.close();
        factory.close();

        return candidates;
    }
}
