package com.example.registrationlogindemo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
public class CreditSimulation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double amount;
    private int duration;
    // zidi douk les params dialk
    // Getters and setters

private String emploie;
    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEmploie() {
        return emploie;
    }

    public void setEmploie(String emploie) {
        this.emploie = emploie;
    }
}