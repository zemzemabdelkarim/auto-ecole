package com.autoecole.amjalal.controllers;

import com.autoecole.amjalal.models.CandidateModel;
import com.autoecole.amjalal.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getAllCandidates")
    public ArrayList<CandidateModel> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @PostMapping("/addCandidate")
    public String addCandidate(@RequestBody CandidateModel candidate) {
        System.out.println(candidate);
        return "success";
    }

}
