package com.tka.ECIController;

import com.tka.ECIEntity.Candidate;
import com.tka.ECIService.Service;
import java.util.List;

public class Controller {
    private Service service;

    public Controller() {
        this.service = new Service();
    }

    public List<Candidate> getAllCandidates() {
        System.out.println("Inside Controller: Calling Service...");
        return service.getAllCandidates();
    }
}
