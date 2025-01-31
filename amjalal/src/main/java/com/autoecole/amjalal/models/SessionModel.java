package com.autoecole.amjalal.models;

import java.util.Date;

public class SessionModel {
    private int id;
    private int candidateId;
    private Date date;
    private String time;
    private int numberOfHours;
    private boolean isTest;

    public SessionModel() {
        this.id = -1;
        this.candidateId = -1;
        this.date = null;
        this.time = null;
        this.isTest = false;
    }

    public SessionModel(int id, int candidateId, Date date, String time, int numberOfHours, boolean isTest) {
        this.id = id;
        this.candidateId = candidateId;
        this.date = date;
        this.time = time;
        this.numberOfHours = numberOfHours;
        this.isTest = isTest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public boolean isTest() {
        return isTest;
    }

    public void setTest(boolean test) {
        isTest = test;
    }

}
