package com.autoecole.amjalal.services;

import com.autoecole.amjalal.models.CandidateModel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CandidateService {
    private static ArrayList<CandidateModel> candidates;
    private static int candidateCount;
    public CandidateService() {
        candidates = new ArrayList<>();
        candidates.add(new CandidateModel());
        candidates.add(new CandidateModel());
    }
    public ArrayList<CandidateModel> getAllCandidates() {
        return candidates;
    }

    public CandidateModel getFirstCandidate() {
        return candidates.get(0);
    }

    public CandidateModel findCandidateById (int id) {
        for (CandidateModel candidate : candidates) {
            if (candidate.getId() == id) {
                return candidate;
            }
        }
        return null;
    }

    public void add(CandidateModel candidate) {
        candidate.setId(++candidateCount);
        candidates.add(candidate);
    }
}
