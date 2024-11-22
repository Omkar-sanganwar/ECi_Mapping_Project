package com.tka.ECIClient;

import com.tka.ECIController.Controller;
import com.tka.ECIEntity.Candidate;
import java.util.List;

public class ECIClient {
    public static void main(String[] args) {
        System.out.println("Inside ECIClient: Fetching Candidates...");

        Controller controller = new Controller();
        List<Candidate> candidates = controller.getAllCandidates();

        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
}
