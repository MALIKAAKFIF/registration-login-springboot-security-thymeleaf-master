package com.example.registrationlogindemo.dto;

public class DossierDTO {
    private String nom;
    private String ville;
    private String email;
    private int codePostal;
    private int numTelephone;
    private double revenuMensuel;
    private String cheminDocumentAttestationSalaire;
    private String cheminDocumentBulletinPaie;
    private String cheminDocumentDeuxiemeBulletinPaie;
    private String cheminDocumentCinRecto;
    private String cheminDocumentCinVerso;

    public DossierDTO() {
    }

    public DossierDTO(String nom, String ville, String email, int codePostal, int numTelephone, double revenuMensuel, String cheminDocumentAttestationSalaire, String cheminDocumentBulletinPaie, String cheminDocumentDeuxiemeBulletinPaie, String cheminDocumentCinRecto, String cheminDocumentCinVerso) {
        this.nom = nom;
        this.ville = ville;
        this.email = email;
        this.codePostal = codePostal;
        this.numTelephone = numTelephone;
        this.revenuMensuel = revenuMensuel;
        this.cheminDocumentAttestationSalaire = cheminDocumentAttestationSalaire;
        this.cheminDocumentBulletinPaie = cheminDocumentBulletinPaie;
        this.cheminDocumentDeuxiemeBulletinPaie = cheminDocumentDeuxiemeBulletinPaie;
        this.cheminDocumentCinRecto = cheminDocumentCinRecto;
        this.cheminDocumentCinVerso = cheminDocumentCinVerso;
    }

    public DossierDTO(String nom, String ville, String email, int codePostal, int numTelephone, double revenuMensuel) {
        this.nom = nom;
        this.ville = ville;
        this.email = email;
        this.codePostal = codePostal;
        this.numTelephone = numTelephone;
        this.revenuMensuel = revenuMensuel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }

    public double getRevenuMensuel() {
        return revenuMensuel;
    }

    public void setRevenuMensuel(double revenuMensuel) {
        this.revenuMensuel = revenuMensuel;
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
