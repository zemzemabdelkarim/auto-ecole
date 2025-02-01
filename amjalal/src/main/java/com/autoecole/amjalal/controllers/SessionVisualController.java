package com.autoecole.amjalal.controllers;

import com.autoecole.amjalal.models.SessionModel;
import com.autoecole.amjalal.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/addSession")
    public String addSession(Model model) {
        model.addAttribute("s", new SessionModel(0,0,null,null,0,false));
        return "addSession";
    }

    @PostMapping("/addSession")
    public void addSession(@ModelAttribute("s") SessionModel session) {
        System.out.println(session);
        sessionService.addSession(session);
        //return "addSession";
    }

}
