package com.autoecole.amjalal.controllers;

import com.autoecole.amjalal.models.CandidateModel;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class CandidateController {
    public static ArrayList<CandidateModel> candidates = new ArrayList<>();
    public static int candidateCount = 0;

    public CandidateController() {
        super();
        candidates.add(new CandidateModel(++candidateCount, "yes", "1122334455", "1122334455"));
        candidates.add(new CandidateModel(++candidateCount, "no", "1122334455", "1122334455"));
        candidates.add(new CandidateModel(++candidateCount, "wiiw", "1122334455", "1122334455"));
    }

    @RequestMapping("/allCondidates")
    public ArrayList<CandidateModel> getCondidates() {
        return candidates;
    }
}

