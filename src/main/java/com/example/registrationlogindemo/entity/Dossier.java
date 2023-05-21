package com.example.registrationlogindemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="dossier")
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String radical;

    @Column(nullable=false)
    private String nom;

    @Column(nullable=false)
    private String ville;

    @Column(nullable=false)
    private int code_postal;

    @Column(nullable=false)
    private String num_telephone;

    @Column(nullable=false)
    private double revenu_mensuel;

    @Column(nullable=false)
    private double montant_credit;

    @Column(nullable=false)
    private double Amount;

    @Column(nullable=false)
    private int duration;

    @Column(nullable=false)
    private String Emploi;

    @Column(nullable=false)
    private double monthlyPayment;

    @Lob
    @Column(nullable = false)
    private String cheminDocumentAttestationSalaire;

    @Lob
    @Column(nullable = false)
    private String cheminDocumentBulletinPaie;

    @Lob
    @Column(nullable = false)
    private String cheminDocumentDeuxiemeBulletinPaie;

    @Lob
    @Column(nullable = false)
    private String cheminDocumentCinRecto;

    @Lob
    @Column(nullable = false)
    private String cheminDocumentCinVerso;





    // Getter et setter pour les propriétés

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getRadical() {
        return radical;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public String getNum_telephone() {
        return num_telephone;
    }

    public double getRevenu_mensuel() {
        return revenu_mensuel;
    }

    public double getMontant_credit() {
        return montant_credit;
    }

    public double getAmount() {
        return Amount;
    }

    public int getDuration() {
        return duration;
    }

    public String getEmploi() {
        return Emploi;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public String getCheminDocumentAttestationSalaire() {
        return cheminDocumentAttestationSalaire;
    }

    public String getCheminDocumentBulletinPaie() {
        return cheminDocumentBulletinPaie;
    }

    public String getCheminDocumentDeuxiemeBulletinPaie() {
        return cheminDocumentDeuxiemeBulletinPaie;
    }

    public String getCheminDocumentCinRecto() {
        return cheminDocumentCinRecto;
    }

    public String getCheminDocumentCinVerso() {
        return cheminDocumentCinVerso;
    }





    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRadical(String radical) {
        this.radical = radical;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public void setNum_telephone(String num_telephone) {
        this.num_telephone = num_telephone;
    }

    public void setRevenu_mensuel(double revenu_mensuel) {
        this.revenu_mensuel = revenu_mensuel;
    }

    public void setMontant_credit(double montant_credit) {
        this.montant_credit = montant_credit;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEmploie(String emploi) {
        this.Emploi = emploi;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public void setCheminDocumentAttestationSalaire(String cheminDocumentAttestationSalaire) {
        this.cheminDocumentAttestationSalaire = cheminDocumentAttestationSalaire;
    }

    public void setCheminDocumentBulletinPaie(String cheminDocumentBulletinPaie) {
        this.cheminDocumentBulletinPaie = cheminDocumentBulletinPaie;
    }

    public void setCheminDocumentDeuxiemeBulletinPaie(String cheminDocumentDeuxiemeBulletinPaie) {
        this.cheminDocumentDeuxiemeBulletinPaie = cheminDocumentDeuxiemeBulletinPaie;
    }

    public void setCheminDocumentCinRecto(String cheminDocumentCinRecto) {
        this.cheminDocumentCinRecto = cheminDocumentCinRecto;
    }

    public void setCheminDocumentCinVerso(String cheminDocumentCinVerso) {
        this.cheminDocumentCinVerso = cheminDocumentCinVerso;
    }




}
