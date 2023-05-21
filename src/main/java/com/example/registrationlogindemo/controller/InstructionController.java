package com.example.registrationlogindemo.controller;

import com.example.registrationlogindemo.entity.Dossier;
import com.example.registrationlogindemo.entity.User;
import com.example.registrationlogindemo.service.InstructionService;
import com.example.registrationlogindemo.util.FileUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import java.security.Principal;


@Controller
public class InstructionController {
    @Autowired
    private InstructionService instructionService;
    @Autowired
    private CacheManager cacheManager;


    @GetMapping("/instruction")
    public String showInstructionForm(Model model) {
        model.addAttribute("dossier", new Dossier());
        return "instruction";
    }

    @PostMapping("/instruction")
    public String processInstructionForm(@ModelAttribute Dossier dossier,
                                         @RequestParam("attestation_salaire") MultipartFile attestationSalaire,
                                         @RequestParam("bulletin_paie_mois_dernier") MultipartFile bulletinPaieMoisDernier,
                                         @RequestParam("deuxieme_bulletin_paie_mois_dernier") MultipartFile deuxiemeBulletinPaieMoisDernier,
                                         @RequestParam("cin_recto") MultipartFile cinRecto,
                                         @RequestParam("cin_verso") MultipartFile cinVerso,
                                         @RequestParam("amount") String amount,
                                         @RequestParam("duration") String duration,
                                         @RequestParam("emploie") String emploie,
                                         @RequestParam("monthlyPayment") String monthlyPayment) {
        // Traitez les valeurs des nouveaux champs et effectuez les opérations nécessaires
        dossier.setAmount(Double.parseDouble(amount));
        dossier.setDuration(Integer.parseInt(duration));
        dossier.setEmploie(emploie);
        dossier.setMonthlyPayment(Double.parseDouble(monthlyPayment));




        String utilisateur = dossier.getNom();
        String path = "C:\\CIH_DB\\registration-login-springboot-security-thymeleaf-master\\documents\\" + utilisateur + "\\";



        if (!attestationSalaire.isEmpty()) {
            try {
                String fileName = instructionService.generateUniqueFileName(attestationSalaire.getOriginalFilename());

                String filePath = path + fileName;
                FileUtil.createDirectoryIfNotExists(path);
                FileUtil.saveFile(attestationSalaire, path, fileName);
                dossier.setCheminDocumentAttestationSalaire(filePath);
            } catch (IOException e) {
                // Gérer l'erreur de traitement du fichier
            }
        }

        if (!bulletinPaieMoisDernier.isEmpty()) {
            try {
                String fileName = instructionService.generateUniqueFileName(bulletinPaieMoisDernier.getOriginalFilename());

                String filePath = path + fileName;
                FileUtil.createDirectoryIfNotExists(path);
                FileUtil.saveFile(bulletinPaieMoisDernier, path, fileName);
                dossier.setCheminDocumentBulletinPaie(filePath);
            } catch (IOException e) {
                // Gérer l'erreur de traitement du fichier
            }
        }

        if (!deuxiemeBulletinPaieMoisDernier.isEmpty()) {
            try {
                String fileName = instructionService.generateUniqueFileName(deuxiemeBulletinPaieMoisDernier.getOriginalFilename());
                String filePath = path + fileName;
                FileUtil.createDirectoryIfNotExists(path);
                FileUtil.saveFile(deuxiemeBulletinPaieMoisDernier, path, fileName);
                dossier.setCheminDocumentDeuxiemeBulletinPaie(filePath);
            } catch (IOException e) {
                // Gérer l'erreur de traitement du fichier
            }
        }

        if (!cinRecto.isEmpty()) {
            try {
                String fileName = instructionService.generateUniqueFileName(cinRecto.getOriginalFilename());
                String filePath = path + fileName;
                FileUtil.createDirectoryIfNotExists(path);
                FileUtil.saveFile(cinRecto, path, fileName);
                dossier.setCheminDocumentCinRecto(filePath);
            } catch (IOException e) {
                // Gérer l'erreur de traitement du fichier
            }
        }


        if (!cinVerso.isEmpty()) {
            try {
                String fileName = instructionService.generateUniqueFileName(cinVerso.getOriginalFilename());
                String filePath = path + fileName;
                FileUtil.createDirectoryIfNotExists(path);
                FileUtil.saveFile(cinVerso, path, fileName);
                dossier.setCheminDocumentCinVerso(filePath);
            } catch (IOException e) {
                // Gérer l'erreur de traitement du fichier
            }
        }

        instructionService.saveDossier(dossier);

        return "instructionResult";
    }

}