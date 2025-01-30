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
        candidates.add(new CandidateModel(1, "abdel karim", "zemzem", "1122334455","21153431","facebook"));
        candidates.add(new CandidateModel(2, "ahmed", "bechikh", "5442688544", "22155225", "hmed facebook"));
        candidateCount = candidates.size();
    }
    public ArrayList<CandidateModel> getAllCandidates() {
        return candidates;
    }

    /*public CandidateModel getFirstCandidate() {
        return candidates.get(0);
    }*/

    public CandidateModel findCandidateById (int id) {
        for (CandidateModel candidate : candidates) {
            if (candidate.getId() == id) {
                return candidate;
            }
        }
        return null;
    }

    public boolean isContained(ArrayList<CandidateModel> list, CandidateModel obj) {
        for (CandidateModel c : list) {
            if (c.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<CandidateModel> searchCandidate (String key) {
        System.out.println("key id : "+key);
        if (key.isEmpty()) {
            return candidates;
        }
        ArrayList<CandidateModel> candidatesFound = new ArrayList<>();
        for (CandidateModel candidate : candidates) {
            if(Integer.toString(candidate.getId()).contains(key)
                    || candidate.getFirstName().contains(key)
                    || candidate.getLastName().contains(key)
                    || candidate.getPhoneNumber().contains(key)
                    ||  candidate.getCin().contains(key)
            ){
                candidatesFound.add(candidate);
            }
        }

        /*for (CandidateModel candidate : candidatesFound) {
            System.out.println("checking Cin");
            if (candidate.getCin().contains(key)){// && !isContained(candidatesFound, candidate)) {
                System.out.println("key found in cin");
                candidatesFound.add(candidate);
            }else {
                System.out.println("key not found in cin");
            }
        }

        for (CandidateModel candidate : candidatesFound) {
            if (candidate.getFirstName().contains(key)){// && !isContained(candidatesFound, candidate)) {
                System.out.println("key found in first name");
                candidatesFound.add(candidate);
            }else {
                System.out.println("key not found in first name");
            }
        }

        for (CandidateModel candidate : candidatesFound) {
            if (candidate.getLastName().contains(key)){// && !isContained(candidatesFound, candidate)) {
                System.out.println("key found in last name");
                candidatesFound.add(candidate);
            }else {
                System.out.println("key not found in last name");
            }
        }


        for (CandidateModel candidate : candidatesFound) {
            if (candidate.getPhoneNumber().contains(key)){// && !isContained(candidatesFound, candidate)) {
                System.out.println("key found in phone number");
                candidatesFound.add(candidate);
            }else{
                System.out.println("key not found in phone number");
            }
        }*/

        return candidatesFound;
    }

    public void add(CandidateModel candidate) {
        candidate.setId(++candidateCount);
        candidates.add(candidate);
    }
}
