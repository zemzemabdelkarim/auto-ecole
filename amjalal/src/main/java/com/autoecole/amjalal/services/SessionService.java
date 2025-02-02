package com.autoecole.amjalal.services;

import com.autoecole.amjalal.models.SessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class SessionService {
    private final CandidateService candidateService;
    private static ArrayList<SessionModel> sessions = new ArrayList<>();
    private static int sessionsCount = 0;

    @Autowired
    public SessionService(CandidateService candidateService) {
        this.candidateService = candidateService;
        sessions.add(new SessionModel(1, 1, new Date(), "11:30", 2, false));
        sessions.add(new SessionModel(2, 2, new Date(), "12:30", 2, false));
        sessionsCount = 2;
    }

    public ArrayList<SessionModel> getAllSessions() {
        return sessions;
    }

    public SessionModel getSessionById(int id) {
        for (SessionModel session : sessions) {
            if (session.getId() == id) {
                return session;
            }
        }
        return null;
    }

    public ArrayList<SessionModel> getSessionsByCandidateId(int id) {
        ArrayList<SessionModel> sessionsByCandidateId = new ArrayList<>();
        for (SessionModel session : sessions) {
            if (session.getCandidateId() == id) {
                sessionsByCandidateId.add(session);
            }
        }
        return sessionsByCandidateId;
    }

    public ArrayList<SessionModel> getSessionsByDate(Date date) {
        ArrayList<SessionModel> sessionsByDate = new ArrayList<>();
        for (SessionModel session : sessions) {
            if (session.getDate().equals(date)) {
                sessionsByDate.add(session);
            }
        }
        return sessionsByDate;
    }

    public void addSession(SessionModel session) {
        if (candidateService.findCandidateById(session.getCandidateId()) != null) {
            session.setId(++sessionsCount);
            sessions.add(session);
        }
    }

    public void deleteSessionById(int id) {
        for (SessionModel session : sessions) {
            if (session.getId() == id) {
                sessions.remove(session);
            }
        }
    }

}
