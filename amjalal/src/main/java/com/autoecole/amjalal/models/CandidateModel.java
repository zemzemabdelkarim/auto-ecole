package com.autoecole.amjalal.models;

public class CandidateModel {

    private int id;
    private String name;
    private String tel;
    private String cin;

    public CandidateModel() {
        this.id = -1;
        this.name = "no condidate";
        this.tel = "no tel";
        this.cin = "no cin";
    }

    public CandidateModel(int id, String name, String tel, String cin) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.cin = cin;
    }

    public CandidateModel(int id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public CandidateModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}