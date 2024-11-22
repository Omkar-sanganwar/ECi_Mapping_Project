package com.tka.ECIService;

import com.tka.ECIDao.Dao;
import com.tka.ECIEntity.Candidate;
import java.util.List;

public class Service {
    private Dao dao;

    public Service() {
        this.dao = new Dao();
    }

    public List<Candidate> getAllCandidates() {
        System.out.println("Inside Service: Fetching all candidates...");
        return dao.getAllCandidates();
    }
}
