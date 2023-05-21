package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.dto.CreditSimulationResult;
import com.example.registrationlogindemo.entity.CreditSimulation;
import com.example.registrationlogindemo.service.CreditSimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CreditController {
    @Autowired
    private CreditSimulationService creditSimulationService;

    @GetMapping("/simulate")
    public String showSimulationForm(Model model) {
        model.addAttribute("simulation", new CreditSimulation());
        return "simulate";
    }

    @PostMapping("/simulate")
    public String simulateCredit(@ModelAttribute CreditSimulation simulation, Model model) {
        CreditSimulationResult result = creditSimulationService.calculateTotalAmount(simulation);
        model.addAttribute("simulationResult", result);
        return "simulationResult";
    }
}