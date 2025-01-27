package com.autoecole.amjalal.controllers;

import com.autoecole.amjalal.models.CandidateModel;
import com.autoecole.amjalal.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CandidateVisualController {
    private final CandidateService candidateService;

    @Autowired
    public CandidateVisualController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/showFirstCandidate")
    public String showFirstCandidate(Model model) {
        model.addAttribute("firstCandidate", candidateService.getFirstCandidate());
        return "showFirstCandidate";
    }

    @GetMapping("/candidates")
    public String showCandidates(Model model) {
        model.addAttribute("candidates", candidateService.getAllCandidates());
        return "candidates";
    }

    @GetMapping("/addCandidate")
    public String addCandidate(Model model) {
        model.addAttribute("candidate", new CandidateModel());
        return "addCandidate";
    }

    @PostMapping("/addCandidate")
    public String addCandidate(@ModelAttribute("candidate") CandidateModel candidate) {
        //System.out.println(candidate);
        candidateService.add(candidate);
        return "addCandidate";
    }
}
