package com.autoecole.amjalal.models;

import java.util.Date;

public class HourModel {
    private int hourId;
    private int numberOfHours;
    private int candidateId;
    //private String candidateName;
    private Date date;

    public HourModel(int hourId, int numberOfHours, int candidateId, Date date) {
        this.hourId = hourId;
        this.numberOfHours = numberOfHours;
        this.candidateId = candidateId;
        this.date = date;
    }

    public HourModel() {
        this.hourId = -1;
        this.numberOfHours = -1;
        this.candidateId = -1;
        this.date = null;
    }

    public int getHourId() {
        return hourId;
    }

    public void setHourId(int hourId) {
        this.hourId = hourId;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
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

}
