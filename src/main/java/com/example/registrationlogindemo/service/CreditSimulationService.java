package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.dto.CreditSimulationResult;
import com.example.registrationlogindemo.entity.CreditSimulation;
import org.springframework.stereotype.Service;

@Service
public class CreditSimulationService {
    public CreditSimulationResult calculateTotalAmount(CreditSimulation simulation) {
        // la logique pour déterminer les facteurs basés sur l'emploi de l'utilisateur
        double employmentFactor = 1.0;
        if (simulation.getEmploie().equals("Commerçant")) {
            employmentFactor = 0.9;
        } else if (simulation.getEmploie().equals("Artisan")) {
            employmentFactor = 1.1;
        }

        // Calcul du montant du prêt en utilisant le facteur d'emploi
        double loanAmount = simulation.getAmount() * employmentFactor;

        // Calcul de la mensualité
        double interestRate = 0.05; // Taux d'intérêt annuel de 5%
        double monthlyInterestRate = interestRate / 12.0;
        int totalMonths = simulation.getDuration() * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalMonths));

        CreditSimulationResult result = new CreditSimulationResult();
        result.setCreditAmount(loanAmount);
        result.setDuration(simulation.getDuration());
        result.setEmploie(simulation.getEmploie());
        result.setMonthlyPayment(monthlyPayment);
        return result;
    }
}
