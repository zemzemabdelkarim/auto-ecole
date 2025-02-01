package com.autoecole.amjalal.controllers;

import com.autoecole.amjalal.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionVisualController {
    private final SessionService sessionService;
    @Autowired
    public SessionVisualController(SessionService sService) {
        sessionService = sService;
    }

    @GetMapping("/sessions")
    public String getAllSessions(Model model) {
        model.addAttribute("sessions", sessionService.getAllSessions());
        return "sessions";
    }

}
