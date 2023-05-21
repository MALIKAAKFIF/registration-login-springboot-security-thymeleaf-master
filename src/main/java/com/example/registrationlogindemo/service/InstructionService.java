package com.example.registrationlogindemo.service;

import com.example.registrationlogindemo.entity.Dossier;
import com.example.registrationlogindemo.entity.SimulationData;
import com.example.registrationlogindemo.repository.DossierRepository;
import jakarta.annotation.Resource;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Service

public class InstructionService {
    @Autowired
    private DossierRepository dossierRepository;
    @PersistenceContext
    private EntityManager entityManager;


    public Dossier saveDossier(Dossier dossierDTO) {
        Dossier dossier = convertDTOToEntity(dossierDTO);
        return dossierRepository.save(dossier);
    }

    public Dossier getDossierById(Long id) {
        return entityManager.find(Dossier.class, id);
    }

    public List<Dossier> getAllDossiers() {
        return entityManager.createQuery("SELECT d FROM Dossier d", Dossier.class)
                .getResultList();
    }

    private Dossier convertDTOToEntity(Dossier dossierDTO) {
        Dossier dossier = new Dossier();
        dossier.setNom(dossierDTO.getNom());
        dossier.setVille(dossierDTO.getVille());
        dossier.setEmail(dossierDTO.getEmail());
        dossier.setCode_postal(dossierDTO.getCode_postal());
        dossier.setNum_telephone(dossierDTO.getNum_telephone());
        dossier.setRevenu_mensuel(dossierDTO.getRevenu_mensuel());
        dossier.setRadical(dossierDTO.getRadical());
        dossier.setMontant_credit(dossierDTO.getMontant_credit());
        dossier.setCheminDocumentAttestationSalaire(dossierDTO.getCheminDocumentAttestationSalaire());
        dossier.setCheminDocumentBulletinPaie(dossierDTO.getCheminDocumentBulletinPaie());
        dossier.setCheminDocumentDeuxiemeBulletinPaie(dossierDTO.getCheminDocumentDeuxiemeBulletinPaie());
        dossier.setCheminDocumentCinRecto(dossierDTO.getCheminDocumentCinRecto());
        dossier.setCheminDocumentCinVerso(dossierDTO.getCheminDocumentCinVerso());
        dossier.setAmount(dossierDTO.getAmount());
        dossier.setMonthlyPayment(dossierDTO.getMonthlyPayment());
        dossier.setDuration(dossierDTO.getDuration());
        dossier.setEmploie(dossierDTO.getEmploi());
        return dossier;
    }
    public void saveDocument(MultipartFile file, Dossier dossier) throws IOException {


        // Sauvegardez l'entité Dossier dans la base de données
        dossierRepository.save(dossier);
    }

    private String saveDocumentToServer(MultipartFile file, String fileName) throws IOException {
        // Définissez le répertoire de stockage sur le serveur
        String storageDirectory = "./documents";

        // Construisez le chemin complet du fichier
        String filePath = storageDirectory + "/" + fileName;

        // Enregistrez le fichier sur le serveur
        file.transferTo(new File(filePath));

        return filePath;
    }

    

    public String generateUniqueFileName(String originalFileName) {
        String baseName = FilenameUtils.getBaseName(originalFileName);
        String extension = FilenameUtils.getExtension(originalFileName);

        // Générez un nom de fichier unique en ajoutant un timestamp à la base du nom de fichier
        String uniqueFileName = baseName + "_" + System.currentTimeMillis() + "." + extension;

        return uniqueFileName;
    }

}
