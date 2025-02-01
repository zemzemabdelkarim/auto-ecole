package com.autoecole.amjalal.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SessionModel {
    private int id;
    private int candidateId;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date date;
    private int numberOfHours;
    private boolean isTest;

    public SessionModel() {
        this.id = -1;
        this.candidateId = -1;
        this.date = null;
        this.isTest = false;
    }

    public SessionModel(int id, int candidateId, Date date, String time, int numberOfHours, boolean isTest) {
        this.id = id;
        this.candidateId = candidateId;
        this.date = date;
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



    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public boolean getIsTest() {
        return isTest;
    }

    public void setIsTest(boolean test) {
        isTest = test;
    }

    public String toString() {
        return "Session : { id = " + id + ", candidateId = " + candidateId + ", date = " + date +
                ", numberOfHours = " + numberOfHours + ", isTest = " + isTest + " }";
    }
}
