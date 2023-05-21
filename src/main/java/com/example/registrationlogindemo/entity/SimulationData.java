package com.example.registrationlogindemo.entity;

import java.math.BigDecimal;

public class SimulationData {
    private Dossier dossier;
    private double creditAmount;
    private int duration;
    private String emploie;
    private double monthlyPayment;

    // Ajoutez les getters et setters appropriés pour chaque attribut

    public Dossier getDossier() {
        return dossier;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public int getDuration() {
        return duration;
    }

    public String getEmploie() {
        return emploie;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }


    // Ajoutez des constructeurs, méthodes utilitaires, etc. si nécessaire

    public void setDossier(Dossier dossier) {
        this.dossier = dossier;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEmploie(String emploie) {
        this.emploie = emploie;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
