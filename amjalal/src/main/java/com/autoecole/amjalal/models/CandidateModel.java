package com.autoecole.amjalal.models;

public class CandidateModel {
    private int id;
    private String firstName;
    private String lastName;
    private String cin;
    private String phoneNumber;
    private String facebookUrl;

    public CandidateModel(int id, String firstName, String lastName, String cin, String phoneNumber, String facebookUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.phoneNumber = phoneNumber;
        this.facebookUrl = facebookUrl;
    }

    public CandidateModel() {
        this.id = -1;
        this.firstName = "not found";
        this.lastName = "not found";
        this.cin = "not found";
        this.phoneNumber = "not found";
        this.facebookUrl = "not found";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @Override
    public String toString() {
        return "CandidateModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cin='" + cin + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                '}';
    }
}
